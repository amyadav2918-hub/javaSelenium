package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class CreatLeadPage {
private WebUtil webUtil;

@FindBy(xpath="//select[@name='salutationtype']")
private WebElement slFristName;
@FindBy(xpath="//input[@name='firstname']")
private WebElement FristName;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lastName;

@FindBy(xpath="//input[@name='company']")
private WebElement CompanyName;

@FindBy(xpath="//input[@id='designation']")
private WebElement title;

@FindBy(xpath="//input[@name='annualrevenue']")
private WebElement AnnualRivenu;

@FindBy(xpath="//select[@name='leadsource']")
private WebElement SelectLeadSource;
@FindBy(xpath="//select[@name='industry']")
private WebElement SelectIndustry;

@FindBy(xpath="//input[@id='noofemployees']")
private WebElement numOfImply;
@FindBy(xpath="//input[@name='secondaryemail']")
private WebElement secondEmail;
//input[@name='secondaryemail']


@FindBy(xpath="//input[@id='phone']")
private WebElement phone;
@FindBy(xpath="//input[@id='mobile']")
private WebElement mobail;
@FindBy(xpath="//input[@name='fax']")
private WebElement fax;


@FindBy(xpath="//input[@name='email']")
private WebElement email;






@FindBy(xpath="//input[@name='website']")
private WebElement website;


@FindBy(xpath="//select[@name='leadstatus']")
private WebElement slLeadStatce;


@FindBy(xpath="//select[@name='rating']")
private WebElement slRating;
@FindBy(xpath="//textarea[@name='lane']")
private WebElement Street;

@FindBy(xpath="//input[@value='T'")
private WebElement Usergroup;


@FindBy(xpath="//input[@id='code']")
private WebElement PostalCode;

@FindBy(xpath="//input[@name='country']")
private WebElement country;

@FindBy(xpath="//input[@name='city']")
private WebElement City;

@FindBy(xpath="//input[@name='state']")
private WebElement State;

@FindBy(xpath="//textarea[@name='description']")
private WebElement Description;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement Save;

@FindBy(xpath="//input[@name='pobox']")
private WebElement PoBox;









public CreatLeadPage(WebUtil webUtil) {
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
public void companyname(String value) {
	webUtil.sendKeys(CompanyName,value);	
}
public void title(String value) {
	webUtil.sendKeys(title,value);	
}
public void annualRivenu(String value) {
	webUtil.sendKeys(AnnualRivenu,value);	
}public void selectLeadSource(String value) {
	webUtil.selectFromDropdownByValue(SelectLeadSource, value);	
}
  public void selectIndustry(String value) {
	webUtil.selectFromDropdownByValue(SelectIndustry, value);	
}
  public void numOfImply(String value) {
	webUtil.sendKeys(numOfImply,value);	
}
  public void secondEmail(String value) {
	webUtil.sendKeys(secondEmail,value);	
}
public void phone(String value) {
	webUtil.sendKeys(phone,value);	
}
public void mobail(String value) {
	webUtil.sendKeys(mobail,value);	
}
public void fax(String value) {
	webUtil.sendKeys(fax,value);	
}
public void email(String value) {
	webUtil.sendKeys(email,value);	
}
public void website(String value) {
	webUtil.sendKeys(website,value);	
}
public void slLeadStatce(String value) {
	webUtil.selectFromDropdownByValue(slLeadStatce, value);
}
public void slRating(String value) {
	webUtil.selectFromDropdownByValue(slRating, value);	
}
public void street(String value) {
	webUtil.sendKeys(Street,value);	
}

public void usergroup() {
	webUtil.click(Usergroup);	
}

public void postalCode(String value) {
	webUtil.sendKeys(PostalCode,value);	
}
public void country(String value) {
	webUtil.sendKeys(country,value);	
}public void poBox(String value) {
	webUtil.sendKeys(PoBox,value);	
}
public void city(String value) {
	webUtil.sendKeys(City,value);	
}
public void state(String value) {
	webUtil.sendKeys(State,value);	
}
public void description(String value) {
	webUtil.sendKeys(Description,value);	
}
public void save() {
	webUtil.click(Save);	
}







}
