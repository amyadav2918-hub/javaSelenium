package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class LeadsLandingPage {
private WebUtil webUtil;


@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement clickOncreateLead;

public LeadsLandingPage(WebUtil webUtil) {
	this.webUtil=webUtil;
	PageFactory.initElements(webUtil.getDriver(),this);
}
public void clickOncreateLead() {
	webUtil.click(clickOncreateLead);
}
}
