package com.bugzilla.test.searchBugs;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.BugSearchBase;


public class PlainSearch extends BugSearchBase{


	@Test
	public void PlainSearch() throws IOException{
		BrowserDriver.get(StaticURLs.bugZillaHome);
		graLoginLogout.fn_TopNavLogin(m1);
		graTopNav.fn_searchBugs();
		graSearchBug.selectSomething();
		graLoginLogout.fn_Logout();
	}
    

}
