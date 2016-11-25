package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.common.CmdUnit;
import com.sumavision.element.Eiptv;

import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.android.AndroidKeyCode.*;

import java.security.PublicKey;

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
	}
	public void quitApp() {
		sendKeyCode(HOME);
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
	public void intoVod(int count) {
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
	
	public void playLive(int liveNum) {
		intoLive();
		for (int i = 0; i < liveNum; i++) {
			sendKeyCode(KEYCODE_DPAD_RIGHT);
		}
		sendKeyCode(ENTER);
		sleep(5000);
	}
	
	public void cutChannel() {
		channelByUpAndDown(KEYCODE_5);
	}
	public void cutChannelByFCC() {
		channelByUpAndDown(KEYCODE_7);
	}
	public void channelByUpAndDown(int StartChannelNum) {
		sendKeyCode(StartChannelNum,1,3000);
		sendKeyCode(BACK);
		sendKeyCode(KEYCODE_DPAD_UP,1,2000);
		sendKeyCode(KEYCODE_DPAD_DOWN,1,2000);
	}
	
	public void cutHDStateChange() {
		sendKeyCode(KEYCODE_1,1,200);
		sendKeyCode(KEYCODE_3,1,2000);
		sendKeyCode(BACK);
		playAndPause();
	}
	public void cut4KStateChange() {
		sendKeyCode(KEYCODE_7,1,2000);
		sendKeyCode(BACK);
		playAndPause();
	}
	public void playAndPause() {
		sendKeyCode(85,2,2000);
	}
	
	public void playHDStateChange() {
		sendKeyCode(KEYCODE_7);
		sendKeyCode(BACK);
		seekAndLive();
	}
	public void play4KStateChange() {
		sendKeyCode(KEYCODE_4);
		sendKeyCode(BACK);
		seekAndLive();
	}
	public void seekAndLive() {
		sendKeyCode(92,1,2000);//上页
		sendKeyCode(93,1,2000);//下页
	}
	
	public void playliveSeek() {
		sendKeyCode(KEYCODE_7,1,2000);
		sendKeyCode(BACK);
		seek(8, 0);
	}
	public void playVodSeek() {
		intoVodNotExit(1);
		sendKeyCode(BACK);
		seek(0, 1);
	}
	
	public void seek(int hour, int minute) {
		sendKeyCode(85);
		CmdUnit.runAdb("input text " + hour);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		CmdUnit.runAdb("input text " + minute);
		sendKeyCode(ENTER);
		sleep(2000);
	}
	public void intoVodNotExit(int count) {
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT,count);
		sendKeyCode(ENTER,2);
		sleep(2000);
	}
	
	public void playVod(int playNum) {
		for (int i = 1; i < playNum; i++) {
			intoVod(i);
			initApp();
		}
	}
	public void playVodByRate(int vodNum) {
		intoVodNotExit(vodNum);
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
	}
	public void playLiveByRate(int channelNum) {
		sendKeyCode(channelNum);
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
	}
	public void rateByForward(int rateNum) {
		sendKeyCode(90,rateNum);
		sleep(2000);
		sendKeyCode(85);
	}
	public void rateByBackward(int rateNum) {
		sendKeyCode(89,rateNum);
		sleep(2000);
		sendKeyCode(85);
	}
}
