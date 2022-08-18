package com.vtiger.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.AccountPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseTest {
	public LoginPage lp;
	public HomePage hp;
	public LeadPage ldp;
	public AccountPage ap;
	public Scenario scenario;
	
	 @Before
	    public void before(Scenario scenario) {
	        this.scenario = scenario;
	    }
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		setup();
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		ldp = new LeadPage(driver);
		ap = new AccountPage(driver);
	}

	@When("user enters valid userid and password")
	public void user_enters_valid_userid_and_password() {
				
		lp.setUserid(alldata.get(scenario.getName()).get("Userid"));
		lp.setPassword(alldata.get(scenario.getName()).get("password"));
		System.out.println();
		
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
		lp.clickLogin();
	   
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		hp.displayPipeline();
	   
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
	@When("user enters userid as {string} and password as {string}")
	public void user_enters_userid_as_and_password_as(String userid, String pwd) {
		lp.setUserid(userid);
		lp.setPassword(pwd);
	}
	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	   lp.verifyErrorMsg();
	}
	
	@When("user enters userid as {string} and password as {string} and click on login button")
	public void user_enters_userid_as_and_password_as_and_click_on_login_button(String string, String string2, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<List<String>> lst = dataTable.asLists();
		lp.login(lst.get(1).get(0), lst.get(1).get(1));
		
	}
	
	@When("user click on new lead link")
	public void user_click_on_new_lead_link() {
		hp.clickNewLead();
	  
	}
	@When("enter all mandatory fields then click on save button")
	public void enter_all_mandatory_fields_then_click_on_save_button() {
		ldp.createLeadwithMandatoryFields(alldata.get(scenario.getName()).get("lname"), alldata.get(scenario.getName()).get("company"));
	   
	}
	@Then("lead should be created successfully")
	public void lead_should_be_created_successfully() {
		
	    
	}
	@When("user click on new account link")
	public void user_click_on_new_account_link() {
	   ldp.clickNewAccount();
	}
	@When("enter account name and click on save button")
	public void enter_account_name_and_click_on_save_button() {
	    ap.createAccountwithMandatoryFields(alldata.get(scenario.getName()).get("AccountName"));
	}
	@Then("account should be created successfully")
	public void account_should_be_created_successfully() {
	    
	}
	@When("user click on logout")
	public void user_click_on_logout() {
	   ap.clickLogout();
	}
	@Then("user should navigated to login page")
	public void user_should_navigated_to_login_page() {
		lp.verifyLogo();
	   
	}



}
