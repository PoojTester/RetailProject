package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CartPage {
      WebDriver driver;
    @FindBy(xpath="//*[@id=\"masthead\"]/div[3]/div/div[2]/div[1]/div[1]")
  	WebElement search;
  	@FindBy(xpath="//*[@id=\"estore-wc-search-field\"]")
  	WebElement searchpro;
  	@FindBy(xpath="//*[@id=\"primary\"]/ul/li[1]/h3/a")
  	WebElement pro;
  	@FindBy(xpath="//*[@id=\"product-32\"]/div[2]/form/button")
  	WebElement addcart;
  	@FindBy(xpath="//*[@id=\"woocommerce_widget_cart-1\"]/div/p[2]/a[1]")
  	WebElement viewcart;
    @FindBy(xpath=" //*[@id=\"post-227628\"]/div/div/div/div/div/div[2]/div/div/a")
    WebElement checkout;
      public CartPage(WebDriver driver)
  	{   
  		this.driver=driver;
  		PageFactory.initElements(driver ,this);
  	}
          
      public void shopy() {
    	   	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	   	 Actions action=new Actions(driver);
    	   	WebElement shop = driver.findElement(By.linkText("Shop"));
    	       js.executeScript("arguments[0].scrollIntoView();", shop);
    	       action.moveToElement(shop).click().build().perform();
    	   }
      public void search()
  	{
  	    search.click();
  	    searchpro.sendKeys("shirt");
  		Actions action=new Actions(driver);
  		action.sendKeys(Keys.TAB).perform();
         action.sendKeys("shirt").perform();
         action.sendKeys(Keys.ENTER).perform();	
  	}
      public void selectproduct() {
  		Select relavance=new Select(driver.findElement(By.xpath("//*[@id=\"primary\"]/form/select")));
  		relavance.selectByIndex(5);
  		pro.click();
    }
      public void cart() {
	   	 JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 Actions action=new Actions(driver);
	   	WebElement cart = driver.findElement(By.linkText("Cart"));
	       js.executeScript("arguments[0].scrollIntoView();", cart);
	       action.moveToElement(cart).click().build().perform();
	   }
      public void prod() {
      	
      	addcart.click();
      	viewcart.click();
      	}
      public void check() {
    	  checkout.click();
      }
		
}
