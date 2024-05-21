package com.OrangeHRMaAppilicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class LogInPage extends BaseTest {
	public void LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="loginPanelHeading")
	WebElement loginPanel;
	public void orangeHRMAppilicationLoginPage_loginPanelValidation()
	{
		String expected_OrangeHRMApplicationLogInPage_logInPanelText="LOGIN Panel";
		Log.info(" The Expected OrangeHRM Application LogIn Page Text is :- "+expected_OrangeHRMApplicationLogInPage_logInPanelText);
		
		String actual_OrangeHRMApplicationLogInPage_logInPanelText=logInPanel.getText();
		Log.info("The Actual OrangeHRM Application LogIN Page Text is :-"+actual_OrangeHRMApplicationLogInPage_logInPanelText);
		
		
		if(actual_OrangeHRMApplicationLogInPage_logInPanelText.equals(expected_OrangeHRMApplicationLogInPage_logInPanelText))
		{
		Log.info(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");
		}
		else
		{
		Log.info(" Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
		}

	}
 @FindBy(xpath="\"/html/body/div[1]/div/div[2]/div/img")
 WebElement orangeHRMAppilicationLoginPageLogo;
 public void orangeHRMApplication_LogInPageLogoValidation()
 {
 boolean flag=orangeHRMAppilicationLoginPageLogo.isDisplayed();
 if(flag)
 {
 Log.info("OrangeHRM Applicaiton LogIn Page Contains LOGO - PASS");
 }
 else
 {
 Log.info("OrangeHRM Applicaiton LogIn Page DOEST NOT Contains LOGO - FAIL");
 }
 }

	

}
