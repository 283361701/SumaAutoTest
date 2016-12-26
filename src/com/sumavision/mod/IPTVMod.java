package com.sumavision.mod;

public interface IPTVMod {
	
	public void initIPTV();
	public void quitIPTV();
	public boolean checkHome();
	public boolean moveFocus();
	public boolean intoLookBack();
	public boolean intoLookBackMore();
	public boolean intoVod();
	public boolean intoLive();
	public boolean playLive();
	public boolean playVod();
	public boolean playHDTimeShiftAndLive();
	public boolean play4KTimeShiftAndLive();
	public boolean playLiveSeek();
	public boolean playVodSeek();
	public boolean playLiveByRate();
	public boolean playVodByRate();
	public boolean cutChannel();
	public boolean cutChannelByFCC();
	public boolean setHDStartAndPause();
	public boolean set4KStartAndPause();
	public boolean setMute();
	public boolean setVolume();
	public boolean setChannel();
	public boolean fillLive();
	public boolean fillVod();
	
}
