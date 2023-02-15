package com.kiksoft;

import com.kiksoft.page.AuthenticationPage;
import com.kiksoft.page.InventoryPage;
import com.kiksoft.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationTest extends BaseTest {

    @Test
    public void authenticateAsNormalUserTest() {
        page.navigate(dotenv.get("SAUCE_APP_BASE"));
        AuthenticationPage authenticationPage = new AuthenticationPage(page);

        authenticationPage.fillLoginDetails("standard_user", "secret_sauce");
        authenticationPage.clickAuthenticateButton();

        InventoryPage inventoryPage = new InventoryPage(page);
        Assert.assertTrue(inventoryPage.headerComponent.mainLogo.isVisible());
        Assert.assertTrue(inventoryPage.itemListContainers.isVisible());
    }
}
