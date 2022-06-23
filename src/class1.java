import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class class1 extends RealdeviceTesting {
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
//		Thread.sleep(10);
		driver.findElement(By.xpath("//android.widget.CheckBox")).click();
		
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("heelo");
		driver.findElement(By.xpath("//android.widget.EditText")).clear();
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("sid");
		driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']")).click();
	}
}
