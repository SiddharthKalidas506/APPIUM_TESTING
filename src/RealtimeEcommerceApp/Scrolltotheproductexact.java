package RealtimeEcommerceApp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Scrolltotheproductexact extends ecommerceappBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElementById("com.androidsample.generalstore:id/nameField");
		el1.click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("hello");

//		Handle Keyboard in Mobile 
		driver.hideKeyboard();
		WebElement s = (WebElement) driver.findElements(By.className("android.widget.RadioButton")).get(1);
		s.click();
		driver.findElement(By.className("android.widget.Spinner")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ukraine\"))");
		driver.findElement(By.xpath("//*[@text='Ukraine']")).click();
		driver.findElement(By.className("android.widget.Button")).click();
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		List ff = driver.findElements(By.className("android.widget.TextView"));
		System.out.println(ff.size());
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < count; i++)

		{

			String text = ((WebElement) driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)).getText();

			if (text.equalsIgnoreCase("Jordan 6 Rings"))

			{

				((WebElement) driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i)).click();

				break;

			}

		}

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	}

}
