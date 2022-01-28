package com.testinium.page;

import com.testinium.methods.Methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class Favoritos {
    Methods methods;
    Logger logger = LogManager.getLogger(Favoritos.class);


    public void favs(){
        methods = new Methods();

        methods.click(By.xpath("//a[@onclick='removeFromFavorites(451578);']"));
        methods.waitBySeconds(3);
        methods.click(By.id("cart"));
        methods.waitBySeconds(3);
        methods.click(By.id("checkout fl"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.className("js-cart-update-product"),"2");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@class='button red']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-firstname-companyname"),"Doğa");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-lastname-title"),"Özyağci");
        methods.waitBySeconds(3);
        methods.click(By.id("address-zone-id"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[@value='3354']"));
        methods.waitBySeconds(2);
        methods.click(By.id("address-county-id"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[@value='440']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("district"),"FETİH MAH");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-address-text"),"Köseoğlu sokak, no:79");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-postcode"),"34704");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-telephone"),"5074663525");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-mobile-telephone"),"5774663525");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-tax-id"),"45013461172");
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);









    }

}
