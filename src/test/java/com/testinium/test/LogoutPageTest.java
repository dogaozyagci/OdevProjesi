package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.LogoutPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogoutPageTest extends BasePage {
    @Test
    public void logoutPageTest(){
        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.logout();


    }
}
