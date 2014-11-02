package com.bugzilla.test.searchBugs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.support.groups.PreTestLoader;

import org.testng.annotations.BeforeClass;


public class PlainSearch extends PreTestLoader{


	@Test
	public void PlainSearch() throws IOException{
		BrowserDriver.get(StaticURLs.bugZillaHome);
		ts.testLoginAction(m1);
//		graLogin.fn_plainLogin(m1);
//		graLogin.wel_wl_login.click();
//		graLogin.page("username").set("ankit.kapoor");
//		graLogin.we_username().set("ankit.kapoor");
		graTopNav.fn_searchBugs();
		graSearchBug.selectSomething();
		graLogout.fn_Logout();
	}
    

}
