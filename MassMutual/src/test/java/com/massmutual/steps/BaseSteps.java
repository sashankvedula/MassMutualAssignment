package com.massmutual.steps;



import com.massmutual.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
	
	BasePage page = new BasePage();
	
	@Before
	public void setUp() {
		page.lauchURL();
	}
	
	@After
	public void tearDown() {
		page.closeBrowser();
	}
	
}
