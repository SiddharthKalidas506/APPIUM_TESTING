import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class MobileActions 	extends Base {

	
	
	public static void main(String[] args) throws MalformedURLException {
			
			AndroidDriver driver=capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//findElementByAndroidUIAutomator("attribute("value")")
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			
			
			
			// Some Validation fields we can use to verify
			
			System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
			
			
//			Long Hold and relese 
			driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
			
			
			TouchAction t=new TouchAction(driver);
			WebElement elementele=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
			t.tap(tapOptions().withElement(element(elementele))).perform();
			WebElement propname=driver.findElementByAndroidUIAutomator("text(\"People Names\")");
//			LONGPRESS WITH DURATION
			t.longPress(longPressOptions().withElement(element(propname)).withDuration(ofSeconds(10))).release().perform();
}
}
