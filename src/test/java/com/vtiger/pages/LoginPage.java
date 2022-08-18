package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class LoginPage {
	
	private WebDriver driver;
	public CommonMethods cm;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
		cm = new CommonMethods(driver);
	}
	
	@FindBy(name="user_name")
	WebElement userid;
	
	@FindBy(name="user_password")
	WebElement pwd;
	
	@FindBy(name="Login")
	WebElement login;
	
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	WebElement logo;
	
	@FindBy(xpath="//*[contains(text(),'123You must specify a valid username and password.')]")
	WebElement errMsg;
	
	/*
	By userid = By.name("user_name");
	By pwd = By.name("user_password");
	By login = By.name("Login");
	By logo = By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	*/
	
	
	public void login(String userval,String pwdval)
	{
		setUserid(userval);
		setPassword(pwdval);
		clickLogin();
	}
	
	public void setUserid(String value)
	{
		cm.EnterValue(userid, value,"User Name:");
		
	}
	
	public void setPassword(String value)
	{
		cm.EnterValue(pwd, value,"Password:");
	}
	
	public void clickLogin()
	{
		cm.ClickElement(login,"Login button");
	}
	
	public boolean verifyLogo()
	{
		return cm.CheckDisplay(logo,"Image Logo");
	}
	
	public boolean verifyErrorMsg()
	{
		return cm.CheckDisplay(errMsg,"Error Message");
	}

}
