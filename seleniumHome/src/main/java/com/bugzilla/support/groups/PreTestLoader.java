package com.bugzilla.support.groups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import com.google.common.base.CaseFormat;

import static com.bugzilla.support.groups.StaticURLs.*;

public class PreTestLoader {

	private String oEnv;
	private String oBrows;
	private WebDriver BrowserDriver;
	public static HashMap m1;
	public static WebDriver local_webDriver;
	
	
	/*
	 * 
	 */
	public static void fn_loadTestData(){
		m1 = new HashMap();
		m1.put("UserName","ankit.kapoor83@gmail.com");
		m1.put("Password","password");
		
	}
	
	
	
	@BeforeTest
	@Parameters({"environment","browser"})
	public void getParams(@Optional String env, String brows) throws IOException{
		System.out.println("called 1");
//		System.out.println("called from beforetest:::" + env);
		this.oEnv = env;
		System.out.println("called from beforetest:::" + brows);
		this.oBrows = brows;
		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
		System.out.println("[][]" + this.oBrows.toString().toUpperCase().trim()+ "[][]");
		fn_setLoadBrowser();
		fn_loadTestData();
//		WebDriver c1 = new ChromeDriver();
//		c1.get("http://www.google.com");

	}
	
	
	
	private void fn_setLoadBrowser(){
		switch (this.oBrows.toString().toUpperCase().trim()) {
		
		case "FIREFOX":
			this.BrowserDriver = new FirefoxDriver();		
			break;

			
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
			this.BrowserDriver = new ChromeDriver();		
			break;
			
		default:
			break;
		}
	}
	
	
	public WebDriver getBrowser(){
		return this.BrowserDriver;
	}

	
	/*
	 * 
	 */
	public static WebDriver getLocal_webDriver() {
		return local_webDriver;
	}

	/*
	 * 
	 */
	public static void setLocal_webDriver(WebDriver local_webDriver) {
		PreTestLoader.local_webDriver = local_webDriver;
	}
	
}
