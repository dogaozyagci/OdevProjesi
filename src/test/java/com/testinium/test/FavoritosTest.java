package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.Favoritos;
import org.junit.Test;

public class FavoritosTest extends BasePage {

    @Test
    public void favoritosTest(){
        Favoritos favoritos = new Favoritos();
        favoritos.favs();
    }
}
