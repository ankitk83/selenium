package com.bugzilla.controls.wrappers;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.IClass;
import org.testng.IResultMap;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.internal.ConstructorOrMethod;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;


public class commonClass {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 WebElement e1;
	ITestClass cls;
	Thread th;
//	
//	public void set(String string){
//		System.out.println(Thread.currentThread().getId() + "classNamessss");
//		System.out.println("0000-" + m1.get);
////		System.out.println(cls.getInstanceHashCodes().toString());
////		System.out.println("");
//		m1.sendKeys(string);
////		System.out.println(Thread.currentThread().getName() + "THREADSSSSS");
////		System.out.println(Thread.currentThread().getId());
////		System.out.println(Thread.currentThread().getClass());	
//		System.out.println("****11" + Thread.currentThread().getId());
//		System.out.println("****11" + this.getClass().getClassLoader().toString());
//
//	}
	
	public commonClass(){
		System.out.println(this.getClass().getSimpleName() + "called common class");
		String caller = this.getClass().getSimpleName();
		switch (caller.trim().toLowerCase()){
		case "webedit":
			System.out.println("webedit called common");
			break;
		case "weblist":
			System.out.println("weblist called common");
			break;
		}
	}
	
	public void click(){
		System.out.println("clicking logging testing" + e1.toString());
		e1.click();
	}
	
	public void set(String string){
		e1.sendKeys(string);
		System.out.println(string);
	}
	
	public Boolean hasText(String TextForValidation){
		String tempTextVal = e1.getText();
		if(tempTextVal.contentEquals(TextForValidation) == true){
			System.out.println("text exists...");
		}
		
		return null;
		
	}

	
}

