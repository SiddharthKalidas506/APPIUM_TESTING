import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class DragandDrop extends Base {
public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//findElementByAndroidUIAutomator("attribute("value")")
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Drag and Drop");
	el1.click();
	TouchAction t=new TouchAction(driver);
	
	WebElement s=(WebElement) driver.findElementsByClassName("android.view.View").get(0);
	WebElement L=(WebElement) driver.findElementsByClassName("android.view.View").get(1);
	t.longPress(longPressOptions().withElement(element(s))).moveTo(element(L)).release().perform();
	
}
}
