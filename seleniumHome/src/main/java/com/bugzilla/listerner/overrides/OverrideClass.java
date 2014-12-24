package com.bugzilla.listerner.overrides;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import com.bugzilla.test.base.TestBase;

public class OverrideClass implements WebDriverEventListener{
	TestBase t1 = new TestBase();

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
	System.out.println("from listeners:  " + t1.m1.get("SessionID") + t1.m1.get("TestName") + "value changed for"  + "--" + arg0.getAttribute("ID") + t1);
	}
	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("from listeners:  " + t1.m1.get("SessionID") + t1.m1.get("TestName") + "click action performed on ");
	}
	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
//		System.out.println(arg1.toString() + " with XPATH " + arg0.toString() + " was looked up" );
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
//		System.out.println("After clicking back  "+ driver.getCurrentUrl());		
	}
	@Override
	public void afterNavigateForward(WebDriver arg0) {
	}
	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
//		System.out.println(arg1.getCurrentUrl() + "navigated to");
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
	}
	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
	}
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	}
	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
//		System.out.println(arg1.getAttribute("name") + " with XPATH " + arg0.toString() + " was looked up" );
	}
	@Override
	public void beforeNavigateBack(WebDriver driver) {
//		System.out.println("Before clicking Back"+driver.getCurrentUrl());		
	}
	@Override
	public void beforeNavigateForward(WebDriver arg0) {
	}
	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
	}
	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
	}
	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
	}
}
