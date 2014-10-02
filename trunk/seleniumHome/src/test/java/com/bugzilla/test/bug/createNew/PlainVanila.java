package com.bugzilla.test.bug.createNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;

public class PlainVanila {
	
	WebDriver local_webDriver = new FirefoxDriver();

	GRA_Login login = PageFactory.initElements(local_webDriver, GRA_Login.class);
	GRA_TopNav topNav = PageFactory.initElements(local_webDriver, GRA_TopNav.class);
	GRA_Logout logout = PageFactory.initElements(local_webDriver, GRA_Logout.class);
	
	
	
	@Test
	public void BasicCheck(){
		local_webDriver.get("http://10.0.0.20/bugzilla");
		login.fn_plainLogin();
		topNav.fn_navigateToNewBug();
		logout.fn_Logout();
		
	}
    


}
