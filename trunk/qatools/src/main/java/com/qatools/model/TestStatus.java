package com.qatools.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.apache.commons.lang.StringUtils;

/**
 * Bean to represent test status.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TestStatus {

    /**
     * Status of test case.
     */
    private ValidTestStatus status = ValidTestStatus.NOT_RUN;
    /**
     * Status description.
     */
    private String statusDesc = StringUtils.EMPTY;

    /**
     * Default constructir.
     */
    public TestStatus() {
    }

    /**
     * Constructor.
     * 
     * @param status
     * @param statusDesc
     */
    public TestStatus(final ValidTestStatus status, final String statusDesc) {
        super();
        this.status = status;
        this.statusDesc = statusDesc;
    }

    /**
     * Method getStatus.
     * 
     * @return ValidTestStatus
     */
    public final ValidTestStatus getStatus() {
        return status;
    }

    /**
     * Method setStatus.
     * 
     * @param status
     *            ValidTestStatus
     */
    /**
     * @param testStatus
     *            status of test
     */
    public final void setStatus(final ValidTestStatus testStatus) {
        this.status = testStatus;
    }

    /**
     * Method getStatusDesc.
     * 
     * @return String
     */
    public final String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Method setStatusDesc.
     * 
     * @param testStatusDesc
     *            description of status
     */
    public final void setStatusDesc(final String testStatusDesc) {
        this.statusDesc = testStatusDesc;
    }

    /**
     * Method toString.
     * 
     * @return String
     */
    @Override
    public final String toString() {
        return "TestStatus [status=" + status + ", statusDesc=" + statusDesc
                + "]";
    }
}
