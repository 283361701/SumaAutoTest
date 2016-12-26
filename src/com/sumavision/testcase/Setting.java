package com.sumavision.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sumavision.base.Assertion;
import com.sumavision.driver.Builder;
import com.sumavision.driver.InitDriver;
import com.sumavision.mod.SettingMod;
import com.sumavision.operation.OSetting;

public class Setting extends InitDriver implements SettingMod {

	private OSetting oTest;
	
	@Override
	@BeforeTest
	public void startSetting() {
		// TODO Auto-generated method stub
		System.out.println("开始系统设置测试");
	}

	@Override
	@AfterTest
	public void endSetting() {
		// TODO Auto-generated method stub
		System.out.println("结束系统设置测试");
	}
	
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new OSetting(driver);
	}

	@Override
	@BeforeMethod
	public void initSetting() {
		// TODO Auto-generated method stub
		System.out.println("start");
		oTest.initSetting();
	}

	@Override
	@AfterMethod
	public void quitSetting() {
		// TODO Auto-generated method stub
		oTest.quitSetting();
		System.out.println("end");
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkNetword() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkNetword();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkAp() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAp();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkIPv6() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkIPv6();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkWiFi() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkWiFi();
		Assertion.verifyEquals(flag, true);
		return false;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkWiFiPPPoE() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkWiFiPPPoE();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkTest() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkTest();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkSpeed() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkSpeed();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkResolution() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkResolution();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkImageScale() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkImageScale();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkPlatform() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkPlatform();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean readDeviceInfo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.readDeviceInfo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean readVersionInfo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.readVersionInfo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean readNetwrodInfo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.readNetwrodInfo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean readServiceInfo() {
		// TODO Auto-generated method stub
		boolean flag = oTest.readServiceInfo();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkInputMethod() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkInputMethod();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkProtocol() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkProtocol();
		Assertion.verifyEquals(flag, true);
		return false;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkThrough() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkThrough();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkHDRState() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkHDRState();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkBluetooth() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkBluetooth();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkAutoStandBy() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAutoStandBy();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkNTPServer() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkNTPServer();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkInfoPort() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkInfoPort();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","setting"} ) 
	public boolean checkAbout() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAbout();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

}
