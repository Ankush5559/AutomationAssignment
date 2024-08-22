package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GeneralStore {

	
	AndroidDriver driver;
	AppiumDriverLocalService service;
//	@BeforeMethod
	@Test
	public void test() throws Exception{
		UiAutomator2Options opt=new UiAutomator2Options();
		opt.setDeviceName("Ankush");					
		opt.setApp("E:\\Appim"
				+ "\\apk file\\General-Store.apk"); 
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);	
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Gabbar Singh");
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"India\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
