package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BasePage {

    /**
     * This method witll click on element
     * @param by
     */
     public static void clickOnElement(By by){
         driver.findElement(by).click();

    }

    /**
     * this method will get text from element
     *
     * @return
     */
    public String getTextFromElement(By by){

         return driver.findElement(by).getText();

    }

    public void sendTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);


    }

    /**
     * this method will selct by value from dropdown
     * @param by
     * @param value
     */
    public void selectByvalueFromDropDown(By by,String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    // select by text from dropdown

    public void selectByTextFromDropDown(By by,String text){

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();

    }
    public WebElement waitUntilVisibilityOfElement(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebElement element=  wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;

    }


}
