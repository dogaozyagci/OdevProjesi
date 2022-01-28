package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.*;
import org.junit.Test;

public class mainTest extends BasePage {
    @Test
    public void mainTest(){
        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductSearchPage productPage = new ProductSearchPage();
        productPage.ScrollAndSelect();
        PuanKatalogu puanKatalogu = new PuanKatalogu();
        puanKatalogu.scroll();
        Favoritos favoritos = new Favoritos();
        favoritos.favs();
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.logout();


    }
}

