package com.bugzilla.test.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.bugzilla.global.values.RemoteMangement;
import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_LoginLogout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.gra.searchbug.GRA_SearchBug;
import com.bugzilla.listerner.overrides.OverrideClass;

public class TestBase  {
	
	
	public GRA_LoginLogout graLoginLogout;
	public GRA_TopNav graTopNav;
	public GRA_CreateBug graCreateBug;
	public GRA_SearchBug graSearchBug;
	

	private String oEnv;
	private String oBrows;
	protected WebDriver BrowserDriver;
	public WebDriver local_webDriver;
	private String methodName;
	public OverrideClass oc ;
	
	public EventFiringWebDriver eDriver;
	private Platform platform;
	public static HashMap<String, String> m1 = new HashMap<String, String>();
	
	
	@BeforeMethod
	@Parameters({"environment","browser"})
	public void fn_getParams(@Optional String env, @Optional String brows, Method method) throws IOException{
	    System.out.println("Test name: " + method.getName());
	    methodName = method.getName();
	    
	   
	    
//	    System.out.println("called 1");
		this.oEnv = env;
//		System.out.println("called from beforetest:::" + brows);
		this.oBrows = brows;
		fn_handleNullParams(env, brows);
//		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
//		System.out.println("[][]" + this.oBrows.toString().toUpperCase().trim()+ "[][]");
//		System.out.println("****" + Thread.currentThread().getStackTrace());
//		System.out.println("****" + Thread.currentThread().getId());
		String sa = Long.toString(Thread.currentThread().getId());
		this.m1.put("SessionID", sa);
		this.m1.put("TestName", methodName);
		System.out.println("Session ID is : " + m1.get("SessionID"));
		sa = "";
//		this.m1.put(methodName, oBrows);
//		System.out.println("--------------------");
//		fn_setLoadBrowser();
//		fn_loadTestData();
//		fn_loadClasses(methodName);
		RemoteMangement rm1 = new RemoteMangement();
		
		DesiredCapabilities capability  = new DesiredCapabilities();//= DesiredCapabilities.firefox();
		capability.setBrowserName(this.oBrows);
		String CapabilityURL = rm1.getEnvVars(this.oBrows);
		platform = rm1.getPlatform(CapabilityURL);		
//		string sessionId = (string) driver.Capabilities.GetCapability("webdriver.remote.sessionid");
	
		
		System.out.println(CapabilityURL);
		
		// Set the platform we want our tests to run on     
		capability.setPlatform(platform);
		System.out.println(capability.getBrowserName());
		BrowserDriver = new RemoteWebDriver(new URL("http://" + CapabilityURL.toString() + ":4444/wd/hub"), capability);
	
		
		/*
		 * this implementation did not work. a seperate util funciton has to be written to identify the driver host.
		 */
		BrowserDriver = new RemoteWebDriver(new URL("http://127.0.0.1"), capability); 
		
		

//		setData(methodName);
		eDriver  = new EventFiringWebDriver(this.BrowserDriver);
	
//		oc = new OverrideClass();
//		eDriver.register(oc);

	}
	
	private void fn_handleNullParams(String envVal, String browsVal){
		if(envVal==null){
			this.oEnv = "QA2";
		}
		if(browsVal==null){
			this.oBrows = "firefox";
		}
		
	}
	
	private void fn_setLoadBrowser(){
		switch (this.oBrows.toString().toUpperCase().trim()) {
		
		case "FIREFOX":
			BrowserDriver = new FirefoxDriver();		
			break;

			
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
			this.BrowserDriver = new ChromeDriver();		
			break;
			
		default:
			break;
		}
	}
	
	
	
	@AfterMethod
	public void closeAllItems(){
		eDriver.close();
		eDriver.quit();
		eDriver.unregister(oc);
		
		eDriver = null;
		oc = null;
//		BrowserDriver.close();
		BrowserDriver = null;
		platform = null;
//		graLogin = null;
//		graLogout = null;
		
	}
	
	
	
	public WebDriver getBrowser(){
		return this.BrowserDriver;
	}

	
	/*
	 * 
	 */
	public WebDriver getLocal_webDriver() {
		return local_webDriver;
	}

	/*
	 * 
	 */
	public void setLocal_webDriver(WebDriver local_webDriver) {
		this.local_webDriver = local_webDriver;
	}
	


//@AfterTest
//public void closeBrowsers(){
//	this.local_webDriver.close();
//	this.local_webDriver.quit();
//}
}