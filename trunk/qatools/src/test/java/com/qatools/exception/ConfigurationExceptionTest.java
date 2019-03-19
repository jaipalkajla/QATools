package com.qatools.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qatools.exception.ConfigurationException;

/**
 * The class <code>ConfigurationExceptionTest</code> contains tests for the class <code>{@link ConfigurationException}</code>.
 *
 * @generatedBy CodePro at 9/11/13 11:14 AM
 * @author vsha28
 * @version $Revision: 1.0 $
 */
public class ConfigurationExceptionTest {
	/**
	 * Run the ConfigurationException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/11/13 11:14 AM
	 */
	@Test
	public void testConfigurationException_1()
		throws Exception {
		String message = "";

		ConfigurationException result = new ConfigurationException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.qatools.exception.ConfigurationException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the ConfigurationException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/11/13 11:14 AM
	 */
	@Test
	public void testConfigurationException_2()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		ConfigurationException result = new ConfigurationException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("com.qatools.exception.ConfigurationException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/11/13 11:14 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 9/11/13 11:14 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 9/11/13 11:14 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConfigurationExceptionTest.class);
	}
}