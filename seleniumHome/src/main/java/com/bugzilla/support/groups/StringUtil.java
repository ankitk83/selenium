package com.bugzilla.support.groups;

import java.util.HashMap;

public class StringUtil {

	public String fn_fetchStringFromMap(HashMap oHMAP, String vKVal){
//		return null;
		return (String) oHMAP.get(vKVal);
		
	}
}
