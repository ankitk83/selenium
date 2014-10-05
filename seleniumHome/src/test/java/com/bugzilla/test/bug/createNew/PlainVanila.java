package com.bugzilla.test.bug.createNew;


/*
 *
 * 
 * 
 * 
 */


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;
import com.bugzilla.support.groups.StaticURLs;

public class PlainVanila extends PreTestLoader{
	
	/*
	 * Create objects for 
	 */
	WebDriver oWebDriver;
	GRA_Login oLogin;
	GRA_TopNav oTopNav;
	GRA_Logout oLogout; 
	
	
	@BeforeTest
	public void callSuperClass(){
		/*
		 * load function from superClass which does following functions:
		 * 	1. Property Values.
		 * 	2. Sets Browser object.
		 * 	3. TBD 
		 */
		BeforeTestClass1();
		
		/*
		 * check loading of property values from subClass
		 */
		System.out.println("called in subclass" + Prop.getProperty("x1"));

		//Get webDriver object based on Browser value set in TestNG.xml; 
		oWebDriver = getBrowser();
		
		//Initiate objects for all GRAs.
		oLogin = PageFactory.initElements(oWebDriver, GRA_Login.class);
		oTopNav = PageFactory.initElements(oWebDriver, GRA_TopNav.class);
		oLogout = PageFactory.initElements(oWebDriver, GRA_Logout.class);
	}
	

	@Test
	public void BasicCheck() throws IOException {

		//Open Target Page.
		oWebDriver.get(StaticURLs.bugZillaHome);
		
		// Login
		oLogin.fn_plainLogin(m1);
		
		//Click on New link in top header
		oTopNav.fn_navigateToNewBug();
		
		//Logout
		oLogout.fn_Logout();
		
	}
    
	@AfterTest
	public void closeAll(){
		oWebDriver.close();
		oWebDriver.quit();
	}

}


