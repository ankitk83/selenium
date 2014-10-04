package com.bugzilla.support.groups;

import org.testng.annotations.BeforeTest;

import bsh.This;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class BeforeTestClass {

	
	public void BeforeTestClass1(){
		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
	}
}
