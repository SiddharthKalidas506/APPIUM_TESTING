import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class SwipeFuninMobile extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();


		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Date Widgets");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("2. Inline");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("9");
		el3.click();
		
//		SWIPE
		TouchAction at=new TouchAction(driver);
		WebElement e= driver.findElementByAccessibilityId("52");
//		WebElement e1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]"));
		
//		at.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2))).moveTo(element(e1)).release().perform();
	
	
	}

}
