package com.massmutual.pages;

import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;

import com.massmutual.utilities.Utilities;

public class BasePage {

	public static ResourceBundle rb = ResourceBundle.getBundle("application");
	public static WebDriver driver;
	
	public void lauchURL() {
		driver = Utilities.getDriver();
		String url = rb.getString("url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	public void closeBrowser() {
		driver.quit();
	}
	
}
