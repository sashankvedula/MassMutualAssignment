package com.massmutual.steps;



import com.massmutual.pages.BasePage;
import com.massmutual.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseSteps {
	
	BasePage page = new BasePage();
	HomePage homePage = new HomePage();
	
	@Before
	public void setUp() {
		page.lauchURL();
	}
	
	
	@When("amounts are present")
	public void amounts_are_present() {
	    homePage.amountsValidator();
	}

	@Then("count should be {int}")
	public void count_should_be(Integer int1) {
		homePage.countOfAmounts(5);
	}

	@Then("amounts should be greater than {int}")
	public void amounts_should_be_greater_than(Integer int1) {
	    homePage.amountGreaterThan(222);
	    
	}

	@Then("amounts should be displayed as currencies {string}")
	public void amounts_should_be_displayed_as_currencies(String string) {
	    
	    homePage.currencyFormatOfAmount();
	}

	@Then("total balance should be equal to sum of the values")
	public void total_balance_should_be_equal_to_sum_of_the_values() {
		homePage.totalBalanceAndValues();
	}
	
	@After
	public void tearDown() {
		page.closeBrowser();
	}
	
}
