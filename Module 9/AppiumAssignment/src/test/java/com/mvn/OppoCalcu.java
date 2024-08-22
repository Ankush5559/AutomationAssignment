package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class OppoCalcu {
	@Test
	public void managecal() throws Exception {
		DesiredCapabilities cap=new DesiredCapabilities();
	
	
	cap.setCapability("deviceName", "OPPO CPH2461");
	cap.setCapability("udid","6424bc");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "14.0");
	cap.setCapability( "appPackage","com.coloros.calculator");
	cap.setCapability("appActivity","com.android.calculator2.Calculator");
	cap.setCapability("automationName", "UIAutomator2");
     
	URL url=new URL("http://127.0.0.1:4723/");
	
	AppiumDriver driver=new AppiumDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(2000);
	//Addition
	driver.findElement(By.id("com.coloros.calculator:id/digit_3")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/digit_5")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
	Thread.sleep(500);
	
	//subtraction
	
    driver.findElement(By.id("com.coloros.calculator:id/digit_5")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/op_sub")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
	Thread.sleep(500);
	
	//Multiplication
	
    driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/op_mul")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
	Thread.sleep(500);
	
	//Division
	
    driver.findElement(By.id("com.coloros.calculator:id/digit_6")).click();
	
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/op_div")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
	Thread.sleep(500);
	
	driver.findElement(By.id("com.coloros.calculator:id/eq")).click();
	Thread.sleep(500);
	
	
	}
	
	
}
