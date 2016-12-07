package com.sumavision.element;

import java.io.IOException;

import org.bouncycastle.asn1.crmf.PKIPublicationInfo;

import com.sumavision.base.ElementPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Eiptv extends ElementPage {
	public Eiptv(AndroidDriver driver) {
		super(driver);
	}
	private final String MOVE_FOCUS_FLAG = COMP_IMAGE_PATH + "moveFocus.png";
	private final String INTO_LOOKBACK = COMP_IMAGE_PATH + "intoLookBack.png";
	private final String INTO_LIVE = COMP_IMAGE_PATH + "intoLIVE.png";
	private final String INTO_VOD = COMP_IMAGE_PATH + "intoVod.png";
	private final String PLAY_VOD = COMP_IMAGE_PATH + "playVod.png";
	private final String PLAY_SEEK = COMP_IMAGE_PATH + "playSeek.png";
	private final String TIME_SHIFT_FLAG = COMP_IMAGE_PATH + "timeShiftFlag.png";
	private final String LIVE_FLAG = COMP_IMAGE_PATH + "liveFlag.png";
	private final String MUTE = COMP_IMAGE_PATH + "mute.png";
	private final String VOLUME = COMP_IMAGE_PATH + "volume.png";
	private final String LEFT_CHANNEL = COMP_IMAGE_PATH + "leftChannel.png";
	private final String RIGHT_CHANNEL = COMP_IMAGE_PATH + "rightChannel.png";
	private final String HOME = COMP_IMAGE_PATH + "home.png";
	
	private boolean isResultFlag(String flagName) {
		try {
			return isIamgeSame(flagName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean isHome() {
		return isResultFlag(HOME);
	}
		
	public boolean isMoveFocus(){
		return isResultFlag(MOVE_FOCUS_FLAG);
	}
	
	public boolean isIntoLookBack() {
		return isResultFlag(INTO_LOOKBACK);
	}
	
	public boolean isIntoLive() {
		return isResultFlag(INTO_LIVE);
	}
	
	public boolean isIntoVod() {
		return isResultFlag(INTO_VOD);
	}
	
	public boolean isPlayVod() {
		return isResultFlag(PLAY_VOD);
	}
		
	public boolean isPlaySeek() {
		return isResultFlag(PLAY_SEEK);
	}
		
	public boolean isTimeshitft() {
		return isResultFlag(TIME_SHIFT_FLAG);
	}
	
	public boolean isLive() {
		return isResultFlag(LIVE_FLAG);
	}
	
	public boolean isMute() {
		return isResultFlag(MUTE);
	}
	
	public boolean isVolume() {
		return isResultFlag(VOLUME);
	}
	
	public boolean isLeftChannel() {
		return isResultFlag(LEFT_CHANNEL);
	}
	
	public boolean isRightChannel() {
		return isResultFlag(RIGHT_CHANNEL);
	}
	
	public boolean isAppAtIPTV() {
		return isIdElementExist("fullscreen_custom_content");
	}
	
	
	
}
