package com.sumavision.mod;

public interface LauncherMod {
	
	public void initLaunch();
	public void quitLaunch();
	public boolean checkNTPTime();
	public boolean checkLauncher();
	public boolean launchIPTV();
	public boolean launchTVRcs();
	public boolean checkGame();
	public boolean checkShopping();
	public boolean checkAppList();
	public boolean launchAppStore();
	public boolean launchLocalPlayer();
	public boolean launchMiracast();
	public boolean launchSetting();
	public boolean launchIPTVbyApp();
	public boolean launchMusicApp();
}
