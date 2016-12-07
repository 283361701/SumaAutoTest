package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.common.CmdUnit;
import com.sumavision.element.Eiptv;

import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.android.AndroidKeyCode.*;

import java.security.PublicKey;
import java.util.Iterator;

import org.openqa.selenium.remote.server.handler.SendKeys;

public class Oiptv extends Operation {
	
	private Eiptv eTest;
	AndroidDriver driver;
	
	public Oiptv(AndroidDriver driver) {
		super(driver);
		eTest = new Eiptv(driver);
		this.driver = driver;
	}
	
	public void initApp() {
		sendKeyCode(HOME);
		sendKeyCode(KEYCODE_ENTER,1,200);
		sendKeyCode(82,1,200);
		if (!eTest.isHome()) {
			driver.quit();
			System.out.println("EPG页面异常，无法执行后续用例测试！");
		}
	}
	public void quitApp() {
		sendKeyCode(HOME);
	}
	
	public boolean checkHome() {
		sendKeyCode(82);
		if(eTest.isHome()){
			return true;
		} else {
			driver.quit();
			System.err.println("认证为通过，后续用例无法执行！");
			return false;
		}
		
	}
	public boolean moveFocus() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,8);
		return eTest.isMoveFocus();
	}
	
	public boolean intoLookBack() {
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(ENTER,2);
		boolean flag = eTest.isIntoLookBack();
		sendKeyCode(BACK,2);
		return flag;
	}
	public boolean intoLookBackMore() {
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(ENTER);
		boolean flag = eTest.isIntoLookBack();
		sendKeyCode(BACK);
		return flag;
	}
	public boolean intoVod() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(ENTER);
		boolean flag = eTest.isIntoVod();
		sendKeyCode(ENTER);
		eTest.waitAuto(5000);
		sendKeyCode(BACK,2);
		sendKeyCode(ENTER);
		sendKeyCode(BACK,2);
		return flag;
	}
	private void intoVodNotCheck(int count) {
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT,count);
		sendKeyCode(ENTER,2);
		sendKeyCode(BACK,2);
		sendKeyCode(ENTER);
		sendKeyCode(BACK,2);
	}
	public boolean intoLive() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(ENTER);
		boolean flag = eTest.isIntoLive();
		sendKeyCode(BACK);
		return flag;
	}
	
	private void intoLiveNotExit() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(ENTER);
	}
	
	public boolean playLive(int liveNum) {
		intoLiveNotExit();
		for (int i = 0; i < liveNum; i++) {
			sendKeyCode(KEYCODE_DPAD_RIGHT);
		}
		sendKeyCode(ENTER);
		sleep(5000);
		return eTest.isAppAtIPTV();
	}
	
	public boolean cutChannel() {
		return channelByUpAndDown(KEYCODE_5);
	}
	
	public boolean cutChannelByFCC() {
		return channelByUpAndDown(KEYCODE_7);
	}
	
	private boolean channelByUpAndDown(int StartChannelNum) {
		sendKeyCode(StartChannelNum,1,3000);
		sendKeyCode(BACK);
		sendKeyCode(KEYCODE_DPAD_UP,1,2000);
		boolean flag1 = eTest.isAppAtIPTV();
		sendKeyCode(KEYCODE_DPAD_DOWN,1,2000);
		boolean flag2 = eTest.isAppAtIPTV();
		return flag1 && flag2;
	}
	
	public boolean setHDStartAndPause() {
		sendKeyCode(KEYCODE_1,1,200);
		sendKeyCode(KEYCODE_3,1,2000);
		sendKeyCode(BACK);
		return startAndPause();
	}
	public boolean set4KStartAndPause() {
		sendKeyCode(KEYCODE_7,1,2000);
		sendKeyCode(BACK);
		return startAndPause();
	}
	private boolean startAndPause() {
		sendKeyCode(85,1,2000);
		boolean flag1 = eTest.isAppAtIPTV();
		sendKeyCode(85,1,2000);
		boolean flag2 = eTest.isAppAtIPTV();
		return flag1 && flag2;
	}
	
	public boolean playHDTimeShiftAndLive() {
		sendKeyCode(KEYCODE_7);
		sendKeyCode(BACK);
		return timeShiftAndLive();
	}
	public boolean play4KTimeShiftAndLive() {
		sendKeyCode(KEYCODE_4);
		sendKeyCode(BACK);
		return timeShiftAndLive();
	}
	private boolean timeShiftAndLive() {
		sendKeyCode(92,1,2000);//上页
		boolean flag1 = eTest.isAppAtIPTV();
		sendKeyCode(93,1,2000);//下页
		boolean flag2 = eTest.isAppAtIPTV();
		return flag1 && flag2;
	}
	
	public boolean playLiveSeek() {
		sendKeyCode(KEYCODE_7,1,2000);
		sendKeyCode(BACK);
		seek(8, 0);
		sendKeyCode(93,1,2000);//下页
		return eTest.isAppAtIPTV();
	}
	public boolean playVodSeek() {
		intoVodNotExit(1);
		seek(0, 1);
		sendKeyCode(BACK);
		sendKeyCode(ENTER);
		return eTest.isAppAtIPTV();
	}
	
	private void seek(int hour, int minute) {
		sendKeyCode(85);
		CmdUnit.runAdb("input text " + hour);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		CmdUnit.runAdb("input text " + minute);
		sendKeyCode(ENTER);
		eTest.waitAuto(2000);
	}
	private void intoVodNotExit(int count) {
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT,count);
		sendKeyCode(ENTER,2);
		sendKeyCode(BACK);
		eTest.waitAuto(2000);
	}
	
	public boolean playVod(int playNum) {
		for (int i = 1; i < playNum; i++) {
			intoVodNotCheck(i);
			initApp();
		}
		return eTest.isAppAtIPTV();
	}
	public boolean playVodByRate(int vodNum) {
		intoVodNotExit(vodNum);
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
		return eTest.isAppAtIPTV();
	}
	public boolean playLiveByRate(int channelNum) {
		sendKeyCode(channelNum);
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		return eTest.isAppAtIPTV();
	}
	private void rateByForward(int rateNum) {
		sendKeyCode(90,rateNum);//前进
		eTest.waitAuto(5000);
		sendKeyCode(85);
	}
	private void rateByBackward(int rateNum) {
		sendKeyCode(89,rateNum);//后退
		eTest.waitAuto(5000);
		sendKeyCode(85);
	}
	
	public boolean setMute() {
		sendKeyCode(BACK);
		sendKeyCode(KEYCODE_VOLUME_MUTE);
		return eTest.isAppAtIPTV();
	}
	
	public boolean setVolume() {
		sendKeyCode(BACK);
		for (int i = 0; i < 20; i++) {
			sendKeyCode(KEYCODE_VOLUME_UP);
		}
		return eTest.isAppAtIPTV();
	}
	
	public boolean setChannel() {
		sendKeyCode(BACK);
		sendKeyCode(1185);//声道
		boolean flag1 = eTest.isAppAtIPTV();
		sendKeyCode(1185);
		boolean flag2 = eTest.isAppAtIPTV();
		return flag1 && flag2;
	}
	
	public boolean fillLive() {
		sendKeyCode(KEYCODE_1);
		sleep(5000);
		if(eTest.isAppAtIPTV()) {
			for (int i = 0; i < 100; i++) {
				sendKeyCode(KEYCODE_DPAD_UP);
				sleep(5000);
			}
		}else {
			return false;
		}
		return true;
	}
	public boolean fillVod() {
		if(eTest.isAppAtIPTV()) {
			for (int i = 0; i < 30; i++) {
				intoVodNotCheck(i);
				initApp();
			}
		}else {
			return false;
		}
		return true;
	}
}
