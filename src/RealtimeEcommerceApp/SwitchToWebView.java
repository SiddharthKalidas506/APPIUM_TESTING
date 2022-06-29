package RealtimeEcommerceApp;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SwitchToWebView extends ecommerceappBase{

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		WebElement d=(WebElement) driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0);
        d.click();
        WebElement d1=(WebElement) driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0);
        d1.click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        
//        Amount of the product to sum up
        WebElement u=(WebElement) driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productPrice']")).get(0);
        WebElement u2=(WebElement) driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/productPrice']")).get(1);
        
        String d11=u.getText();
        String str=u2.getText();
        String sto=d11.substring(1);
        String sto2=str.substring(1);
        double a=Double.parseDouble(sto);
        double b=Double.parseDouble(sto2);
        System.out.println(a+"+"+b);
        double finl=a+b;
        Thread.sleep(5);
        WebElement totalprice=(WebElement) driver.findElements(By.xpath("//*[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']")).get(0);
        String totalpri=totalprice.getText();
        System.out.println(totalpri);
        String sto3=totalpri.substring(1);
        double x=Double.parseDouble(sto3);
        if(finl==x) {
        	System.out.println("its true ");
        }
        else {
        	System.out.println("Its false ");
        }
        Thread.sleep(5);
//        driver.findElement(By.xpath("//*[@text='android.widget.CheckBox']")).click();
        driver.findElement(By.className("android.widget.CheckBox")).click();
// Long press on  tearm and condition
        
        WebElement i=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        TouchAction at=new TouchAction(driver);
        at.longPress(longPressOptions().withElement(element(i)).withDuration(ofSeconds(5))).release().perform();
        driver.findElement(By.xpath("//*[@text='CLOSE']")).click();
        driver.findElement(By.xpath("//*[@text='Visit to the website to complete purchase']")).click();
        Thread.sleep(90);
        Set<String> st=driver.getContextHandles();
         for(String contex:st) {
        	 System.out.println(contex);
         }
         
         
//        Switching happening 
        Thread.sleep(100);
//         driver.context("WEBVIEW_com.androidsample.generalstore");
         driver.findElement(By.className("android.widget.EditText")).click();
         driver.findElement(By.className("android.widget.EditText")).sendKeys("pogo");
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
         driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	
}
