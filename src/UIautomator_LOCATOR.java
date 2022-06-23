import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class UIautomator_LOCATOR extends Base {
public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//findElementByAndroidUIAutomator("attribute("value")")
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	
	
	// Some Validation fields we can use to verify
	
	
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	System.out.println("Stop driver");
	driver.quit();
	System.out.println("Stop appium service");

	
	
}
}
