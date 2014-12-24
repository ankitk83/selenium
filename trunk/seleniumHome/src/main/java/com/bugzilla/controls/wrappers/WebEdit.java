package com.bugzilla.controls.wrappers;

import org.openqa.selenium.WebElement;

import bsh.This;

public class WebEdit extends commonClass {

	WebElement elemLocal;
	Class a1;
	
	
	public WebEdit(WebElement elementRef){
		System.out.println(this.getClass().getClassLoader().getParent().toString() + " called webedit");
		super.e1 = elementRef;
		this.elemLocal = super.e1;
	}
	
	public String getRowCount(){
		return "test comments";
		
	}
	

	public void set(String string){
		
		
//		System.out.println(Thread.currentThread().getId() + "classNamessss");
//		System.out.println("0000-" + elemLocal);
//		System.out.println(cls.getInstanceHashCodes().toString());
//		System.out.println("");
		e1.sendKeys(string);
		System.out.println(string);
//		System.out.println(Thread.currentThread().getName() + "THREADSSSSS");
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getClass());	
//		System.out.println("****11" + Thread.currentThread().getId());
//		System.out.println("****11" + this.getClass().getClassLoader().toString());

	}
	
	
	
	
	
	//Common functions can live in home class
	public String getROProperty(String propName){
		return propName;
		
	}
	
	public boolean Exists(int waitTime){
		return false;
		
	}
	
	
	
	
}
