package com.bugzilla.gra.searchbug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bugzilla.controls.wrappers.commonClass;


public class GRA_SearchBug {
	OR_SearchBug bugSearchPage;
	
	
	
	public GRA_SearchBug(WebDriver Driver){
		PageFactory.initElements(Driver, this);
		bugSearchPage = new OR_SearchBug(Driver);
		
	}
	
	
	public void selectSomething(){
//		bugSearchPage.wel_lst_bugStatus.sendKeys("Closed");
//		bugSearchPage.lst_bugStatus.regexSelect("aa");
//		bugSearchPage.lst_bugStatus.selectByText("Cl");
		bugSearchPage.lst_bugStatus.select("Closed");
//		bugSearchPage.lst_bugStatus.regexSelect("Cl");
		bugSearchPage.lst_bugStatus.regexSelect("Op");

		System.out.println("check object existance" + bugSearchPage.lst_bugStatus.Exists(5));
		System.out.println("check object existance" + bugSearchPage.lst_bugStatuss.Exists(5));
		bugSearchPage.wel_wb_search.click();
	}


}
