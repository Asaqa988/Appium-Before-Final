package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppiumDriver {

	@Test()
	public void myFirstTest() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("platformName", "Android");
		// OR
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

//		caps.setCapability("deviceName", "abed");

		// OR
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "abed");

		// ---------------------------------------------------
//		caps.setCapability("browserName", "chrome");
		// OR

		caps.setCapability("chromedriverExecutable", "C:\\Users\\User\\Downloads\\chromedriver.exe");

//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

		// install it as standalone application 
//		File app = new File("src/test/calculator.apk");

//		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		// Or install it form your laptop 
		caps.setCapability(MobileCapabilityType.APP,
				"D:\\Users\\User\\eclipse-workspace\\Final-Lecture\\src\\test\\calculator.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//
//		driver.get("https://www.yahoo.com");
	}

}
