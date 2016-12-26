package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.common.CmdUnit;
import com.sumavision.element.Eiptv;
import com.sumavision.mod.IPTVMod;

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
	public void initIPTV() {
		sendKeyCode(HOME);
		String cmd = "monkey -p com.sumavision.iptv 1";
		CmdUnit.runAdb(cmd);
		sendKeyCode(82,1,200);
		sleep(2000);
//		if (!eTest.isHome()) {
//			driver.quit();
//			System.out.println("EPG页面异常，无法执行后续用例测试！");
//		}
	}
	public void initLaunch() {
		sendKeyCode(KEYCODE_DPAD_DOWN,2);
		sendKeyCode(KEYCODE_DPAD_LEFT,3);
		sendKeyCode(KEYCODE_DPAD_UP);
	}	
	public void quitIPTV() {
		sendKeyCode(HOME);
	}
	public boolean checkHome() {
		sendKeyCode(82);
		return true;
		
	}
	public boolean moveFocus() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,8);
		return true;
	}
	public boolean intoLookBack() {
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(ENTER,2);
		sendKeyCode(BACK,2);
		return true;
	}
	public boolean intoLookBackMore() {
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(ENTER);
		sendKeyCode(BACK);
		return true;
	}
	public boolean intoVod() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(ENTER);
		sendKeyCode(ENTER);
		eTest.waitAuto(5000);
		sendKeyCode(BACK,2);
		sendKeyCode(ENTER);
		sendKeyCode(BACK,2);
		return true;
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
		sendKeyCode(BACK);
		return true;
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
		return true;
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
		sendKeyCode(KEYCODE_DPAD_DOWN,1,2000);
		return true;
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
		sendKeyCode(85,1,2000);
		return true;
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
		sendKeyCode(93,1,2000);//下页
		return true;
	}
	public boolean playLiveSeek() {
		sendKeyCode(KEYCODE_7,1,2000);
		sendKeyCode(BACK);
		seek(8, 0);
		sendKeyCode(93,1,2000);//下页
		return true;
	}
	public boolean playVodSeek() {
		intoVodNotExit(1);
		seek(0, 1);
		sendKeyCode(BACK);
		sendKeyCode(ENTER);
		return true;
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
			initIPTV();
		}
		return true;
	}
	public boolean playVodByRate(int vodNum) {
		intoVodNotExit(vodNum);
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
		return true;
	}
	public boolean playLiveByRate(int channelNum) {
		sendKeyCode(channelNum);
		for (int i = 1; i < 6; i++) {
			rateByBackward(i);
		}
		for (int i = 1; i < 6; i++) {
			rateByForward(i);
		}
		return true;
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
		return true;
	}
	public boolean setVolume() {
		sendKeyCode(BACK);
		for (int i = 0; i < 20; i++) {
			sendKeyCode(KEYCODE_VOLUME_UP);
		}
		return true;
	}
	public boolean setChannel() {
		sendKeyCode(BACK);
		sendKeyCode(1185);//声道
		sendKeyCode(1185);
		return true;
	}
	public boolean fillLive() {
		sendKeyCode(KEYCODE_1);
		sleep(5000);
		for (int i = 0; i < 100; i++) {
			sendKeyCode(KEYCODE_DPAD_UP);
			sleep(5000);
		}
		return true;
	}
	public boolean fillVod() {
		for (int i = 0; i < 30; i++) {
			intoVodNotCheck(i);
			initIPTV();
		}
		return true;
	}
}
