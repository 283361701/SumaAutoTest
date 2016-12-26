package com.sumavision.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sumavision.base.Assertion;
import com.sumavision.driver.InitDriver;
import com.sumavision.mod.IPTVMod;
import com.sumavision.operation.Oiptv;

public class IPTV extends InitDriver implements IPTVMod {
	
//	public IPTV() {
//		super(new Builder()
//				.setAppPackage("com.android.settings")
//				.setAppActivity("com.sumavision.ui.dialog.NoNumPasswordActivty"));
//	}
	private Oiptv oTest;
	@BeforeTest
	public void startTest() {
		System.out.println("开始IPTV自动化测试");
	}
	@AfterTest
	public void endTest() {
		System.out.println("结束IPTV自动化测试");
	}
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new Oiptv(driver);
	}
	@BeforeMethod
	public void initIPTV() {
		oTest.initIPTV();
	}
	@AfterMethod
	public void quitIPTV() {
		oTest.quitIPTV();
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean checkHome() {
		boolean flag = oTest.checkHome();
		Assertion.verifyEquals(flag, true, "认证未通过！！");
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean moveFocus() {
		boolean flag = oTest.moveFocus();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} )  
	public void inioLookBack() {
		boolean flag = oTest.intoLookBack();
		Assertion.verifyEquals(flag, true);
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean intoLookBackMore() {
		boolean flag = oTest.intoLookBackMore();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean intoVod() {
		boolean flag = oTest.intoVod();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean intoLive() {
		boolean flag = oTest.intoLive();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playLive() {
		boolean flag = oTest.playLive(1);
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playVod() {
		boolean flag = oTest.playVod(9);
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playHDTimeShiftAndLive() {
		boolean flag = oTest.playHDTimeShiftAndLive();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean play4KTimeShiftAndLive() {
		boolean flag = oTest.play4KTimeShiftAndLive();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playLiveSeek() {
		boolean flag = oTest.playLiveSeek();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playVodSeek() {
		boolean flag = oTest.playVodSeek();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playLiveByRate() {
		boolean flag = oTest.playLiveByRate(9);
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean playVodByRate() {
		boolean flag = oTest.playVodByRate(2);
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean cutChannel() {
		boolean flag = oTest.cutChannel();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean cutChannelByFCC() {
		boolean flag = oTest.cutChannelByFCC();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean setHDStartAndPause() {
		boolean flag = oTest.setHDStartAndPause();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean set4KStartAndPause() {
		boolean flag = oTest.set4KStartAndPause();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean setVolume() {
		boolean flag = oTest.setVolume();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean setMute() {
		boolean flag = oTest.setMute();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} )  
	public boolean setChannel() {
		boolean flag = oTest.setChannel();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean fillLive() {
		boolean flag = oTest.fillLive();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","iptv"} ) 
	public boolean fillVod() {
		boolean flag = oTest.fillVod();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Override
	public boolean intoLookBack() {
		// TODO Auto-generated method stub
		return false;
	}
}
