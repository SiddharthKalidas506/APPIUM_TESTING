import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class Scrolling extends Base {
public static void main(String[] args) throws MalformedURLException {
	// TODO Auto-generated method stub
	
	AndroidDriver driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//findElementByAndroidUIAutomator("attribute("value")")
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	
	// Appium Does not support any scrolling method 
	
//	for this we use Android code 
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	
	
}
}
