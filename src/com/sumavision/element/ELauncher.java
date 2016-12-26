package com.sumavision.element;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;

import com.sumavision.base.ElementPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ELauncher extends ElementPage {
	
	public ELauncher(AndroidDriver driver) {
		super(driver);
	}
	
	private String HOME = "";
	private String GAME = "";
	private String SHOPPING = "";
	private String APPLIST = "";
	
	private boolean isResultFlag(String flagName) {
		try {
			return isIamgeSame(flagName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean isLaunchHome() {
		return isResultFlag(HOME);
	}
	public boolean isGame() {
		return isResultFlag(GAME);
	}
	public boolean isShopping() {
		return isResultFlag(SHOPPING);
	}
	public boolean isAppList() {
		return isResultFlag(APPLIST);
	} 
	public boolean isIPTV() {
		return isXpathElementExist("//android.widget.RelativeLayout[@resource-id='com.sumavision.iptv:id/root']");
	}

}
