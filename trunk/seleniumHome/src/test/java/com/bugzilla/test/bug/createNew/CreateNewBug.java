package com.bugzilla.test.bug.createNew;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;


public class CreateNewBug extends PreTestLoader{
	
	
	
	@Test
	public void CreateNewBug() throws IOException{
		BrowserDriver.get(StaticURLs.bugZillaHome);
		ts.testLoginAction(m1);
//		graLogin.fn_plainLogin(m1);
		graTopNav.fn_navigateToNewBug();
		graCreateBug.fn_CreateBug();
		graLogout.fn_Logout();
	}
	


}
