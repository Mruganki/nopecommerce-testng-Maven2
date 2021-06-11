package com.nopcommerce.demo.desktoppage;

import com.nopcommerce.demo.computerpage.Computer;
import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.nopcommerce.demo.homepage.TopMenu.selectMenu;

public class Desktop extends Utility {

    TopMenu topMenu = new TopMenu();
    By clickonDesktopTab = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");
    By sortByAscendingOrder = By.id("products-orderby");
    By addtoCart = By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']");


    public void clickonComputer()  {

        topMenu.selectMenu("Computers");
    }

    public void clickonDesktopOption() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(clickonDesktopTab);

    }

    public void selectFromDropdownMenu(String sortby) {

        selectByTextFromDropDown(sortByAscendingOrder, sortby);
    }

    public void clickOnAddToCartButton() throws InterruptedException{
        Thread.sleep(2000);

        clickOnElement(addtoCart);
    }


}

       // Thread.sleep(2000);
        //click on desktop
        //clickOnElement(By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']"));
        // Select Sort By position "Name: A to Z"
        //selectByTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

        //click on add to cart
       // Thread.sleep(2000);
       // clickOnElement(By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']"));



      /**  // desktoplist of products in its original order
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2"));

        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList);
        Collections.sort(productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);



    }*/

