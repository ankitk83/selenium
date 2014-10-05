package com.bugzilla.support.groups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import static com.bugzilla.support.groups.StaticURLs.*;

public class PreTestLoader {

	public Properties Prop = new Properties();
	InputStream InStream = null;
	public String getProps(String propName) throws IOException{
		
		InStream = new FileInputStream("config.properties");
		Prop.load(InStream);
		return Prop.getProperty(propName);
	
	}
	
	/*
	 * 
	 */
	public static HashMap m1;
	
	
	
	/*
	 * 
	 */
	public static WebDriver local_webDriver;
	
	
	/*
	 * 
	 */
	public static void tempA(){
		m1 = new HashMap();
		m1.put("UserName","ankit.kapoor83@gmail.com");
		m1.put("Password","password");
		
	}
	
	
	
	/*
	 * 
	 */
//	public static String getVal(String keyItem){
//		return (String) m1.get(keyItem);
//	}
	
	

	/*
	 * 
	 */
	@BeforeTest
	public void getParams() throws IOException{
		System.out.println("called 1");
		//System.out.println(Prop);
	}
	
	
	public WebDriver getBrowser(){
		return new FirefoxDriver();
	}
	
	
	/*
	 * 
	 */
	public void BeforeTestClass1(){
		
//		PreTestLoader.local_webDriver = new FirefoxDriver();

		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
		System.out.println("called 2");
		
		tempA();
		
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
