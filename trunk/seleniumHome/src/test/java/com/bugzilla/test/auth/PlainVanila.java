package com.bugzilla.test.auth;


/*
 *
 * 
 * 
 * 
 */


import java.io.IOException;

import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.AuthenticationBase;
import com.bugzilla.test.base.TestBase;


public class PlainVanila extends AuthenticationBase{
	

	@Test
	public void PlainVanila() throws IOException {

		//Open Target Page.
		BrowserDriver.get(StaticURLs.bugZillaHome);
		
		// Login
		graLoginLogout.fn_TopNavLogin(m1);
//		graLogin.fn_plainLogin(m1);
		
		//Click on New link in top header
		graTopNav.fn_navigateToNewBug();
		
		//Logout
		graLoginLogout.fn_Logout();
		
	}
    

}


