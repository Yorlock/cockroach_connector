
/* *************************************************** */
/*                                                     */
/* (C) Copyright IBM Corp. 2022                        */
/*                                                     */
/* *************************************************** */
package com.ibm.connect.sdk.bundle;

import java.sql.Connection;

import org.apache.arrow.flight.FlightClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.ibm.connect.sdk.jdbc.derby.DerbyDatasourceType;
import com.ibm.connect.sdk.test.jdbc.derby.DerbyTestSuite;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionProperties;

/**
 * Tests the Apache Derby connector in a bundle of multiple connectors.
 */

public class TestBundleFlightProducerDerby extends DerbyTestSuite {
    private static final String DATASOURCE_TYPE_NAME = DerbyDatasourceType.DATASOURCE_TYPE_NAME;

    private static BundleTestEnvironment testEnvironment;

    /**
     * Setup before tests.
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpOnce() throws Exception {
        testEnvironment = BundleTestEnvironment.getInstance();
    }

    /**
     * Cleanup after tests.
     */
    @AfterClass
    public static void tearDownOnce() {
        testEnvironment.release();
    }

    @Override
    protected FlightClient getClient() {
        return testEnvironment.getClient();
    }

    @Override
    protected String getDatasourceTypeName() {
        return DATASOURCE_TYPE_NAME;
    }

    @Override
    protected ConnectionProperties createConnectionProperties() {
        return testEnvironment.createDerbyConnectionProperties();
    }

    @Override
    protected Connection getConnection() {
        return testEnvironment.getConnection();
    }
}