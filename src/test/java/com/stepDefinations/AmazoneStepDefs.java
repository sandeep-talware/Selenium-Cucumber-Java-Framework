package com.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.proj.Util.utilities;
import com.pages.AmazonHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazoneStepDefs {

	WebDriver driver;
	AmazonHomePage amazoneHome;
	@Before
	public void Init() {
		String browserName = utilities.getProperties("BROWSER");
		driver = utilities.setdriver(browserName);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Given("^I Navigate to amazone$")
	public void i_Navigate_to_amazone() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		amazoneHome= new AmazonHomePage(driver);
	}

	@When("^I Enter \"([^\"]*)\" in Search box$")
	public void i_Enter_in_Search_box(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		amazoneHome.enterTextInSearchBar(arg1);
	}

	@When("^I perform Search$")
	public void i_perform_Search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		amazoneHome.performSearch();
	}

	@When("^I chose shoes \"([^\"]*)\"$")
	public void i_chose_shoes(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I select size as \"([^\"]*)\"$")
	public void i_select_size_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I perform add to cart$")
	public void i_perform_add_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I click on cart$")
	public void i_click_on_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^Verify \"([^\"]*)\" in Shopping Cart$")
	public void verify_in_Shopping_Cart(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}
}
