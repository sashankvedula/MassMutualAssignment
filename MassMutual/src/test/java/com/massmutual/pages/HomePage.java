package com.massmutual.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[starts-with(@id,'lbl_val')]")
	private List<WebElement> ListOfLabels;
	
	@FindBy(xpath = "//*[starts-with(@id,'txt_val')]")
	private List<WebElement> listOfAmounts;
	
	@FindBy(id = "lbl_ttl_val")
	private WebElement totalBalanceLabel;

	@FindBy(id = "txt_ttl_val")
	private WebElement totalBalanceAmount;
	
	
	
}
