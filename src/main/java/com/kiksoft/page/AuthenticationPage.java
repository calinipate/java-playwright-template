package com.kiksoft.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AuthenticationPage {
    private final Locator usernameInput;
    private final Locator passwordInput;
    private final Locator authenticateButton;

    public AuthenticationPage(Page page) {
        this.usernameInput      = page.locator("#user-name");
        this.passwordInput      = page.locator("#password");
        this.authenticateButton = page.locator("#login-button");
    }

    public void fillLoginDetails(String username, String password) {
        fillUsername(username);
        fillPassword(password);
    }

    public void clickAuthenticateButton() {
        authenticateButton.click();
    }

    private void fillUsername(String username) {
        usernameInput.type(username);
    }

    private void fillPassword(String password) {
        passwordInput.fill(password);
    }
}
