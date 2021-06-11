package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.desktoppage.Desktop;
import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {

    Desktop desktop = new Desktop();
    TopMenu topMenu =new TopMenu();


    @Test

public void productArragedInAscendingOrder () throws InterruptedException{

    desktop.clickonComputer();
    desktop.clickonDesktopOption();
    desktop.selectFromDropdownMenu("Name: A to Z");
    desktop.clickonDesktopOption();
}

}
