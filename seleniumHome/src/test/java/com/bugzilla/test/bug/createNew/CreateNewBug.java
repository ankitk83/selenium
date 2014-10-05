package com.bugzilla.test.bug.createNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;

public class CreateNewBug extends PreTestLoader{
	
	
	WebDriver local_webDriver = new FirefoxDriver();

	GRA_Login login = PageFactory.initElements(local_webDriver, GRA_Login.class);
	GRA_TopNav topNav = PageFactory.initElements(local_webDriver, GRA_TopNav.class);
	GRA_CreateBug createBug = PageFactory.initElements(local_webDriver, GRA_CreateBug.class);
	GRA_Logout logout = PageFactory.initElements(local_webDriver, GRA_Logout.class);
	

	@Test
	public void createNewBug(){
		local_webDriver.get("http://10.0.0.20/bugzilla");
		login.fn_plainLogin(m1);
		topNav.fn_navigateToNewBug();
		createBug.fn_CreateBug();
		logout.fn_Logout();
	}

}
