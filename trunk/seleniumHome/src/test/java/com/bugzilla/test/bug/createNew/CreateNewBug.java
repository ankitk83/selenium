package com.bugzilla.test.bug.createNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;

public class CreateNewBug extends PreTestLoader{
	
	
	WebDriver oWebDriver;
	

	GRA_Login oLogin;
	GRA_TopNav oTopNav;
	GRA_CreateBug oCreateBug;
	GRA_Logout oLogout;
	
	@BeforeTest
	public void callSuperClass(){
		
		oWebDriver = getBrowser();
		oLogin = new GRA_Login(oWebDriver);
		oTopNav = new GRA_TopNav(oWebDriver);
		oCreateBug = new GRA_CreateBug(oWebDriver);
		oLogout = new GRA_Logout(oWebDriver);
	}
	
	

	@Test
	public void createNewBug(){
		oWebDriver.get("http://10.0.0.20/bugzilla");
		oLogin.fn_plainLogin(m1);
		oTopNav.fn_navigateToNewBug();
		oCreateBug.fn_CreateBug();
		oLogout.fn_Logout();
	}
	
	@AfterTest
	public void closeAll(){
//		oWebDriver.close();
//		oWebDriver.quit();
	}


}
