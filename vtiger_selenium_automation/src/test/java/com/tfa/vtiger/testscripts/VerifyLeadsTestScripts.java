package com.tfa.vtiger.testscripts;



import org.testng.annotations.Test;
import org.tfa.vtiger.utils.WebUtil;

import com.tfa.vtiger.loginpage.BesePage;
import com.tfa.vtiger.loginpage.CreatLeadPage;
import com.tfa.vtiger.loginpage.HomePage;
import com.tfa.vtiger.loginpage.LeadsLandingPage;
import com.tfa.vtiger.loginpage.LoginPage;

public class VerifyLeadsTestScripts extends BeseTest{

@Test
	public void vt001VerifyLeadCreation()  {
                
		        webUtil.openURL("http://localhost:8888/");
		
				LoginPage log=new LoginPage(webUtil);
				log.enterUserName( "admin");
				webUtil.validateElementVisible("//input[@name='user_name']","User box Visible succesefuly");
				log.enterUserPassword("admin");
				log.enterUserSubmit();
				
				BesePage besepage=	new BesePage (webUtil);
				besepage.signOut();
				
				HomePage homele=new HomePage(webUtil);
				homele.clickToLeadLink();
				
				LeadsLandingPage leadsLandingPage=new LeadsLandingPage(webUtil);
				leadsLandingPage.clickOncreateLead();
				
				CreatLeadPage creatLeadPage=new CreatLeadPage(webUtil);
				creatLeadPage.slFristNametitle("Mr.");
				creatLeadPage.fristName("Raj Kumar");
				creatLeadPage.lastName("Yadav");
				creatLeadPage.companyname("Bhel");
				creatLeadPage.title("Empoly");
				creatLeadPage.selectLeadSource("Cold Call");
				creatLeadPage.selectIndustry("Energy");
				creatLeadPage.annualRivenu("1200000");
				creatLeadPage.numOfImply("1000");
				
				creatLeadPage.secondEmail("as123@gmail.com");
				//creatLeadPage.title("manegar");
				
				
				creatLeadPage.phone("6393323405");
				creatLeadPage.mobail("775412292");
				creatLeadPage.fax("453");
				creatLeadPage.email("raj123@gmail.com");
				creatLeadPage.website("www.amzon.com");
				creatLeadPage.slLeadStatce("Hot");
				creatLeadPage.slRating("Active");
				//creatLeadPage.phone("6393323405");
//				creatLeadPage.city("hadohi");
//				creatLeadPage.country("India");
//				creatLeadPage.email("sd123@gmail.com");
//				creatLeadPage.slLeadStatce("Hot");
//				creatLeadPage.slRating("Active");
//				creatLeadPage.street("pipris Nayepur Bhadohi Up india 221401");
//				creatLeadPage.postalCode("231");
//				creatLeadPage.poBox("rfe");
//				creatLeadPage.state("up");
//				creatLeadPage.save();
		//wu.validateUrlEquals("ttp://localhost:8888", "pass");
//		wu.sendKeys("//input[@name='user_name']", "admin");
//		wu.sendKeys("//input[@name='user_password']", "admin");
//		wu.click("//input[@id='submitButton']");
//		wu.click("//a[@href='index.php?module=Leads&action=index']");
//		wu.click("//img[@src='themes/softed/images/btnL3Add.gif']");
//		wu.isDropdownOptionPresent("//select[@name='salutationtype']","Mr.");
//		wu.selectFromDropdownByValue("//select[@name='salutationtype']","Mr.");
//		wu.sendKeys("//input[@name='firstname']", "Raj Kumar");
//		wu.sendKeys("//input[@name='lastname']","Yadav");
//		wu.sendKeys("//input[@name='company']","BHEL");
//		wu.sendKeys("//input[@id='designation']","Manegar");
//
//		wu.selectFromDropdownByValue("//select[@name='leadsource']","Partner");
//		wu.selectFromDropdownByValue("//select[@name='industry']","Energy");
//		wu.sendKeys("//input[@name='annualrevenue']","120000");
//		wu.sendKeys("//input[@name='noofemployees']","1000");
//		wu.sendKeys("//input[@name='secondaryemail']","Yadav123@gmail.com");
//		wu.sendKeys("//input[@name='phone']","6306955015");
//		wu.sendKeys("//input[@name='mobile']","6393323405");
//		wu.sendKeys("//input[@name='fax']","120");
//		wu.sendKeys("//input[@name='email']","rew321@gmail.com");
//		wu.sendKeys("//input[@name='website']","www.raj");
//		wu.selectFromDropdownByValue("//select[@name='leadstatus']","Warm");
//		wu.selectFromDropdownByValue("//select[@name='rating']","Active");
//		wu.click("//input[@value='T']");
		//.sendKeys("//textarea[@name='lane']", "Lagnvari  amilori badohi  ");
		//wu.selectFromDropdownByValue("//select[@name='assigned_group_id']","Team Selling");
//		wu.jsScrollToElement("//textarea[@name='lane']");
//		wu.sendKeys("//textarea[@name='lane']","Lagnvari  amilori badohi  ");
//		wu.sendKeys("//input[@name='code']","123");
//		wu.sendKeys("//input[@name='country']","India");
//		wu.sendKeys("//input[@name='pobox']","rock");
//		wu.sendKeys("//input[@name='city']","bhadohi");
//		wu.sendKeys("//input[@name='state']","Uttar Prades");
//		wu.sendKeys("//textarea[@name='description']","Done");
//		wu.click("//input[@title='Save [Alt+S]']");
//		//wu.acceptAlert();
//		//wu.dismissAlert();
//		wu.validateTextContains("//span[@class='dvHeaderText']", "Yadav Raj", "lead was createded successfuly");
//		//		
	}
	//	Test Case 1: Create New Lead with Valid Data
	//	Objective: Verify that a new lead can be created successfully with all mandatory and optional fields
	//
	//	Preconditions:
	//
	//	User is logged into Vtiger CRM with appropriate permissions
	//
	//	Leads module is accessible from the navigation menu
	//
	//	No duplicate lead with the same company name exists
	//
	//	Test Steps:
	//
	//	Navigate to Leads module by clicking on Leads in the navigation menu
	//
	//	Click on "Create Lead" button to open lead creation form
	//
	//	Enter valid first name in the First Name field
	//
	//	Enter valid last name in the Last Name field
	//
	//	Enter company name in the Company field
	//
	//	Select lead status from dropdown (e.g., "New")
	//
	//	Enter email address in the Email field
	//
	//	Enter phone number in the Phone field
	//
	//	Fill optional address information (Street, City, State, Zip Code, Country)
	//
	//	Add description in the Description text area
	//
	//	Click on "Save" button to create the lead
	//
	//	Validation Steps:
	//
	//	Verify success message is displayed indicating lead was created successfully
	//
	//	Verify user is redirected to lead detail view page
	//
	//	Validate all entered data is correctly displayed on detail page:
	//
	//	First Name and Last Name match input values
	//
	//	Company name matches input value
	//
	//	Lead status matches selected value
	//
	//	Email and phone values are correct
	//
	//	Address information is properly saved
	//
	//	Description text is preserved
	//
	//	Verify lead is visible in Leads list view
	//
	//	Verify lead ID is generated and displayed
	//
	//select[@name='salutationtype']leadsourceindustry mobile fax email website
	//input[@name='firstname']
	//input[@name='lastname']annualrevenue leadstatus assigned_user_id //input[@value='T']
	//company
	//public void vt002VerifyDeleteLead() {
//		WebUtil wu = new WebUtil();
//		wu.launchBrowser();
//		wu.openURL("http://localhost:8888");
//		wu.validateUrlContains("http://localhost:8888","browser lunch correctly");
//		wu.sendKeys("//input[@name='user_name']","admin");
//		wu.sendKeys("//input[@name='user_password']","admin");
//		wu.click("//input[@id='submitButton']");
//		wu.click("//a[@href='index.php?module=Leads&action=index\']");
//		wu.click("//input[@id='134']");
//		////wu.click("//input[@value='Delete']");
//		////wu.acceptAlert();
//		wu.validateElementPresent("//input[@id='134']", "this lead is not found");
//		//		wu.click("//img[@src='themes/softed/images/btnL3Add.gif\']");
//		//		wu.selectByValue("//select[@name='salutationtype']","Mr.");
//		//		wu.sendKeys("//input[@name='firstname']","Yogesh ");
//		//		wu.sendKeys("//input[@name='lastname']","Yadav");
//		//		wu.sendKeys("//input[@name='company']","Hero");
//		//		wu.selectByValue("//select[@name='leadstatus']","Hot");//input[@title='Save [Alt+S]']
//		//		wu.click("//input[@title='Save [Alt+S]']");
//		//		wu.navigateBack();
//		//		wu.navigateBack();
//		//		
//		//		Test Case 2: Create Lead with Mandatory Fields Only leadstatus
//		//		Objective: Verify lead creation works with only required fields
//		//
//		//		Test Steps:
//		//
//		//		Navigate to Leads module
//		//
//		//		Click on "Create Lead" button
//		//
//		//		Enter first name in First Name field
//		//
//		//		Enter last name in Last Name field
//		//
//		//		Enter company name in Company field
//		//
//		//		Select lead status from dropdown
//		//
//		//		Click "Save" button
//		//
//		//		Validation Steps:
//		//
//		//		Verify lead is created successfully
//		//
//		//		Verify success message appears
//		//
//		//		Confirm default values for optional fields are handled properly
//		//
//		//		Verify lead appears in leads list
//
//
//	}
//
//	public void vt003VerifyLeadCreationMainFunStion() {
//
//		WebUtil wu = new WebUtil();
//		wu.launchBrowser();
//		wu.openURL("http://localhost:8888");
//		wu.validateUrlContains("http://localhost:8888","browser lunch correctly");		wu.sendKeys("//input[@name='user_name']","admin");
//		wu.sendKeys("//input[@name='user_password']","admin");
//
//		wu.click("//input[@id='submitButton']");
//		wu.click("//a[@href='index.php?module=Leads&action=index\']");
//		wu.click("//img[@src='themes/softed/images/btnL3Add.gif\']");
//		wu.selectByValue("//select[@name='salutationtype']","Mr.");
//		wu.sendKeys("//input[@name='firstname']","Yogesh ");
//		wu.sendKeys("//input[@name='lastname']","Yadav");
//		wu.sendKeys("//input[@name='company']","Hero");
//		wu.selectByValue("//select[@name='leadstatus']","Hot");//input[@title='Save [Alt+S]']
//		wu.click("//input[@title='Save [Alt+S]']");
//		wu.navigateBack();
//		wu.navigateBack();
//
//
//
//	}
//	public void vt003VerifyLeadCInvalidData() {
//		WebUtil wu = new WebUtil();
//		wu.launchBrowser();
//		wu.openURL("http://localhost:8888");
//		wu.sendKeys("//input[@name='user_name']","admin");
//		wu.sendKeys("//input[@name='user_password']","admin");
//		wu.click("//input[@id='submitButton']");
//		wu.click("//a[@href='index.php?module=Leads&action=index\']");
//		wu.click("//img[@src='themes/softed/images/btnL3Add.gif\']");
//		wu.sendKeys("//input[@id='email']", "asr3445");
//
//	}
//	//	Test Case 3: Create Lead with Invalid Data
//	//	Objective: Verify validation prevents lead creation with invalid data
//	//
//	//	Test Steps:
//	//
//	//	Navigate to Create Lead form
//	//
//	//	Attempt to save without entering first name
//	//
//	//	Attempt to save without entering last name
//	//
//	//	Attempt to save without entering company name
//	//
//	//	Enter invalid email format
//	//
//	//	Enter invalid phone number format
//	//
//	//	Validation Steps:
//	//
//	//	Verify validation messages appear for required fields
//	//
//	//	Verify error message for invalid email format
//	//
//	//	Verify error message for invalid phone format
//	//
//	//	Confirm lead is not created when validation fails
//	//
//	//	Verify form remains open with entered data preserved
//

}
