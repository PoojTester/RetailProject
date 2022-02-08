package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;

import pages.CartPage;
import seleniumreuseablefunctions.Seleniumutility;

public class CartTestcase extends Libraryclass {
	Seleniumutility selenium;
	CartPage cp;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}
	@Test
	public void product()
	{
		cp=new CartPage(driver);
		cp.shopy();
		cp.search();
		cp.selectproduct();
		cp.prod();
		cp.cart();
		cp.check();
		}
   
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/cart.png");
	closeapp();
  }
}
