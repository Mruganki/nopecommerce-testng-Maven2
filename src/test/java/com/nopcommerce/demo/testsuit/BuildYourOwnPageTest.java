package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.buildyourownpage.BuildYourOwnPage;
import com.nopcommerce.demo.computerpage.Computer;
import com.nopcommerce.demo.desktoppage.Desktop;
import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildYourOwnPageTest extends TestBase {

    TopMenu topmenu = new TopMenu();
    Computer computer = new Computer();
    Desktop desktop = new Desktop();
    BuildYourOwnPage buildyourownpage = new BuildYourOwnPage();

    @Test

    public void verifyShoppingCart()throws InterruptedException{

        topmenu.selectMenu("Computers");
        desktop.clickonDesktopOption();
        desktop.selectFromDropdownMenu("Name: A to Z");
        desktop.clickOnAddToCartButton();
        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = buildyourownpage.getBuildyourOwnPageText();
        Assert.assertEquals( expectedPagetext, actualPageText );
        buildyourownpage.selectProcessorFromDropDownList( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildyourownpage.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildyourownpage.clickOnHDDRadioButton();
        buildyourownpage.clickOSOnRadioButton();
        buildyourownpage.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildyourownpage.getTotalAmt();
        Assert.assertEquals( expectedtotal, actualTotal );
        buildyourownpage.clickOnAddToCart();
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = buildyourownpage.getPopUpBarMessage();
        Assert.assertEquals( expectedBarMessage, actualBarMessage );





    }


}
