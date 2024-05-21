package OHRM_AddEmployee;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	public class add_Employee {

	
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\T Anusha\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//validate the login page of OrangeHRM Application
	//expected title should be OrangeHRM
	//expected URL Address should have Orangehrm-4.2.0.1
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(applicationUrlAddress);
	



	String expected_OrangeHRMLoginPageTitle="OrangeHRM";//Should be
	System.out.println("The expected Title of OrangeHRM Login Page is :"+expected_OrangeHRMLoginPageTitle);

	String actual_OrangeHRMLoginPageTitle=driver.getTitle();
	System.out.println("The Actual Title of LOginHomePage is:"+actual_OrangeHRMLoginPageTitle);

	if(actual_OrangeHRMLoginPageTitle.equals(expected_OrangeHRMLoginPageTitle))
	{
	System.out.println("The OrangeHRM Login Page Title is matched-PASS");
	}
	else
	{
	System.out.println("The OrangeHRM Login Page Title is NOT matched-FAIL");
	}
	//Expected LoginPage Text-LOGIN Panel(Should be)

	String expected_LoginPageText="LOGIN Panel";//Should be
	System.out.println("The expected Title of OrangeHRM Home Page is :"+expected_LoginPageText);
	By LoginPannel = By.id("logInPanelHeading");
	WebElement LoginPanelOrangeHRM=driver.findElement(LoginPannel);

	String actual_LoginPageText=LoginPanelOrangeHRM.getText();
	System.out.println("The Actual Title of the OrangeHRM Home0 Page is:"+actual_LoginPageText);

	if(actual_LoginPageText.equals(expected_LoginPageText))
	{
	System.out.println("The LoginPageText is -PASS");
	}
	else
	{
	System.out.println("The is LoginPageText is NOT matched-FAIL");
	}
	 

	//Get the Url Address of the WebPage


	String expected_OrangeHRMLoginPageUrlAddress="orangehrm-4.2.0.1";//Should have
	   System.out.println("The Expected OrangeHRM Login Page Url Address is:"+expected_OrangeHRMLoginPageUrlAddress);

	  String actual_OrangeHRMLoginPageUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	  System.out.println("The Actual Current Address of the OrangeHRM Home Page is:"+actual_OrangeHRMLoginPageUrlAddress);

	  if(actual_OrangeHRMLoginPageUrlAddress.contains(expected_OrangeHRMLoginPageUrlAddress))
	  {
	  System.out.println("Expected Url Address Found-PASS");
	  }
	  else
	  {
	  System.out.println("Expected Url Address NOT Found=FAIL");
	  }
	 
	 
	  //Verification and Validation of UserName
	   //<input name="txtUsername" id="txtUsername" type="text" fdprocessedid="eg6waw"
	 
	   By userNameProperty= By.name("txtUsername");
	    WebElement userName= driver.findElement(userNameProperty);
	   String userNameTestData= "Anusha";
	   userName.sendKeys(userNameTestData);
	   
	 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	   
	   By passwordProperty=By.name("txtPassword");
	   WebElement password=driver.findElement(passwordProperty);
	   String passwordTestData="Anusha@04";
	   password.sendKeys(passwordTestData);
	   
	 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	   
	  By loginButtonProperty=By.className("button");
	  WebElement loginButton=driver.findElement(loginButtonProperty);
	  loginButton.click();
	 
	  /*Validate the HomePage of OrangeHrM Appilication
	   * expected title should be-OrangeHRM
	   * Expected URL Address should have-Orangehrm-4.2.0.1
	   */
	String expected_OrangeHRMHomePageTitle1="OrangeHRM";//Should be
	System.out.println("The expected Title of OrangeHRM Home Page is :"+expected_OrangeHRMHomePageTitle1);

	String actual_OrangeHRMHomePageTitle1=driver.getTitle();
	System.out.println("The Actual Title of the OrangeHRM Home0 Page is:"+actual_OrangeHRMHomePageTitle1);

	if(actual_OrangeHRMHomePageTitle1.equals(expected_OrangeHRMHomePageTitle1))
	{
	System.out.println("The OrangeHRM Home Page Title is matched-PASS");
	}
	else
	{
	System.out.println("The OrangeHRM Home Page Title is NOT matched-FAIL");
	}
	 //Get the URL Address of the Webpage

	String expected_OrangeHRMHomePageUrlAddress1="orangehrm-4.2.0.1";//Should have
	   System.out.println("The Expected OrangeHRM Login Page Url Address is:"+expected_OrangeHRMHomePageUrlAddress1);

	  String actual_OrangeHRMHomePageUrlAddress1= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	  System.out.println("The Actual Current Address of the OrangeHRM Home Page is:"+actual_OrangeHRMHomePageUrlAddress1);

	  if(actual_OrangeHRMHomePageUrlAddress1.contains(expected_OrangeHRMHomePageUrlAddress1))
	  {
	  System.out.println("Expected Url Address Found-PASS");
	  }
	  else
	  {
	  System.out.println("Expected Url Address NOT Found=FAIL");
	  
	  }
	 // <b>PIM</b>
	  //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
         By PIMProperty=By.id("menu_pim_viewPimModule");
         WebElement PIMButton=driver.findElement(PIMProperty);
         PIMButton.click();
         
      //   <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
        By AddEmployeeProperty=By.id("menu_pim_addEmployee");
         WebElement AddEmployeeButton=driver.findElement(AddEmployeeProperty);
         AddEmployeeButton.click();
         
          
         //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
        
     	 By FirstNameProperty= By.id("firstName");
 	    WebElement FirstName= driver.findElement(FirstNameProperty);
 	   String FirstNameTestData="Lakshmi";
 	  FirstName.sendKeys(FirstNameTestData);
 	  
 	
 	   
 	   //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
 	  By MiddleNameProperty= By.name("middleName");
	    WebElement MiddleName= driver.findElement(MiddleNameProperty);
	   String MiddleNameTestData="Devi";
	   MiddleName.sendKeys(MiddleNameTestData);
	   
	 
	   
	   //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	   By LastNameProperty= By.name("lastName");
	    WebElement LastName= driver.findElement(LastNameProperty);
	   String LastNameTestData= "Tiruvuru";
	   LastName.sendKeys(LastNameTestData);
	   
	 
	 	//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
	  By empIdLocator=By.id("employeeId");
	  WebElement empId= driver.findElement(empIdLocator);
     String EmpId_TestData =empId.getAttribute("value");
     System.out.println("the Actual Employee Id is:-"+EmpId_TestData);
   
	   //<input type="button" class="" id="btnSave" value="Save">
	   
	   By SaveButtonProperty=By.id("btnSave");
       WebElement SaveButton=driver.findElement(SaveButtonProperty);
       SaveButton.click();
       
       //FirstName Vlidation
       
      
       //<input value="Lakshmi" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
      
       By Actual_FirstNameLocator =By.id("personal_txtEmpFirstName");
       WebElement Actual_FirstName=driver.findElement(Actual_FirstNameLocator);
      String get_Text_Actual_FirstName=Actual_FirstName.getAttribute("value");
	 	System.out.println("The Actual MiddleName is:"+get_Text_Actual_FirstName);
	 	if(get_Text_Actual_FirstName.equals(FirstNameTestData))
	 	{
	 		System.out.println("The Actual FirstName is Matched-pass");
	 	}
	 	else
	 	{
	 		System.out.println("The Actual FirstName is NotMatched-Fail");
	 	}
	 	
	 	//Middle Name Vlidation
	 //	<input value="Devi" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	 	
	 	
	 	By Actual_MiddleNameLocator =By.id("personal_txtEmpMiddleName");
	       WebElement Actual_MiddleName=driver.findElement(Actual_MiddleNameLocator);
	      String get_Text_Actual_MiddleName=Actual_MiddleName.getAttribute("value");
		 	System.out.println("The Actual MiddleName is:"+get_Text_Actual_MiddleName);
		 	if(get_Text_Actual_MiddleName.equals(MiddleNameTestData))
		 	{
		 		System.out.println("The Actual MiddleName is Matched-pass");
		 	
		 	}
		 	else
		 	{
		 		System.out.println("The Actual MiddleName is NotMatched-Fail");
		 	}
		 		
		 		//Last Name Validation
		 	//<input value="Tiruvuru" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		 		
		 	By Actual_LastNameLocator =By.id("personal_txtEmpLastName");
		       WebElement Actual_LastName=driver.findElement(Actual_LastNameLocator);
		      String get_Text_Actual_LastName=Actual_LastName.getAttribute("value");
			 	System.out.println("The Actual LastName is:"+get_Text_Actual_LastName);
			 	if(get_Text_Actual_LastName
			 			.equals(LastNameTestData))
			 	{
			 		System.out.println("The Actual LastName is Matched-pass");
			 	
			 	}
			 	else
			 	{
			 		System.out.println("The Actual LastName is NotMatched-Fail");
			 	}
	 	
			 	
			 	
			//EMPID Validation
			 	
			 	//<input value="0005" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
			 	By Actual_EmpIdLocator =By.id("personal_txtEmployeeId");
			       WebElement Actual_EmpIDName=driver.findElement(Actual_EmpIdLocator);
			      String get_EmpId_Value=Actual_EmpIDName.getAttribute("value");
				 	System.out.println("The Actual emp id  is:"+get_EmpId_Value);
				 	if(get_EmpId_Value.equals(EmpId_TestData))
				 	{
				 		System.out.println("The Actual EmpId is Matched-pass");
				 	
				 	}
				 	else
				 	{
				 		System.out.println("The Actual EmpId is NotMatched-Fail");
				 	}
				 	
				 				 	
			 	
	  By welcomeAdminButtonProperty=By.id("welcome");
	  WebElement welcomeAdminButtonButton=driver.findElement(welcomeAdminButtonProperty);
	  welcomeAdminButtonButton.click();
	 
	  //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>


	 Thread.sleep(10000);
	 By logoutproperty=By.linkText("Logout");
	  WebElement Logout=driver.findElement(logoutproperty);
	      Logout.click();
	     
	      String expected_OrangeHRMHomePageTitle2="OrangeHRM";//Should be
	System.out.println("The expected Title of OrangeHRM Home Page is :"+expected_OrangeHRMHomePageTitle2);

	String actual_OrangeHRMHomePageTitle2=driver.getTitle();
	System.out.println("The Actual Title of the OrangeHRM Home0 Page is:"+actual_OrangeHRMHomePageTitle2);

	if(actual_OrangeHRMHomePageTitle2.equals(expected_OrangeHRMHomePageTitle2))
	{
	System.out.println("The OrangeHRM Home Page Title is matched-PASS");
	}
	else
	{
	System.out.println("The OrangeHRM Home Page Title is NOT matched-FAIL");
	}


	String expected_OrangeHRMLoginPageUrlAddress1="orangehrm-4.2.0.1";//Should have
	   System.out.println("The Expected OrsngeHRM Home Page Url Address is:"+expected_OrangeHRMLoginPageUrlAddress1);

	    String actual_OrangeHRMHomePageUrlAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	    System.out.println("The Actual Current Address of the OrangeHRM Home Page is:"+actual_OrangeHRMHomePageUrlAddress);

	  if(actual_OrangeHRMHomePageUrlAddress.contains(expected_OrangeHRMLoginPageUrlAddress1))
	  {
	  System.out.println("Expected Url Address Found-PASS");
	  }
	  else
	  {
	  System.out.println("Expected Url Address NOT Found=FAIL");
	  }

	  String expected_LoginPageText1="LOGIN Panel";//Should be
	System.out.println("The expected Title of OrangeHRM Home Page is :"+expected_LoginPageText1);
	By LoginPannel1 = By.id("logInPanelHeading");
	WebElement LoginPanelOrangeHRM1=driver.findElement(LoginPannel1);

	String actual_LoginPageText1=LoginPanelOrangeHRM1.getText();
	System.out.println("The Actual Title of the OrangeHRM Home0 Page is:"+actual_LoginPageText1);

	if(actual_LoginPageText1.equals(expected_LoginPageText1))
	{
	System.out.println("The LoginPageText is -PASS");
	}
	else
	{
	System.out.println("The is LoginPageText is NOT matched-FAIL");
	}
	 //driver.quit();


	}

	}





