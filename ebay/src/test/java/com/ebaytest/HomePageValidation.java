package com.ebaytest;


import com.base.TestBase;
import com.ebay.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {
    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
     HomePage homePage = PageFactory.initElements(driver, HomePage.class);
     homePage.typeOnSearchBar();
     clickOnElement("//input[@id='gh-btn000007']");

    }
}
