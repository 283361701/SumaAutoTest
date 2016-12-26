package com.sumavision.testcase;

import org.ini4j.Ini;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sumavision.base.Assertion;
import com.sumavision.driver.InitDriver;
import com.sumavision.mod.LocalPlayerMod;
import com.sumavision.operation.OLocalPlayer;

public class LocalPlayer extends InitDriver implements LocalPlayerMod {

	private OLocalPlayer oTest;
	@BeforeTest
	public void startLocalPlayer() {
		// TODO Auto-generated method stub
		System.out.println("开始本地播放测试");
	}

	@AfterTest
	public void endLocalPlayer() {
		// TODO Auto-generated method stub
		System.out.println("结束本地播放测试");
	}
	
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new OLocalPlayer(driver);
	}
	
	@Override
	@BeforeMethod
	public void launchLocalPlayer() {
		// TODO Auto-generated method stub
		oTest.launchLocalPlayer();
		
	}

	@Override
	@AfterMethod
	public void quitLocalPlayer() {
		// TODO Auto-generated method stub
		oTest.quitLocalPlayer();
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkAppShow() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAppShow();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkMenuByList() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkMenuByList();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkMenuByVideo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkMenuByVideo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkMenuByMusic() {
		// TODO Auto-generated method stub
		boolean flag= oTest.checkMenuByMusic();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkMenuByPictrue() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkMenuByPictrue();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean fillVideo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.fillVideo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean fillMusic() {
		// TODO Auto-generated method stub
		boolean flag = oTest.fillMusic();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test
	public boolean fillPictrue() {
		// TODO Auto-generated method stub
		boolean flag = oTest.fillPictrue();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkVideoPause() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkVideoPause();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkVideoForward() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkVideoForward();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkVideoBackward() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkVideoBackward();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkSubtitleByIn() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkSubtitleByIn();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkSubtitleBySRT() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkSubtitleBySRT();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkSubtitleBySUB() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkSubtitleBySUB();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkSoundTrack() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkSoundTrack();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","localplayer"} ) 
	public boolean checkPictureThumb() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkPictureThumb();
		Assertion.verifyEquals(flag, true);
		return flag;
	}


}
