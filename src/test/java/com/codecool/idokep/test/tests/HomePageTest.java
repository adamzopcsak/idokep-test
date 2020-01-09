package com.codecool.idokep.test.tests;

import com.codecool.idokep.test.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @BeforeEach
    public void setup() {
        homePage = new HomePage(driver);
        homePage.load();
    }

    @Test
    public void testMainPageLoads() {
        Assertions.assertTrue(homePage.isLogoDisplayed());
    }

    @Test
    public void testBriefForecastDisplayed() {
        Assertions.assertFalse(homePage.getBriefForecast().isEmpty());
    }

    @Test
    public void testRecommendedClothingAvailable() {
        Assertions.assertFalse(homePage.getRecommendedClothing().isEmpty());
    }

}