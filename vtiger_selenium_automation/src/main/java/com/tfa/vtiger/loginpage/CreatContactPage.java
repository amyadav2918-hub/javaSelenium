package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class CreatContactPage {
	private WebUtil webUtil;
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement slFristName;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FristName;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;

   //	@FindBy(xpath="//input[@name='account_name']")
//	private WebElement CompanyName;

//	@FindBy(xpath="//input[@id='designation']")
//	private WebElement title;
//	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement SelectLeadSource;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement department;
	
	//input[@name='department']
	//email,assistant,name="assistantphone",//input[@name='emailoptout']
	public CreatContactPage(WebUtil webUtil) {
		this.webUtil=webUtil;
		PageFactory.initElements(webUtil.getDriver(),this);
	}
	public void slFristNametitle(String value) {
		webUtil.selectFromDropdownByValue(slFristName, value);	
	}
	public void fristName(String value) {
		webUtil.sendKeys(FristName,value);	
	}	
	public void lastName(String value) {
		webUtil.sendKeys(lastName, value);	
	}
//	public void companyname(String value) {
//		webUtil.sendKeys(CompanyName,value);	
//	}
public void selectLeadSource(String value) {
	webUtil.selectFromDropdownByValue(SelectLeadSource, value);	
}

	public void title(String value) {
		webUtil.sendKeys(title,value);	
	}
	public void department(String value) {
		webUtil.sendKeys(department,value);	
	}

}
