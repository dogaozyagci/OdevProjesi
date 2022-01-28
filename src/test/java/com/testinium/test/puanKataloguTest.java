package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.PuanKatalogu;
import org.junit.Test;

public class puanKataloguTest extends BasePage {
    @Test
    public void PuanKataloguTest(){
        PuanKatalogu puanKatalogu = new PuanKatalogu();
        puanKatalogu.scroll();
    }
}
