package com.bugzilla.listerner.overrides;

import org.testng.IConfigurationListener;
import org.testng.IExecutionListener;
import org.testng.ITestResult;

public class methondListener implements IConfigurationListener {


	@Override
	public void onConfigurationSuccess(ITestResult itr) {
		System.out.println("35454654654564564456"+itr.getTestContext().getAttributeNames().toString());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		
	}

}
