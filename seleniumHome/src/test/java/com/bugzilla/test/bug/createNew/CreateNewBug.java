package com.bugzilla.test.bug.createNew;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.BugCreateBase;


public class CreateNewBug extends BugCreateBase{
	
	@Test
	public void BZ_CreateBug_BasicBug() throws IOException{
		eDriver.get(StaticURLs.bugZillaHome);
		graLoginLogout.fn_TopNavLogin(m1);
		graTopNav.fn_navigateToNewBug();
		graCreateBug.fn_CreateBug();
		graLoginLogout.fn_Logout();
	}
	


}
