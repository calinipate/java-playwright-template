package com.kiksoft.page;

import com.kiksoft.component.HeaderComponent;
import com.microsoft.playwright.Page;

public abstract class BasePage {
    protected final Page page;

    public HeaderComponent headerComponent;

    protected BasePage(Page page) {
        this.page = page;

        this.headerComponent = new HeaderComponent(page);
    }
}
