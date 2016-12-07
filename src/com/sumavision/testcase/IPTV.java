package com.sumavision.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sumavision.base.Assertion;
import com.sumavision.driver.Builder;
import com.sumavision.driver.InitDriver;
import com.sumavision.operation.Oiptv;

public class IPTV extends InitDriver {
	
//	public IPTV() {
//		super(new Builder()
//				.setAppPackage("com.android.settings")
//				.setAppActivity("com.sumavision.ui.dialog.NoNumPasswordActivty"));
//	}
	private Oiptv oTest;
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new Oiptv(driver);
	}
	@BeforeMethod
	public void initTest() {
		oTest.initApp();
	}
	@AfterMethod
	public void quitTest() {
		oTest.quitApp();
	}
	@Test
	public void checkHome() {
		boolean flag = oTest.checkHome();
		Assertion.verifyEquals(flag, true, "认证未通过！！");
	}
	@Test
	public void moveFocus() {
		boolean flag = oTest.moveFocus();
		Assertion.verifyEquals(flag, true);
	}
	@Test 
	public void inioLookBack() {
		boolean flag = oTest.intoLookBack();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void intoLookBackMore() {
		boolean flag = oTest.intoLookBackMore();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void intoVod() {
		boolean flag = oTest.intoVod();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void intoLive() {
		boolean flag = oTest.intoLive();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playLive() {
		boolean flag = oTest.playLive(1);
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playVod() {
		boolean flag = oTest.playVod(9);
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playHDTimeShiftAndLive() {
		boolean flag = oTest.playHDTimeShiftAndLive();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void play4KTimeShiftAndLive() {
		boolean flag = oTest.play4KTimeShiftAndLive();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playLiveSeek() {
		boolean flag = oTest.playLiveSeek();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playVodSeek() {
		boolean flag = oTest.playVodSeek();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playLiveByRate() {
		boolean flag = oTest.playLiveByRate(9);
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void playVodByRate() {
		boolean flag = oTest.playVodByRate(2);
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void cutChannel() {
		boolean flag = oTest.cutChannel();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void cutChannelByFCC() {
		boolean flag = oTest.cutChannelByFCC();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void setHDStartAndPause() {
		boolean flag = oTest.setHDStartAndPause();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void set4KStartAndPause() {
		boolean flag = oTest.set4KStartAndPause();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void setVolume() {
		boolean flag = oTest.setVolume();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void setMute() {
		boolean flag = oTest.setMute();
		Assertion.verifyEquals(flag, true);
	}
	@Test 
	public void setChannel() {
		boolean flag = oTest.setChannel();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void fillLive() {
		boolean flag = oTest.fillLive();
		Assertion.verifyEquals(flag, true);
	}
	@Test
	public void fillVod() {
		boolean flag = oTest.fillVod();
		Assertion.verifyEquals(flag, true);
	}
}
