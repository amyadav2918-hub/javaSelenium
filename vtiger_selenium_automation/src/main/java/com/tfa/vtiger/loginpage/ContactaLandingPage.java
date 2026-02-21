package com.tfa.vtiger.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tfa.vtiger.utils.WebUtil;

public class ContactaLandingPage {
	private WebUtil webUtil;


	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickOncreateContacta;

	public ContactaLandingPage (WebUtil webUtil) {
		this.webUtil=webUtil;
		PageFactory.initElements(webUtil.getDriver(),this);
	}
	public void clickOncreateContacta() {
		webUtil.click(clickOncreateContacta);
	}

}
