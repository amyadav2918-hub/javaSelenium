package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class LoginPage extends BesePage {
	
	
	
	private WebUtil webUtil;
	public LoginPage(WebUtil webUtil) {
		super(webUtil);
		this.webUtil=webUtil;
		PageFactory.initElements(webUtil.getDriver(),this);
	}
	
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UserName;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement UserPassword;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement Login;
	

public void enterUserName(String value) {
	webUtil.sendKeys(UserName, value);
}
public void enterUserPassword(String value) {
	webUtil.sendKeys(UserPassword, value);
}
public void enterUserSubmit() {
	webUtil.click(Login);
}

}

