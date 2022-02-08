package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;

import pages.WishlistPage;
import seleniumreuseablefunctions.Seleniumutility;

public class WishlistTestcase extends Libraryclass{
	Seleniumutility selenium;
	WishlistPage wp;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}

	@Test
	public void selpro()
	{
	wp=new WishlistPage(driver);
	wp.shopy();
	wp.search();
	wp.selectproduct();
	wp.wish();
	wp.clickwish();
	}
   
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots//wishlist.png");
	closeapp();
  }
}
