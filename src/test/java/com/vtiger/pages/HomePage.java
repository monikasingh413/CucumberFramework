package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;


public class HomePage extends HeaderPage {


public HomePage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
	
}

@FindBy(name="pipeline")
WebElement img_pipeline;


    public void displayPipeline()
    {
    	cm.CheckDisplay(img_pipeline, "Dashboard Pipeline");
    }

}
