package org.appium.project.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverLaunch {

	@Test
	public void androidTest() throws MalformedURLException, InterruptedException
	{
		
		WebDriver driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
	//	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "vivo 1714");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app","D:\\official\\apk\\app-release.apk" );
		capabilities.setCapability("appPackage", "com.ziprofeetfirst");
		capabilities.setCapability("appActivity", "com.ziprofeetfirst.MainActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
		

	}
}
