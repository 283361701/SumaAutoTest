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
		oTest.intoVod(1);
	}
	@Test
	public void intoLive() {
		oTest.intoLive();	
	}
	@Test
	public void playLive() {
		oTest.playLive(1);
	}
	@Test
	public void playVod() {
		oTest.playVod(9);
	}
	@Test
	public void playHDStateChange() {
		oTest.playHDStateChange();
	}
	@Test
	public void play4KStateChange() {
		oTest.play4KStateChange();
	}
	@Test
	public void playliveSeek() {
		oTest.playliveSeek();
	}
	@Test
	public void playVodSeek() {
		oTest.playVodSeek();
	}
	@Test
	public void playLiveByRate() {
		oTest.playLiveByRate(9);
	}
	@Test
	public void playVodByRate() {
		oTest.playVodByRate(2);
	}
	@Test
	public void cutChannel() {
		oTest.cutChannel();
	}
	@Test
	public void cutChannelByFCC() {
		oTest.cutChannelByFCC();
	}
	@Test
	public void cutHDStateChange() {
		oTest.cutHDStateChange();
	}
	@Test
	public void cut4KStateChange() {
		oTest.cut4KStateChange();
	}
}
