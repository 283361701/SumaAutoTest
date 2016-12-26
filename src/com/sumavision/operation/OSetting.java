package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.element.ESetting;
import com.sumavision.mod.SettingMod;
import com.sumavision.common.CmdUnit;

import io.appium.java_client.android.AndroidDriver;
import java_cup.runtime.Symbol;

import static io.appium.java_client.android.AndroidKeyCode.*;

public class OSetting extends Operation implements SettingMod {

	private ESetting eTest;
	AndroidDriver driver;
	
	public OSetting(AndroidDriver driver) {
		super(driver);
		eTest = new ESetting(driver);
		this.driver = driver;
	}
	
	@Override
	public void startSetting() {
		// TODO Auto-generated method stub
		System.out.println("系统设置自动化测试开始");
	}

	@Override
	public void endSetting() {
		// TODO Auto-generated method stub
		System.out.println("系统设置自动化测试结束");
	}

	@Override
	public void initSetting() {
		// TODO Auto-generated method stub
		sendKeyCode(HOME);
		String cmdLine = "monkey -p com.android.settings 1";
		CmdUnit.runAdb(cmdLine);
		CmdUnit.runAdb("input text 6321");
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(ENTER);
	}

	@Override
	public void quitSetting() {
		// TODO Auto-generated method stub
		for(int i=0; i<6; i++) {
			sendKeyCode(BACK);
		}
	}

	@Override
	public boolean checkNetword() {
		// TODO Auto-generated method stub
		sendKeyCode(ENTER);
		return true;
	}

	@Override
	public boolean checkAp() {
		// TODO Auto-generated method stub
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		eTest.waitAuto(3000);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		return false;
	}

	@Override
	public boolean checkIPv6() {
		// TODO Auto-generated method stub
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN, 3);
		sendKeyCode(ENTER);
		eTest.waitAuto(3000);
		sendKeyCode(ENTER);
		return false;
	}

	@Override
	public boolean checkWiFi() {
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER, 3, 5000);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkWiFiPPPoE() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(10000);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(BACK);
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean checkTest() {
		// TODO Auto-generated method stub
		intoSecondLevel(1);
		sendKeyCode(ENTER);
		return false;
	}

	@Override
	public boolean checkSpeed() {
		// TODO Auto-generated method stub
		intoSecondLevel(1);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		//写入测速地址
		sendKeyCode(ENTER);
		return false;
	}

	@Override
	public boolean checkResolution() {
		// TODO Auto-generated method stub
		intoSecondLevel(2);
		return false;
	}

	@Override
	public boolean checkImageScale() {
		intoSecondLevel(3);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPlatform() {
		// TODO Auto-generated method stub
		intoSecondLevel(4);
		return false;
	}

	@Override
	public boolean readDeviceInfo() {
		// TODO Auto-generated method stub
		intoSecondLevel(5);
		return false;
	}

	@Override
	public boolean readVersionInfo() {
		// TODO Auto-generated method stub
		intoSecondLevel(5);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		return false;
	}

	@Override
	public boolean readNetwrodInfo() {
		// TODO Auto-generated method stub
		intoSecondLevel(5);
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		return false;
	}

	@Override
	public boolean readServiceInfo() {
		// TODO Auto-generated method stub
		intoSecondLevel(5);
		sendKeyCode(KEYCODE_DPAD_DOWN, 3);
		return false;
	}
	
	@Override
	public boolean checkInputMethod() {
		// TODO Auto-generated method stub
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		return false;
	}

	@Override
	public boolean checkProtocol() {
		// TODO Auto-generated method stub
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		return false;
	}

	@Override
	public boolean checkThrough() {
		// TODO Auto-generated method stub
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN, 3);
		return false;
	}

	@Override
	public boolean checkHDRState() {
		// TODO Auto-generated method stub
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN, 4);
		return false;
	}

	@Override
	public boolean checkBluetooth() {
		// TODO Auto-generated method stub
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN, 5);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sleep(10000);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		
		return false;
	}

	@Override
	public boolean checkAutoStandBy() {
		// TODO Auto-generated method stub
		intoAdvancedSet();
		sendKeyCode(KEYCODE_DPAD_DOWN, 4);
		sendKeyCode(ENTER);
		return false;
	}

	@Override
	public boolean checkNTPServer() {
		// TODO Auto-generated method stub
		intoAdvancedSet();
		sendKeyCode(KEYCODE_DPAD_DOWN, 5);
		sendKeyCode(ENTER);
		return false;
	}

	@Override
	public boolean checkInfoPort() {
		// TODO Auto-generated method stub
		intoAdvancedSet();
		sendKeyCode(KEYCODE_DPAD_DOWN, 12);
		sendKeyCode(ENTER);
		return false;
	}
	
	private void intoSecondLevel (int count) {
		sendKeyCode(KEYCODE_DPAD_RIGHT, count);
		sendKeyCode(ENTER);
	}
	
	private void intoAdvancedSet() {
		intoSecondLevel(7);
		sendKeyCode(KEYCODE_DPAD_DOWN, 7);
		sendKeyCode(ENTER);
		sendKeyCode(KEYCODE_6);
		sendKeyCode(KEYCODE_3);
		sendKeyCode(KEYCODE_2);
		sendKeyCode(KEYCODE_1);
		sendKeyCode(ENTER);
	}

	@Override
	public boolean checkAbout() {
		// TODO Auto-generated method stub
		intoSecondLevel(6);
		return false;
	}

}
