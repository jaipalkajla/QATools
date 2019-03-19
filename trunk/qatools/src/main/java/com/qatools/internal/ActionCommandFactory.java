package com.qatools.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qatools.exception.ToolRuntimeException;

/**
 */
public final class ActionCommandFactory {

    /**
     * Map to hold command name and command object.
     */
    private static Map<String, ActionCommand> commands
                            = new HashMap<String, ActionCommand>();

    /**
     * Slf4j Logger instance.
     */
    private static final Logger LOG = LoggerFactory
            .getLogger(ActionCommandFactory.class);

    /**
     * private default Constructor.
     */
    private ActionCommandFactory() {
        throw new ToolRuntimeException(
                "Cannot instantiate ActionCommandFactory");
    }

    static {

        final Reflections reflections = new Reflections("com");

        Set<Class<?>> subTypes = reflections
                .getTypesAnnotatedWith(AutomationCommand.class);

        for (Class<?> class1 : subTypes) {
            String commandName = class1.getAnnotation(AutomationCommand.class)
                    .name();

            try {
                if (StringUtils.isBlank(commandName)) {
                    throw new ToolRuntimeException(
                            "Error while registering command. "
                                    + "commandName is not provided");
                } else if (getActionCommand(commandName) != null) {
                    throw new ToolRuntimeException(
                            "Error while registering command. "
                                    + "command with same name already"
                                    + " registered");
                }

                ActionCommand unregisteredCommand = (ActionCommand) class1
                        .newInstance();

                commands.put(commandName.trim().toUpperCase(),
                        unregisteredCommand);
                LOG.info("Command Registered.........  " + commandName);
            } catch (Exception e) {
                LOG.error("Exception occurred in registering command "
                        + commandName, e);
            }
        }
    }

    /**
     * Method getActionCommand.
     *
     * @param command
     *            Command Name String
     * @return ActionCommand Command Object
     */
    public static ActionCommand getActionCommand(final String command) {
        return commands.get(command.trim().toUpperCase());
    }

    /**
     * Method registerActionCommand.
     *
     * @param commandName
     *            String
     * @param command
     *            ActionCommand
     * @return ActionCommand
     */
    public static ActionCommand registerActionCommand(final String commandName,
            final ActionCommand command) {
        if (StringUtils.isBlank(commandName) || command == null) {
            throw new ToolRuntimeException("Error while registering command. "
                    + "commandName or command is null");
        } else if (getActionCommand(commandName) != null) {
            throw new ToolRuntimeException("Error while registering command. "
                    + "command already registered");
        }
        return commands.put(commandName.trim().toUpperCase(), command);
    }
}
