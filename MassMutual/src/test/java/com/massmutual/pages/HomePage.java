package com.massmutual.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.massmutual.utilities.Utilities;

public class HomePage extends BasePage{

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[starts-with(@id,'lbl_val')]")
	private List<WebElement> ListOfLabels;
	
	@FindBy(xpath = "//*[starts-with(@id,'txt_val')]")
	private List<WebElement> listOfAmounts;
	
	@FindBy(xpath = "//*[starts-with(@id,'txt_amt')]")
	private WebElement amounts;
	
	@FindBy(id = "lbl_ttl_val")
	private WebElement totalBalanceLabel;

	@FindBy(id = "txt_ttl_val")
	private WebElement totalBalanceAmount;
	
	@FindBy(id = "txt_ttl_curr")
	private WebElement currency;
	
	/*
	 * Getter Methods to access the elements
	 */
	
	
	public List<WebElement> getListOfLabels() {
		return ListOfLabels;
	}

	public List<WebElement> getListOfAmounts() {
		return listOfAmounts;
	}
	
	public WebElement getAmounts() {
		return amounts;
	}

	public WebElement getTotalBalanceLabel() {
		return totalBalanceLabel;
	}

	public WebElement getTotalBalanceAmount() {
		return totalBalanceAmount;
	}
	
	public WebElement getCurrency() {
		return currency;
	}

	
	
			public void amountsValidator() {
				
				if(getAmounts().isDisplayed()) {
					Assert.assertTrue(true);
				}
				
				else {
					Assert.assertFalse(false);
				}
			} 
	
			public void amountGreaterThan(int number) {
				
				int sum =0;
				for(int i=0;i<getListOfAmounts().size();i++) {
					
					
					String val = getListOfAmounts().get(i).getText();
					int amt = Integer.parseInt(val);
					sum = sum+amt;
				}
				
				if(sum >number) {
					Assert.assertTrue(true);
				}
				
				else {
					Assert.assertFalse(false);
				}
			}
	
			public void countOfAmounts(int number) {
					
					if(getListOfAmounts().size()>number) {
						Assert.assertTrue(true);
					}
					
					else {
						Assert.assertFalse(false);
					}
				}
			
			public void currencyFormatOfAmount() {
				
				if(getCurrency().isDisplayed()) {
					Assert.assertTrue(getCurrency().equals("currency"),"Pass");
				}
				
				else {
					Assert.assertFalse(false);
				}
			}
			
			public void totalBalanceAndValues() {
				
				if(getTotalBalanceAmount().equals(getTotalBalanceLabel())) {
					Assert.assertTrue(true);
				}
				
				else {
					Assert.assertFalse(false);
				}
							
							
						}
			

		
	

	
	
	
	
	
}
