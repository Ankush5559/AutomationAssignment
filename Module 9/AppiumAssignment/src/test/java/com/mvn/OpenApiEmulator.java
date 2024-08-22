package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class OpenApiEmulator {
		public AndroidDriver driver;
	@Test
	//	@BeforeMethod
		public void test() throws Exception, InterruptedException {
		
			
			UiAutomator2Options options=new UiAutomator2Options();
			
			options.setDeviceName("Ankush");
			options.setApp("E:\\Appim\\apk file\\ApiDemos-debug.apk");
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}

}
