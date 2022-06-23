import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealdeviceTesting {

	public static AndroidDriver capabilities()  throws MalformedURLException {
		
		
		File adddir=new File("src");
		File f=new File(adddir,"ApiDemos-debug.apk"); 
//		apk in sys install in emulator  
		
		DesiredCapabilities cap=new  DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");
//		cap.setCapability("platformName","Android");
//		cap.setCapability("deviceName","Android Devices");
//		cap.setCapability("appPackage","io.appium.android.apis");  
//		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos"); /* adb shell dumpsys window windows | grep -i "mCurrentFocus" */
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath() );
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	} 
}
