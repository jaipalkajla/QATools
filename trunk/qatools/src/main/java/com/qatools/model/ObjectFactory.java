//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 11:55:36 AM IST 
//

package com.qatools.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.qatools.xml.model package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName AUTOMATION_TEST_SUIT_QNAME = new QName("",
            "automationTestSuite");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.qatools.xml.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutomationTestSuite }
     * 
     */
    public final AutomationTestSuite createAutomationTestSuite() {
        return new AutomationTestSuite();
    }

    /**
     * Create an instance of {@link ModelConstants }
     * 
     */
    public final ModelConstants createModelConstants() {
        return new ModelConstants();
    }

    /**
     * Create an instance of {@link TestStatus }
     * 
     */
    public final TestStatus createTestStatus() {
        return new TestStatus();
    }

    /**
     * Create an instance of {@link AutomationTestCaseStep }
     * 
     */
    public final AutomationTestCaseStep createAutomationTestCaseStep() {
        return new AutomationTestCaseStep();
    }

    /**
     * Create an instance of {@link AutomationTestCase }
     * 
     */
    public final AutomationTestCase createAutomationTestCase() {
        return new AutomationTestCase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link AutomationTestSuite }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "", name = "automationTestSuite")
    public final JAXBElement<AutomationTestSuite> createAutomationTestSuite(
            final AutomationTestSuite value) {
        return new JAXBElement<AutomationTestSuite>(AUTOMATION_TEST_SUIT_QNAME,
                AutomationTestSuite.class, null, value);
    }

}
