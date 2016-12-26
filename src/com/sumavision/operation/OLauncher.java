package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.element.ELauncher;
import com.sumavision.mod.LauncherMod;

import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.android.AndroidKeyCode.*;

public class OLauncher extends Operation implements LauncherMod {
	
	private ELauncher eTest;
	AndroidDriver driver;
	
	public OLauncher(AndroidDriver driver) {
		super(driver);
		eTest = new ELauncher(driver);
		this.driver = driver;
	}

	@Override
	public void initLaunch() {
		// TODO Auto-generated method stub
		sendKeyCode(HOME);
		sendKeyCode(KEYCODE_DPAD_DOWN,2);
		sendKeyCode(KEYCODE_DPAD_LEFT,3);
	}

	@Override
	public void quitLaunch() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			sendKeyCode(BACK);
		}
	}

	@Override
	public boolean checkNTPTime() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean checkLauncher() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean launchIPTV() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_UP);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return true;
	}

	@Override
	public boolean launchTVRcs() {
		sendKeyCode(KEYCODE_DPAD_UP);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean checkGame() {
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		return true;
	}

	@Override
	public boolean checkShopping() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		return true;
	}

	@Override
	public boolean checkAppList() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		return true;
	}
	
	private void intoAppStore() {
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_UP,2);
		sendKeyCode(KEYCODE_DPAD_RIGHT,6);
		sendKeyCode(KEYCODE_DPAD_CENTER);
	}
	@Override
	public boolean launchAppStore() {
		intoAppStore();
		return false;
	}

	@Override
	public boolean launchLocalPlayer() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_UP,2);
		sendKeyCode(KEYCODE_DPAD_RIGHT,5);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean launchMiracast() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_UP,2);
		sendKeyCode(KEYCODE_DPAD_RIGHT,4);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean launchSetting() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_UP,1);
		sendKeyCode(KEYCODE_DPAD_RIGHT,6);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean launchIPTVbyApp() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_UP,1);
		sendKeyCode(KEYCODE_DPAD_RIGHT,5);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean launchMusicApp() {
		// TODO Auto-generated method stub
		intoAppStore();
		sleep(5000);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(5000);
		sendKeyCode(KEYCODE_DPAD_RIGHT,4);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		sendKeyCode(KEYCODE_DPAD_UP);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}
	
}
