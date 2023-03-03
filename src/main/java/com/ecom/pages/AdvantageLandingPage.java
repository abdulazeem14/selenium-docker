package com.ecom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvantageLandingPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.XPATH,using ="//a[@id=\"hrefUserIcon\"]")
    private WebElement userIcon;

    @FindBy(how= How.XPATH,using ="//a[contains(text(),'CREATE NEW ACCOUNT')]")
    private WebElement createNewUser;

    public AdvantageLandingPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://www.advantageonlineshopping.com");
        this.wait.until(ExpectedConditions.visibilityOf(userIcon));
    }

    public void createNewUser(){
        try {
        userIcon.click();
        this.wait.until(ExpectedConditions.visibilityOf(createNewUser));
        Thread.sleep(10000);
        createNewUser.click();

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
