package com.bugzilla.test.bug.createNew;


/*
 *
 * 
 * 
 * 
 */


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;
import com.bugzilla.support.groups.StaticURLs;


public class PlainVanila extends PreTestLoader{
	

	@Test
	public void PlainVanila() throws IOException {

		//Open Target Page.
		BrowserDriver.get(StaticURLs.bugZillaHome);
		
		// Login
		graLogin.fn_plainLogin(m1);
		
		//Click on New link in top header
		graTopNav.fn_navigateToNewBug();
		
		//Logout
		graLogout.fn_Logout();
		
	}
    

}


