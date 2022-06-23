import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

//		File adddir=new File("src");
//		File f=new File(adddir,"ApiDemos-debug.apk"); 
//		apk in sys install in emulator  
		
		DesiredCapabilities cap=new  DesiredCapabilities();
		
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Siddharth");
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName","Siddharth");
		cap.setCapability("appPackage","io.appium.android.apis");  
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos"); /* adb shell dumpsys window windows | grep -i "mCurrentFocus" */
		
//		cap.setCapability(MobileCapabilityType.APP_PACKAGE ,"com.abc.android.debug");
//		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"in.foo.android.main.MainActivity");
//		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath() );
		//UI Automator -->Android app
		//uiAutomator2 Framework
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
//		driver.findElement(null)
		


		
		
		
		
//		  "appPackage": "com.android.settings",
//		  "deviceName": "Siddharth",
//		  "platformName": "Android",
//		  "appActivity": "com.android.settings.Settings"
//		
	}

}
