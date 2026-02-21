package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class BesePage {
	private WebUtil webUtil;
	
	public BesePage(WebUtil webUtil) {
		this.webUtil=webUtil;
		PageFactory.initElements(webUtil.getDriver(),this);
	}
	@FindBy(xpath="")
	private WebElement Save;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signOut;
	public void save() {
		webUtil.click(Save);
	}
	public void signOut() {
		webUtil.click(signOut);
	}
}
