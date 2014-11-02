package com.bugzilla.controls.wrappers;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebList {
	
	WebElement s1;
	Select s2;// = new Select(s1);
	private List<WebElement> s3;
	
	public WebList(WebElement newWE){
		this.s1 = newWE;
	}
	
	public void selectByText(String selectionVal){
		s2 = new Select(s1);
		s2.selectByVisibleText(selectionVal);
	}
	
	public void regexSelect(String selectionVal){
		
		selectionVal = selectionVal.toLowerCase();
		
		s2 = new Select(s1);
		s3 = s2.getOptions();
		for (WebElement everyElem : s3){
			String matchingVal = everyElem.getText();
			if(everyElem.getText().toLowerCase().matches(".*" + selectionVal + ".*")){
				s2.selectByVisibleText(matchingVal);
			}
		}
	}
	
	public Boolean Exists(int TimeOut) {
		Boolean exist = false;
		try{
			this.s2 = new Select(s1);
			exist = true;
		}
		catch(NoSuchElementException e){
			exist = false;
			
		}
		finally{
			return exist;
		}
		
	}

	public void select(String string) {
		if(Exists(1)==true){
			System.out.println("Element found. value selected: " + string);
		s2.selectByVisibleText(string);
//		throw new NoSuchElementException();
		}
		else{
			throw new NoSuchElementException();
		}
		
		// TODO Auto-generated method stub
		
	}
}
