package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class RdLongPress extends RealDeviceBasetest{

	@Test
	public void test() throws Exception {
		DesiredCapabilities cap=new DesiredCapabilities();

		cap.setCapability("deviceName", "OPPO CPH2461");
		cap.setCapability("udid","6424bc");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		  driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click(); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		  Thread.sleep(2000);
		  WebElement element= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		  Thread.sleep(2000);
		  longPressAction(element ,driver);
		  Thread.sleep(2000);
		  
		  driver.quit();
	}
}
