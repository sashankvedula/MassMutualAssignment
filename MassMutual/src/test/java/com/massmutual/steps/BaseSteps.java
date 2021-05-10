package com.massmutual.steps;



import com.massmutual.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseSteps {
	
	BasePage page = new BasePage();
	
	@Before
	public void setUp() {
		page.lauchURL();
	}
	
	
	@When("amounts are present")
	public void amounts_are_present() {
	    
	}

	@Then("count should be {int}")
	public void count_should_be(Integer int1) {
	   
	}

	@Then("amounts should be greater than {int}")
	public void amounts_should_be_greater_than(Integer int1) {
	    
	    
	}

	@Then("amounts should be displayed as currencies {string}")
	public void amounts_should_be_displayed_as_currencies(String string) {
	    
	    
	}

	@Then("total balance should be equal to sum of the values")
	public void total_balance_should_be_equal_to_sum_of_the_values() {
	   
	}
	
	@After
	public void tearDown() {
		page.closeBrowser();
	}
	
}
