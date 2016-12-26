package com.sumavision.mod;

public interface LocalPlayerMod {
	
	public void launchLocalPlayer();
	public void quitLocalPlayer();
	public boolean checkAppShow();
	public boolean checkMenuByList();
	public boolean checkMenuByVideo();
	public boolean checkMenuByMusic();
	public boolean checkMenuByPictrue();
	public boolean fillVideo();
	public boolean fillMusic();
	public boolean fillPictrue();
	public boolean checkVideoPause();
	public boolean checkVideoForward();
	public boolean checkVideoBackward();
	public boolean checkSubtitleByIn();
	public boolean checkSubtitleBySRT();
	public boolean checkSubtitleBySUB();
	public boolean checkSoundTrack();
	public boolean checkPictureThumb();

}
