package com.bugzilla.test.searchBugs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;

public class PlainSearch extends PreTestLoader{


	WebDriver local_webDriver ;
	GRA_Login login;
	GRA_TopNav oTopNav;
	GRA_Logout logout; 

	@BeforeTest
	public void callSuperClass(){

		 local_webDriver = getBrowser();
		 login = new GRA_Login(local_webDriver);
		 oTopNav = new GRA_TopNav(local_webDriver);
		 logout = new GRA_Logout(local_webDriver);
	}
	
	@Test
	public void BasicCheck() throws IOException{
		local_webDriver.get("http://10.0.0.20/bugzilla");
		login.fn_plainLogin(m1);
		oTopNav.fn_searchBugs();
		logout.fn_Logout();
	}
    
	@AfterTest
	public void closeAll(){
		local_webDriver.close();
		local_webDriver.quit();
	}

}
