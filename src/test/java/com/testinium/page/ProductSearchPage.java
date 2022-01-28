package com.testinium.page;

import com.testinium.methods.Methods;


import org.openqa.selenium.By;

public class ProductSearchPage {

    Methods methods;
    public ProductSearchPage(){
        methods=new Methods();
    }

    public void ScrollAndSelect(){

        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//a[contains(text(),'Güncelle')]"));
        methods.waitBySeconds(2);
        methods.randomSelect(By.xpath("//a[@class=\"add-to-favorites\"]"));
        methods.waitBySeconds(2);
        methods.randomSelect(By.xpath("//a[@class=\"add-to-favorites\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@class='addToFavorites(451578);']"));
        methods.waitBySeconds(2);
        methods.randomSelect(By.xpath("//a[@class=\"add-to-favorites\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='logo-text']"));
        methods.waitBySeconds(2);


    }

}
