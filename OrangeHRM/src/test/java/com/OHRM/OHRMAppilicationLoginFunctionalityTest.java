package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMAppilicationLoginFunctionalityTest {
	
	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
	

	System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationLogInPageTitle=ChromeDriver.getTitle();
	System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);

	if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	}

	System.out.println();

}
}