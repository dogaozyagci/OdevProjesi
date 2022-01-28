package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LogoutPage {
    Methods methods;

    public LogoutPage(){
        methods = new Methods();
    }

    public void logout(){


        methods.hover(By.xpath("//a[@class\"common-sprite\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[contains(text(),'Çıkış')]"));
        methods.waitBySeconds(5);


    }



}
