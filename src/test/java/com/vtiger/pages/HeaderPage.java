package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class HeaderPage {
	
	private WebDriver driver;
	public CommonMethods cm;
	

	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		cm = new CommonMethods(driver);
	}

	@FindBy(linkText="Logout")
	WebElement lnk_Logout;
	
	@FindBy(linkText="New Lead")
	WebElement lnk_NewLead;

	@FindBy(linkText="Leads")
	WebElement lnk_Leads;
	
	@FindBy(linkText="New Account")
	WebElement lnk_NewAccount;


	    public void clickLogout()
	    {
	    	cm.ClickElement(lnk_Logout, "Link Logout");
	    }
	    
	    public void clickNewAccount()
	    {
	    	cm.ClickElement(lnk_NewAccount, "Link New Account");
	    }
	    
	    public void clickLeads()
		{
			cm.ClickElement(lnk_Leads, "Link Leads");
		}
		public void clickNewLead()
		{
			cm.ClickElement(lnk_NewLead, "Link New Lead");
		}


}
