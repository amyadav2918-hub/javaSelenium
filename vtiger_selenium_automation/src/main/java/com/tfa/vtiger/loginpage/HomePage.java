package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class HomePage {
	private WebUtil wu;
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement clickToContact;
	
	@FindBy  (xpath="//a[@href='index.php?module=Leads&action=index']") 
	private WebElement clickToLead;
	
	@FindBy  (xpath="//a[@href='index.php?module=Accounts&action=index']") 
	private WebElement clickToOrganizations;
	
	@FindBy  (xpath="//a[@href='index.php?module=Calendar&action=index']") 
	private WebElement clickToCalendar;
	
public HomePage(WebUtil wu) {
		this.wu=wu;
		PageFactory.initElements(wu.getDriver(),this);
	}

public void clickToLeadLink() {
	
	wu.click( clickToLead);
}
public void clickToContactLink() {
	
	wu.click( clickToContact);
}
public void clickToOrganizationsLink() {
	
	wu.click( clickToOrganizations);
}
public void clickToCalendarLink() {
	
	wu.click( clickToCalendar);
}

}
