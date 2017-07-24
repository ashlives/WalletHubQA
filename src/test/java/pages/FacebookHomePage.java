package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Ashish on 14-07-2017.
 */
public class FacebookHomePage {
    WebDriver driver;

    public FacebookHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    @FindBy(name = "xhpc_message")
    WebElement status;

    @FindBy (xpath = "//button[text()='Post']")
    WebElement postButton;

    @FindBy(xpath = ".//*[@id='stream_pagelet']/div[5]/div/div/div[1]/div/div/div/div")
    WebElement firstFeed;

    public void postStatus(String textStatus) throws InterruptedException {
        status.click();
        status.sendKeys(textStatus);
        postButton.click();
    }

    public String getFirstFeed(){
        return firstFeed.getText();
    }


}
