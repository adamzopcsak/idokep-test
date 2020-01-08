package com.codecool.idokep.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    protected WebDriver driver;
    String baseUrl;
    WebDriverWait wait;

    public Page(){}

    public Page(WebDriver driver) {
        this.driver = driver;
        int timeOutInSeconds = 8;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeOutInSeconds), this);
        baseUrl = "https://idokep.hu";
        wait = new WebDriverWait(driver, timeOutInSeconds);
    }

    public void navigateTo(String extendedUrl) {
        driver.get(baseUrl + extendedUrl);
    }
}