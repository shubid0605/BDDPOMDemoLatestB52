package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	WebDriver driver;
	
	@FindBy(css = "span.title")
	WebElement pageHeader;
	
	@FindBy(css = "a.shopping_cart_link")
	WebElement cartIcon;
	
	public ProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddITems(String item1, String item2) {
		
		driver.findElement(By.linkText(item1)).click();
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.linkText(item2)).click();
		driver.findElement(By.id("add-to-cart")).click();
		
	}
	
	public boolean isHeaderDisp() {
		return pageHeader.isDisplayed();
		
		
	}
	
	public void navigateToCartPage() {
		cartIcon.click();
	}
	
	
	
	

}
