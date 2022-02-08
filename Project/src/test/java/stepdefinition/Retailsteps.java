package stepdefinition;

import java.io.IOException;

import baseclass.Libraryclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddproductTocart;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ContactPage;
import pages.Loginpage;
import pages.Registerpage;
import pages.SearchPage;
import pages.Selectproduct;
import pages.Shoppage;
import pages.WishlistPage;
import seleniumreuseablefunctions.Seleniumutility;


public class Retailsteps extends Libraryclass {
	Seleniumutility selenium;
	Registerpage rp;
	Loginpage lp;
	Shoppage cp;
	SearchPage sp;
	Selectproduct spro;
	AddproductTocart apro;
	CartPage cpg;
	CheckoutPage cop;
	WishlistPage wp;
	ContactPage cup;
	
	@Given("To launch the application and navigate to url")
	public void to_launch_the_application_and_navigate_to_url() {
		launchapp(); 
	}

	@When("Enter {string} and {string} and  {string} and {string}")
	public void enter_and_and_and(String string, String string2, String string3, String string4) {
		rp=new Registerpage(driver);
		rp.start();
		rp.register("Divya", "divyakrish568@gmail.com", "Sruthi", "Sruthi");   
	}

	@Then("To click the submit button")
	public void to_click_the_submit_button() {
	  rp.submit(); 
	}

	@Then("To close the browser and take screenshot")
	public void to_close_the_browser_and_take_screenshot() throws IOException {
		selenium=new Seleniumutility(driver);
		selenium.screenshot("/Project/src/test/resources/Screenshots/register.png");
		closeapp();
	   }
	@When("Enter {string} and {string}")
	public void enter_and(String string, String string2) {
		lp=new Loginpage(driver);
		lp.login("Divya","Sruthi");
	}

	@Then("To click the submit button and shop button")
	public void to_click_the_submit_button_and_shop_button() {
		lp.submit();
		lp.shopy(); 
	}

	@Then("To close the browser and take screenshot in Login")
	public void to_close_the_browser_and_take_screenshot_in_Login() throws IOException {
		selenium=new Seleniumutility(driver);
		selenium.screenshot("/Project/src/test/resources/Screenshots/login.png");
		closeapp();
	}
		
		@Then("To click the shop button and category and women")
		public void to_click_the_shop_button_and_category_and_women() {
			cp=new Shoppage(driver);
			cp.cat();   
		}

		@Then("To close the browser and take screenshot in Shop")
		public void to_close_the_browser_and_take_screenshot_in_Shop() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/shop.png");
			closeapp(); 
		}
		@When("To search shirt in search tab")
		public void to_search_shirt_in_search_tab() {
			sp=new SearchPage(driver);
			sp.shopy();  
		}

		@Then("To click the search button")
		public void to_click_the_search_button() {
			sp=new SearchPage(driver);
			sp.shopy();
			sp.search(); 
		}

		@Then("To close the browser and take screenshot in Search")
		public void to_close_the_browser_and_take_screenshot_in_Search() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/search.png");
			closeapp();	
		}
		@Then("To click the product")
		public void to_click_the_product() {
			spro=new Selectproduct(driver);
			spro.shopy();
			spro.search();
			spro.selectproduct();
		}

		@Then("To close the browser and take screenshot in Select")
		public void to_close_the_browser_and_take_screenshot_in_Select() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/select.png");
			closeapp();	
		}
		@Then("To click the product to cart and view cart")
		public void to_click_the_product_to_cart_and_view_cart() {
			apro=new AddproductTocart(driver);
			apro.shopy();
			apro.search();
			apro.selectproduct();
			apro.prod();
		}

		@Then("To close the browser and take screenshot in Addcart")
		public void to_close_the_browser_and_take_screenshot_in_Addcart() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/addtocart.png");
			closeapp();
		}
		@Then("To click the proceed checkout")
		public void to_click_the_proceed_checkout() {
			cpg=new CartPage(driver);
			cpg.shopy();
			cpg.search();
			cpg.selectproduct();
			cpg.prod();
			cpg.cart();
			cpg.check();  
		}

		@Then("To close the browser and take screenshot in Cart")
		public void to_close_the_browser_and_take_screenshot_in_Cart() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/cart.png");
			closeapp(); 
		}
		@When("To Enter <\"Firstname\"> and  <\"Lastname\"> and  <\"Country\"> and  <\"Address\"> and  <\"City\"> and  <\"Postcode\"> and  <\"Phone\"> and  <\"Email\">")
		public void to_Enter_Firstname_and_Lastname_and_Country_and_Address_and_City_and_Postcode_and_Phone_and_Email() {
			cop=new CheckoutPage(driver);
			cop.shopy();
			cop.search();
			cop.selectproduct();
			cop.prod();
			cop.cart();
			cop.check();
		}

		@Then("To Click on Place the order")
		public void to_Click_on_Place_the_order() {
			cop.checkoutpro();
		}

		@Then("To close the browser and take screenshot in Checkout")
		public void to_close_the_browser_and_take_screenshot_in_Checkout() throws IOException {
			selenium=new Seleniumutility(driver);
			selenium.screenshot("/Project/src/test/resources/Screenshots/Checkout.png");
			closeapp();
		}
			@Then("To add the product to wishlist")
			public void to_add_the_product_to_wishlist() {
				wp=new WishlistPage(driver);
				wp.shopy();
				wp.search();
				wp.selectproduct();
				wp.wish();
				
			}
			@Then("To click wishlist button")
			public void to_click_wishlist_button() {
				wp.clickwish(); 
			}

			@Then("To close the browser and take screenshot in Wishlist")
			public void to_close_the_browser_and_take_screenshot_in_Wishlist() throws IOException {
				selenium=new Seleniumutility(driver);
				selenium.screenshot("/Project/src/test/resources/Screenshots//wishlist.png");
				closeapp();
			}

			@When("To Enter <\"Name\"> and  <\"Email\"> and  <\"Subject\"> and  <\"Message\">")
			public void to_Enter_Name_and_Email_and_Subject_and_Message() {
				cup=new ContactPage(driver);
		        cup.conatct();
			    
			}

			@Then("To Click submit button")
			public void to_Click_submit_button() {
				cup.submit();
			}
			@Then("To close the browser and take screenshot in contactus")
			public void to_close_the_browser_and_take_screenshot_in_contactus() throws IOException {
				selenium=new Seleniumutility(driver);
				selenium.screenshot("/Project/src/test/resources/Screenshots/checkout.png");
				closeapp();
			}
		    
		}

