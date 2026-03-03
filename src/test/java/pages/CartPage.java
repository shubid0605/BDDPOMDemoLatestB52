package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindAll({@FindBy(how = How.CSS, using =  "div.cart_item_label")})
	List<WebElement> items;
	
	@FindBy(id = "checkout")
	WebElement cheOutBtn; 
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement detleeBtn;
	 
	public CartPage(WebDriver driver){	
		PageFactory.initElements(driver, this);
	}
	
	public boolean isItemAdded() {
		if(items.size() > 0) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public void chkOutOrder() {
		if(isItemAdded()) {
			cheOutBtn.click();
		}
			
	
	}
	public boolean deleteOrder() {
		int a = items.size();
		
		if(isItemAdded()) {
			detleeBtn.click();
		}
		return false;
			
			
			
	}
	
	public void deleteCount() {
		
	}
}


