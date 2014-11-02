package com.bugzilla.listerner.overrides;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class OverrideClass implements WebDriverEventListener{
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
	System.out.println("value changed for"  + "--" + arg0.getAttribute("ID"));
		// TODO Auto-generated method stub		
	}
	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("something was clicked: " +arg0.toString() );
	}
	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
//		System.out.println("After clicking back  "+ driver.getCurrentUrl());		
	}
	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
//		System.out.println(arg1.getCurrentUrl() + "navigated to");
		// TODO Auto-generated method stub		
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeNavigateBack(WebDriver driver) {
//		System.out.println("Before clicking Back"+driver.getCurrentUrl());		
	}
	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub		
	}
}
