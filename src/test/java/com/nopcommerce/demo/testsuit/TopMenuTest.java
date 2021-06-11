package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenu topmenu = new TopMenu();

    @Test

       public void  selectmenutest () {

          topmenu.selectMenu("Books ");

       }
}
