package com.kiksoft.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class InventoryPage extends BasePage {

    public Locator itemListContainers;

    public InventoryPage(Page page) {
        super(page);

        this.itemListContainers = page.locator(".inventory_list");
    }
}
