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
import com.sumavision.mod.AppStoreMod;
import com.sumavision.operation.OAppStore;

public class AppStore extends InitDriver implements AppStoreMod {

	private OAppStore oTest;
	@BeforeTest
	public void startAppStore() {
		// TODO Auto-generated method stub
		System.out.println("开始应用商城测试");
	}

	@AfterTest
	public void endAppStore() {
		// TODO Auto-generated method stub
		System.out.println("结束应用商城测试");
	}
	
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new OAppStore(driver);
	}
	@Override
	@BeforeMethod
	public void launchAppStore() {
		// TODO Auto-generated method stub
		oTest.launchAppStore();
	}

	@Override
	@AfterMethod
	public void quitAppStore() {
		// TODO Auto-generated method stub
		oTest.quitAppStore();

	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean checkStoreHome() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkStoreHome();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean checkStoreMusic() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkStoreMusic();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean checkStoreShopping() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkStoreShopping();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp1() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp1();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp2() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp2();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp3() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp3();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp4() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp4();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp5() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp5();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp6() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp6();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp7() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp7();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp8() {
		// TODO Auto-generated method stub
		boolean flag =oTest.installApp8();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installApp9() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installApp9();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installTLKG() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installTLKG();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installTBTV() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installTBTV();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean installSYYG() {
		// TODO Auto-generated method stub
		boolean flag = oTest.installSYYG();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean findWJYP() {
		// TODO Auto-generated method stub
		boolean flag = oTest.findWJYP();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean checkAppUpgrade() {
		// TODO Auto-generated method stub
		boolean flag = oTest.checkAppUpgrade();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean openAppByList() {
		// TODO Auto-generated method stub
		boolean flag = oTest.openAppByList();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

	@Override
	@Test(groups = {"function","appstore"} ) 
	public boolean removeAppByList() {
		// TODO Auto-generated method stub
		boolean flag = oTest.removeAppByList();
		Assertion.verifyEquals(flag, true);
		return flag;
	}

}
