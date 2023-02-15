package com.kiksoft.component;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HeaderComponent extends BaseComponent {

    public Locator mainLogo;

    public HeaderComponent(Page page) {
        super(page);

        this.mainLogo = page.locator(".app_logo");
    }
}
