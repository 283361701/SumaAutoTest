package com.sumavision.element;

import java.io.IOException;

import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

import com.sumavision.base.ElementPage;

import io.appium.java_client.android.AndroidDriver;

public class Eiptv extends ElementPage {
	public Eiptv(AndroidDriver driver) {
		super(driver);
	}
	public String MOVE_FOCUS_FLAG = COMP_IMAGE_PATH + "moveFocus.png";
	public String INTO_LOOKBACK = COMP_IMAGE_PATH + "intoLookBack.png";
	public String INTO_LIVE = COMP_IMAGE_PATH + "intoLIVE.png";
	
	public boolean isMoveFocus(){
		try {
			return isIamgeSame(MOVE_FOCUS_FLAG);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isIntoLookBack() {
		try {
			return isIamgeSame(INTO_LOOKBACK);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isIntoLive() {
		try {
			return isIamgeSame(INTO_LIVE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
