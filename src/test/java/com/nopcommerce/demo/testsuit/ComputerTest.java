package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.computerpage.Computer;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase  {

   Computer computer = new Computer();


   @Test

    public void verifyProductArrangeInAlphaBaticalorder() throws InterruptedException{

       computer.clickOnComputersTab();
       computer.clickOndesktopTab();
       computer.sortByDescendingOrder("Name: Z to A");
   }

}
