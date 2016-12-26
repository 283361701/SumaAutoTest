package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.common.CmdUnit;
import com.sumavision.element.EAppStore;
import com.sumavision.mod.AppStoreMod;

import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.android.AndroidKeyCode.*;

public class OAppStore extends Operation implements AppStoreMod {

	AndroidDriver driver;
	EAppStore eTest;
	
	public OAppStore(AndroidDriver driver) {
		super(driver);
		eTest = new EAppStore(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void launchAppStore() {
		// TODO Auto-generated method stub
		sendKeyCode(HOME);
		String cmd = "monkey -p com.huawei.dsm 1";
		CmdUnit.runAdb(cmd);
		sleep(5000);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(5000);
	}

	@Override
	public void quitAppStore() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			sendKeyCode(BACK);
		}
	}

	@Override
	public boolean checkStoreHome() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean checkStoreMusic() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT, 4);
		return false;
	}

	@Override
	public boolean checkStoreShopping() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT, 5);
		return false;
	}

	@Override
	public boolean installApp1() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(3, 1);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp2() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(4, 1);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp3() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(5, 1);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp4() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(6, 1);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp5() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(7, 1);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp6() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(3, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp7() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(4, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp8() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(5, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installApp9() {
		// TODO Auto-generated method stub
		intoSearch();
		intoAppList(6, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installTLKG() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT, 4);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2, 3000);
		return false;
	}

	@Override
	public boolean installTBTV() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,5);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(2000);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean installSYYG() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_RIGHT,5);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(2000);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean findWJYP() {
		// TODO Auto-generated method stub
		intoSearch();
		sendKeyCode(KEYCODE_DPAD_RIGHT, 2);
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2);
		sendKeyCode(KEYCODE_DPAD_UP);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2);
		sleep(5000);
		sendKeyCode(KEYCODE_DPAD_RIGHT, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2, 3000);
		return false;
	}

	@Override
	public boolean checkAppUpgrade() {
		// TODO Auto-generated method stub
		installGLYYX();
		//检测到升级界面并出发
		//检测到安装节目
		sendKeyCode(KEYCODE_DPAD_DOWN, 2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean openAppByList() {
		// TODO Auto-generated method stub
		intoAppList();
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2);
		return false;
	}

	@Override
	public boolean removeAppByList() {
		// TODO Auto-generated method stub
		intoAppList();
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER, 2);
		return false;
	}
	
	private void intoSearch() {
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_LEFT);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
	}
	
	private void intoAppList(int x, int y) {
		sendKeyCode(KEYCODE_DPAD_RIGHT, x);
		sendKeyCode(KEYCODE_DPAD_DOWN, y);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(2000);
	}
	
	private void installGLYYX() {
		intoSearch();
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER,2);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT,2);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT,3);
		sendKeyCode(KEYCODE_DPAD_CENTER,2,3000);
	}
	
	private void intoAppList() {
		sendKeyCode(KEYCODE_DPAD_LEFT);
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_RIGHT);
		sendKeyCode(KEYCODE_DPAD_CENTER);
	}

}
