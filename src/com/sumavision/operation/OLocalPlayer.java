package com.sumavision.operation;

import com.sumavision.base.Operation;
import com.sumavision.common.CmdUnit;
import com.sumavision.element.ELocalPlayer;
import com.sumavision.mod.LocalPlayerMod;

import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.android.AndroidKeyCode.*;


public class OLocalPlayer extends Operation implements LocalPlayerMod {

	private ELocalPlayer eTest;
	AndroidDriver driver;
	
	public OLocalPlayer(AndroidDriver driver) {
		super(driver);
		eTest = new ELocalPlayer(driver);
		this.driver = driver;
	}

	@Override
	public void launchLocalPlayer() {
		// TODO Auto-generated method stub
		sendKeyCode(HOME);
		String cmd = "monkey -p com.sumavision.sumamedia 1";
		CmdUnit.runAdb(cmd);
		sleep(1000);
		sendKeyCode(KEYCODE_DPAD_CENTER, 1, 2000);
		setSort();
	}

	@Override
	public void quitLocalPlayer() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			sendKeyCode(BACK);
		}
	}

	@Override
	public boolean checkAppShow() {
		// TODO Auto-generated method stub
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean checkMenuByList() {
		openMenu();
		return false;
	}

	@Override
	public boolean checkMenuByVideo() {
		// TODO Auto-generated method stub
		checkMenu(5);
		return false;
	}

	@Override
	public boolean checkMenuByMusic() {
		// TODO Auto-generated method stub
		checkMenu(1);
		return false;
	}

	@Override
	public boolean checkMenuByPictrue() {
		// TODO Auto-generated method stub
		checkMenu(2);
		return false;
	}

	@Override
	public boolean fillVideo() {
		// TODO Auto-generated method stub
		intoNextLevel(5);
		fillPlay(2);
		return false;
	}

	@Override
	public boolean fillMusic() {
		// TODO Auto-generated method stub
		intoNextLevel(1);
		fillPlay(3);
		return false;
	}

	@Override
	public boolean fillPictrue() {
		// TODO Auto-generated method stub
		intoNextLevel(2);
		fillPlay(5);
		return false;
	}

	@Override
	public boolean checkVideoPause() {
		// TODO Auto-generated method stub
		intoNextLevel(5);
		sendKeyCode(KEYCODE_DPAD_CENTER,1,10000);
		sendKeyCode(KEYCODE_MEDIA_PLAY_PAUSE);
		sleep(3000);
		return false;
	}

	@Override
	public boolean checkVideoForward() {
		// TODO Auto-generated method stub
		intoNextLevel(5);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT, 5);
		return false;
	}

	@Override
	public boolean checkVideoBackward() {
		// TODO Auto-generated method stub
		intoNextLevel(5);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_RIGHT, 5);
		sendKeyCode(KEYCODE_DPAD_LEFT, 3);
		return false;
	}

	@Override
	public boolean checkSubtitleByIn() {
		// TODO Auto-generated method stub
		intoNextLevel(4);
		return false;
	}

	@Override
	public boolean checkSubtitleBySRT() {
		// TODO Auto-generated method stub
		intoNextLevel(4);
		return false;
	}

	@Override
	public boolean checkSubtitleBySUB() {
		// TODO Auto-generated method stub
		intoNextLevel(4);
		return false;
	}

	@Override
	public boolean checkSoundTrack() {
		// TODO Auto-generated method stub
		intoNextLevel(3);
		sendKeyCode(ENTER);
		openMenu();
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		return false;
	}

	@Override
	public boolean checkPictureThumb() {
		// TODO Auto-generated method stub
		intoNextLevel(2);
		return false;
	}
	
	/**
	 * 进入下级页面
	 * @param count 第几行
	 */
	private void intoNextLevel(int count) {
		sendKeyCode(KEYCODE_DPAD_DOWN, count);
		sendKeyCode(KEYCODE_DPAD_CENTER);
	}
	/**
	 * 设置排序方式为按字母排序
	 */
	private void setSort() {
		openMenu();
		sendKeyCode(KEYCODE_DPAD_DOWN);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(KEYCODE_DPAD_UP,3);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sendKeyCode(BACK,2);
	}
	/**
	 * 打开菜单
	 */
	private void openMenu() {
		sendKeyCode(134);
		sleep(1000);
	}
	/**
	 * 进入播放状态，检测菜单
	 * @param count 第几行
	 */
	private void checkMenu(int count) {
		intoNextLevel(count);
		sendKeyCode(KEYCODE_DPAD_CENTER);
		sleep(5000);
		openMenu();
	}
	private void fillPlay(int count) {
		int i = 0;
		do {
			sendKeyCode(KEYCODE_DPAD_CENTER);
			sleep(10000);
			sendKeyCode(BACK,1,2000);
			sendKeyCode(KEYCODE_DPAD_DOWN);
			i++;
		} while (i<=count);
	}

}
