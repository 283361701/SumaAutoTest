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
import com.sumavision.operation.OLauncher;
import com.sumavision.mod.LauncherMod;;

public class Launcher extends InitDriver implements LauncherMod {
	
	private OLauncher oTest;
	@BeforeTest
	public void startTest() {
		System.out.println("开始launcher自动化测试");
	}
	@AfterTest
	public void endTest() {
		System.out.println("结束launcher自动化测试");
	}
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new OLauncher(driver);
	}
	@BeforeMethod
	public void initLaunch() {
		// TODO Auto-generated method stub
		oTest.initLaunch();
	}
	@AfterMethod
	public void quitLaunch() {
		// TODO Auto-generated method stub
		oTest.quitLaunch();
	}
	@Test(groups = {"function","launcher"} )
	public boolean checkNTPTime() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkNTPTime();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean checkLauncher() {
		// TODO Auto-generated method stub
		boolean flag= oTest.checkLauncher();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchIPTV() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchIPTV();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchTVRcs() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchTVRcs();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean checkGame() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkGame();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean checkShopping() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkShopping();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean checkAppList() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAppList();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchAppStore() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchAppStore();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchLocalPlayer() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchLocalPlayer();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchMiracast() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchMiracast();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchSetting() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchSetting();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchIPTVbyApp() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchIPTVbyApp();
		Assertion.verifyEquals(flag, true);
		return flag;
	}
	@Test(groups = {"function","launcher"} )
	public boolean launchMusicApp() {
		// TODO Auto-generated method stub
		boolean flag = oTest.launchMusicApp();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

}
