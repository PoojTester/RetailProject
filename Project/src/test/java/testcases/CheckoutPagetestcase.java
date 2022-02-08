package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.CheckoutPage;
import seleniumreuseablefunctions.Seleniumutility;

public class CheckoutPagetestcase extends Libraryclass {
	Seleniumutility selenium;
	CheckoutPage cop;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}
	@Test
	public void product()
	{
		cop=new CheckoutPage(driver);
		cop.shopy();
		cop.search();
		cop.selectproduct();
		cop.prod();
		cop.cart();
		cop.check();
		cop.checkoutpro();
		}
   
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/Checkout.png");
	closeapp();
  }
}
