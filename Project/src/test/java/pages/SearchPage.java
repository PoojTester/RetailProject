package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"masthead\"]/div[3]/div/div[2]/div[1]/div[1]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"estore-wc-search-field\"]")
	WebElement searchpro;

	public SearchPage(WebDriver driver)
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
}
