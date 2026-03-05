package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderStepDef {
	
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	CartPage cartPage;
	
	public PlaceOrderStepDef() {
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
		cartPage = new CartPage(driver);
	}
	
	
	//Code for login page
	@Given("User is on login Page")
	public void user_is_on_login_page() {
	    TestBase.openUrl("https://www.saucedemo.com/");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		loginPage.LoginIntoApp(strUser, strPwd);
	    
	}
	@Then("User should be on Home page")
	public void user_should_be_on_home_page() {
		Assert.assertTrue(listPage.isHeaderDisp());
	}
	
	
	
	@When("User add item to cart")
	public void user_add_item_to_cart() {
	   listPage.AddITems("Sauce Labs Backpack", "Sauce Labs Bike Light");
	}
	
	@Then("Item must be added")
	public void item_must_be_added() {
	    listPage.navigateToCartPage();
	    Assert.assertTrue(cartPage.isItemAdded());
	}

	
	@Given("User is on cart page")
	public void user_is_on_cart_page() {
	  listPage.navigateToCartPage(); 
	}
	

	@When("User do checkout")
	public void user_do_checkout() {
	   cartPage.chkOutOrder();
	}
	
	@Then("should Navigate to Checkout page")
	public void should_navigate_to_checkout_page() {
		Assert.assertTrue(listPage.isHeaderDisp());
	}
	
	@Given("Cart must have Items")
	public void cart_must_have_items() {
		Assert.assertTrue(cartPage.isItemAdded());
		
	    
	}
	@When("User delete an item")
	public void user_delete_an_item() {
		Assert.assertFalse(cartPage.deleteOrder());
	    
	}
	@Then("should delete item from cart")
	public void should_delete_item_from_cart() {
	    
	}

	
	
	
	
	
	
	@Given("User should be on home page")
	public void user_should_be_on_home_page1() {
	 System.out.println("Checking new changes");
	}



}
