package com.tfa.vtiger.testscripts;

import org.testng.annotations.Test;

import com.tfa.vtiger.loginpage.BesePage;
import com.tfa.vtiger.loginpage.CreatContactPage;
import com.tfa.vtiger.loginpage.HomePage;
import com.tfa.vtiger.loginpage.LeadsLandingPage;
import com.tfa.vtiger.loginpage.LoginPage;

import freemarker.cache.MruCacheStorage;

public class VerifyContextTestScripts extends BeseTest {
	@Test
	public void vt001VerifyContactCreation() {
		webUtil.openURL("http://localhost:8888/");
		
		LoginPage log=new LoginPage(webUtil);
		log.enterUserName( "admin");
		webUtil.validateElementVisible("//input[@name='user_name']","User box Visible succesefuly");
		log.enterUserPassword("admin");
		log.enterUserSubmit();
		
		BesePage besepage=	new BesePage (webUtil);
		besepage.signOut();
		
		HomePage homele=new HomePage(webUtil);
		homele.clickToContactLink();
		BesePage besepag=	new BesePage (webUtil);
		besepage.signOut();
		
		HomePage homel=new HomePage(webUtil);
		homele.clickToContactLink();
		
		LeadsLandingPage leadsLandingPage=new LeadsLandingPage(webUtil);
		leadsLandingPage.clickOncreateLead();
		//input[@name='emailoptout']
		CreatContactPage creatContactPage= new CreatContactPage(webUtil);
		creatContactPage.slFristNametitle("Mr.");
		creatContactPage.fristName("Raj Kumar");
		creatContactPage.lastName("Yadav");
		creatContactPage.selectLeadSource("Cold Call");
	}
}
