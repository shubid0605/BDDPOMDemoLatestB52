package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "user-name")
	WebElement uname;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login-button")
	WebElement loginbtn;

	
	public LoginPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);		
	}

	
	
//Action
	
	public void LoginIntoApp(String strUser, String strPwd) {
		uname.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginbtn.click();
	}
	
	
}
