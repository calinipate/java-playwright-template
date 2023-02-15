package com.kiksoft.test;

import com.microsoft.playwright.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

@Listeners({TestListener.class})
public abstract class BaseTest {

    static Playwright playwright;
    static Browser    browser;

    public BrowserContext context;
    public Page           page;
    public Dotenv         dotenv;

    public BaseTest() {
        dotenv = Dotenv.load();
    }

    @BeforeSuite(alwaysRun = true)
    protected void launchBrowser() {
        playwright = Playwright.create();
        ArrayList<String> args = new ArrayList<>();
        args.add("--start-maximized");
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(args));
    }

    @AfterSuite
    protected void closeBrowser() {
        playwright.close();
    }

    @BeforeMethod(alwaysRun = true)
    protected void createPage(Method method) {
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page    = context.newPage();
    }

    @AfterMethod
    protected void closePage(Method method, ITestResult result) {
        context.close();
    }
}
