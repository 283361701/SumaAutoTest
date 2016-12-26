package com.sumavision.testcase;

import java.util.Set;

import javax.sound.midi.SysexMessage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sumavision.common.CmdUnit;
import com.sumavision.driver.InitDriver;
import com.sumavision.element.Eiptv;
import com.sumavision.operation.Oiptv;

import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.android.AndroidKeyCode.*;

public class Debug extends InitDriver {
	private Oiptv oTest;
	private Eiptv eTest;
	@BeforeClass
	public void initDriver() {
		Assert.assertNotNull(driver);
		oTest = new Oiptv(driver);
	}
	@BeforeMethod
	public void initTest() {
		System.out.println("Start");
	}
	@AfterMethod
	public void quitTest() {
		driver.quit();
		System.out.println("Stop");
	}
	@Test
	public void getInfo() {
		CmdUnit.runAdb("monkey -p com.suning.tv.ebuy 1");
//		oTest.sleep(5000);
//		driver.context("WEBVIEW");
//		System.err.println(driver.getContext());
//		AndroidElement ae = eTest.findByName("sda1");
		oTest.sleep(5000);
		oTest.sendKeyCode(ENTER,1,2000);
		Set<String> contextNames = driver.getContextHandles();  
		for (final String contextName : contextNames) {
			System.out.println(contextName);
		}
	}
	

}
