package com.bugzilla.test.auth;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.AuthenticationBase;


public class BasicLoginLogout extends AuthenticationBase{
	
	@Test
	public void BasicLoginLogout() throws IOException{
		BrowserDriver.get(StaticURLs.bugZillaHome);
		graLoginLogout.fn_TopNavLogin(m1);
		graLoginLogout.fn_Logout();
	}
    

}
