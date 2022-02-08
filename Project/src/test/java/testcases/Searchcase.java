package testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.SearchPage;
import seleniumreuseablefunctions.Seleniumutility;

public class Searchcase extends Libraryclass {
	

		Seleniumutility selenium;
		SearchPage sp;
		@BeforeMethod
		public void openapp()
		{
		launchapp();
		}
	
		@Test
		public void sear()
		{
		sp=new SearchPage(driver);
		sp.shopy();
		sp.search();
		}
	   
		@AfterMethod
		public void teardown() throws IOException
		{
		selenium=new Seleniumutility(driver);
		selenium.screenshot("/Project/src/test/resources/Screenshots/search.png");
		closeapp();
      }
}
		