package com.bugzilla.gra.createbug;

import static com.bugzilla.gra.createbug.OR_CreateBug.*;

import com.bugzilla.controls.wrappers.WebEdit;
import com.bugzilla.controls.wrappers.WebTable;
import com.bugzilla.support.groups.PreTestLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GRA_CreateBug {


	@FindBy(xpath=val_we_bugSummary)
	WebElement we_temp_bugSummary;
	
	@FindBy(xpath=val_we_bugDescription)
	WebElement we_temp_bugDescription;
	
	@FindBy(xpath=val_wb_submitBug)
	WebElement wb_submitBug;

	@FindBy(xpath=val_wb_submitBug)
	WebElement wb_tblBug;
	
	@FindBy(xpath=val_wb_submitBug)
	WebElement we_tblBug;
	
	private WebTable w1;
	private WebEdit we_bugSummary;

	private WebEdit we_bugDescription;
	
	public GRA_CreateBug(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
//		System.out.println("****" + this.getClass().toString() + "*****");
		w1 = new WebTable(wb_tblBug);
		we_bugSummary = new WebEdit(we_temp_bugSummary);
		we_bugDescription = new WebEdit(we_temp_bugDescription);
		fn_getFieldType(we_temp_bugSummary);
		
	}
	
	public void fn_CreateBug(){
		System.out.println(w1.getRowCount());
		we_bugSummary.set("blank val for now");
		we_bugDescription.set("test description");
		wb_submitBug.click();
		
	}
	
	private void fn_getFieldType(WebElement elemName){
		System.out.println(elemName.toString() + "-----------******");
		System.out.println(elemName.getClass().toString());
	}

}
