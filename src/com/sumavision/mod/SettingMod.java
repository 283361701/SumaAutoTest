package com.sumavision.mod;

public interface SettingMod {

	public void startSetting();
	public void endSetting();
	public void initSetting();
	public void quitSetting();
	public boolean checkNetword();
	public boolean checkAp();
	public boolean checkIPv6();
	public boolean checkWiFi();
	public boolean checkWiFiPPPoE();
	public boolean checkTest();
	public boolean checkSpeed();
	public boolean checkResolution();
	public boolean checkImageScale();
	public boolean checkPlatform();
	public boolean readDeviceInfo();
	public boolean readVersionInfo();
	public boolean readNetwrodInfo();
	public boolean readServiceInfo();
	public boolean checkAbout();
	public boolean checkInputMethod();
	public boolean checkProtocol();
	public boolean checkThrough();
	public boolean checkHDRState();
	public boolean checkBluetooth();
	public boolean checkAutoStandBy();
	public boolean checkNTPServer();
	public boolean checkInfoPort();
	

}
