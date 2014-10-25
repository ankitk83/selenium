package com.bugzilla.support.groups;

import org.openqa.selenium.WebElement;

public class WebEdit extends commonClass {

	WebElement elemLocal;
	
	
	public WebEdit(WebElement elementRef){
		super.m1 = elementRef;
		this.elemLocal = super.m1;
	}
	
	public String getRowCount(){
		return "test comments";
		
	}
	
	public void getCellData(int row, int col){
		
	}
	
	public void getRowWithCellData(String data){
		
	}
}
