package com.bugzilla.global.values;

import org.openqa.selenium.Platform;

public class RemoteMangement {
		

	
	private String nodeIP;
	private String chromeIP;
	private String firefoxIP;
	private Platform returnPlatform;
	private static int firefoxNodeNumber = 1;
	private static int chromeNodeNumber = 1;
	
	
	public String getEnvVars(String Browser){
		switch (Browser){
		case "firefox":
			nodeIP = getFireFoxIPs();
			System.out.println("Firefox IP returned " + nodeIP );
			break;
		case "chrome": 
			nodeIP = getChromeIPs();
			break;
		case "internet explorer":
			nodeIP = getInternetExplorerIPs();
			break;
		case "localhost":
			nodeIP = "127.0.0.1";
		default:
			break;
		
		}
		return nodeIP;
	}
	
	private String getChromeIPs(){
//		resetChromeNodeNumber();
		switch (chromeNodeNumber){
	case 1:
		chromeIP = "CHROMEIP: 10.0.0.20";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 2:
		chromeIP = "CHROMEIP: 10.0.0.21";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 3:
		chromeIP = "CHROMEIP: 10.0.0.22";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 4:
		chromeIP = "CHROMEIP: 10.0.0.23";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	default:
		break;
	}
		return chromeIP;
	}
	
	private String getFireFoxIPs(){
		resetFirefoxNodeNumber();
		System.out.println("before run: " + firefoxNodeNumber);

		switch (firefoxNodeNumber){
	case 1:
		firefoxIP = "10.0.0.4";
		break;
	case 2:
		firefoxIP = "10.0.0.20";
		break;
	default:
		break;
	}
		System.out.println("after run   " + firefoxNodeNumber);
		firefoxNodeNumber = firefoxNodeNumber  +1;
		return firefoxIP;
	}
	
	private String getInternetExplorerIPs(){
//		resetFirefoxNodeNumber();
		switch (chromeNodeNumber){
	case 1:
		chromeIP = "CHROMEIP: 10.0.0.4";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 2:
		chromeIP = "CHROMEIP: 10.0.0.21";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 3:
		chromeIP = "CHROMEIP: 10.0.0.22";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	case 4:
		chromeIP = "CHROMEIP: 10.0.0.23";
		chromeNodeNumber = chromeNodeNumber +1;
		break;
	default:
		break;
	}
		return chromeIP;
	}
	


private void resetFirefoxNodeNumber(){
	if(firefoxNodeNumber >= 3){
		System.out.println("firefox node reset done");
		RemoteMangement.firefoxNodeNumber = 1;
	}
		
	}

public Platform getPlatform(String capabilityURL){
	
	switch (capabilityURL){
	case "10.0.0.4":
		returnPlatform = Platform.WINDOWS;
		break;
	case "10.0.0.20":
		returnPlatform = Platform.LINUX;
		break;
	default:
		System.out.println("blankssss   " + capabilityURL);
		break;
	}
	return returnPlatform;
	
	
}
	
}
