package RealtimeEcommerceApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TostMessageforErrorValidation extends ecommerceappBase {
public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.hideKeyboard();
	WebElement s=(WebElement) driver.findElements(By.className("android.widget.RadioButton")).get(1);
	s.click();
	driver.findElement(By.className("android.widget.Spinner")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ukraine\"))");
	driver.findElement(By.xpath("//*[@text='Ukraine']")).click();
	driver.findElement(By.className("android.widget.Button")).click();
	String q=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
	System.out.println(q);
}
}
