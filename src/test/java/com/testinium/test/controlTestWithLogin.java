package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.Favoritos;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;

import com.testinium.page.PuanKatalogu;
import org.junit.Test;

public class controlTestWithLogin extends BasePage {
    @Test
    public void mainTest(){
        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        PuanKatalogu puanKatalogu = new PuanKatalogu();
        puanKatalogu.scroll();
        Favoritos favoritos = new Favoritos();
        favoritos.favs();

    }
}
