package com.bugzilla.support.groups;

import org.openqa.selenium.WebElement;

public class WebTable {
	
	WebElement elemLocal;
	
	
	public WebTable(WebElement elementRef){
		this.elemLocal = elementRef;
	}
	
	public String getRowCount(){
		return "test comments";
		
	}
	
	public void getColCount(){
		
	}
	
	public void getCellData(int row, int col){
		
	}
	
	public void getRowWithCellData(String data){
		
	}
	
}
