package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.Loginpage;
import seleniumreuseablefunctions.Seleniumutility;


	public class Logintestcase extends Libraryclass{

			Seleniumutility selenium;
			Loginpage lp;
			@BeforeMethod
			public void openapp()
			{
			launchapp();
			}
			@Test
			public void login()
			{
			lp=new Loginpage(driver);
			lp.login("Divya","Sruthi");
			lp.submit();
			lp.shopy();
			}
            @AfterMethod
			public void teardown() throws IOException
			{
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/login.png");
			closeapp();
			}
}
