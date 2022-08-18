package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class AccountPage extends HeaderPage {
	
	public AccountPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);

	}

	

	@FindBy(name="accountname")
	WebElement accountname;

	@FindBy(name="button")
	WebElement save;

	public void clickSave()
	{
		cm.ClickElement(save, "save button");
	}
	
	public void setAccountname(String value)
	{
		cm.EnterValue(accountname, value, "textbox account name");
	}
	
	public void createAccountwithMandatoryFields(String acname)
	{
		setAccountname(acname);		
		clickSave();
	}

}
