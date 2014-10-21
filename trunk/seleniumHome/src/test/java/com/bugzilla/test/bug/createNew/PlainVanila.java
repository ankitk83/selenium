package com.bugzilla.test.bug.createNew;


/*
 *
 * 
 * 
 * 
 */


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		oWebDriver = getBrowser();
		oLogin = new GRA_Login(oWebDriver);
		oTopNav = new GRA_TopNav(oWebDriver);
		oLogout = new GRA_Logout(oWebDriver);
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


