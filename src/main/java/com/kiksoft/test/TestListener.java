package com.kiksoft.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private static final Logger Logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        Logger.info("Starting Test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logger.info("Test " + result.getName() + " PASSED!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logger.error("Test " + result.getName() + " FAILED!");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Logger.error("Test " + result.getName() + " SKIPPED!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // n/a
    }

    @Override
    public void onStart(ITestContext context) {
        // n/a
    }

    @Override
    public void onFinish(ITestContext context) {
        // n/a
    }
}
