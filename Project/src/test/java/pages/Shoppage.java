package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"masthead\"]/div[3]/div/div[1]/div")
	WebElement product;
	@FindBy(xpath="//*[@id=\"menu-item-227671\"]/a")
	WebElement women; 
    public Shoppage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver ,this);
    	}
    public void cat() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action=new Actions(driver);
    	WebElement shop = driver.findElement(By.linkText("Shop"));
        js.executeScript("arguments[0].scrollIntoView();", shop);
        action.moveToElement(shop).click().build().perform();
    	product.click();
    	women.click();
    }
}
