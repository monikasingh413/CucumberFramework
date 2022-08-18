package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class LeadPage extends HeaderPage {

	public LeadPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);

	}

	

	@FindBy(name="lastname")
	WebElement lastname;

	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="button")
	WebElement save;

	public void clickSave()
	{
		cm.ClickElement(save, "save button");
	}
	public void setCompany(String value)
	{
		cm.EnterValue(company, value, "textbox company");
	}
	public void setLastname(String value)
	{
		cm.EnterValue(lastname, value, "textbox lastname");
	}
	
	public void createLeadwithMandatoryFields(String lname,String comp)
	{
		setLastname(lname);
		setCompany(comp);
		clickSave();
	}

	
}
