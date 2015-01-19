package com.bugzilla.test.bug.createNew;


import java.io.IOException;

import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.BugCreateBase;

public class CreateEditBug extends BugCreateBase{

	@Test
	public void BZ_CreateBug_BasicBug() throws IOException{
		eDriver.get(StaticURLs.bugZillaHome);
		graLoginLogout.fn_TopNavLogin(m1);
		graTopNav.fn_navigateToNewBug();
		graCreateBug.fn_CreateBug();
		graTopNav.fn_searchBugs();
		System.out.println(super.m1.get("BugID"));
		graSearchBug.selectSomething();
		graLoginLogout.fn_Logout();
	}
	


}
