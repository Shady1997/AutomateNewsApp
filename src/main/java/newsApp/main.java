package newsApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class main extends Capabilities{

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=baseCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='5. Preferences from code']").click();
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();
//		driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("shady");
//		driver.findElementByXPath("//android.widget.Button[@index='1']").click();
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();
//		driver.findElementByXPath("//android.widget.EditText[@index='0']").replaceValue("ahmed");
//		driver.findElementByXPath("//android.widget.Button[@index='1']").click();
	}

}
