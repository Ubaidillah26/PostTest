package com.juaracoding.appium.PostTest20;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;
import com.juaracoding.appium.pages.PostTest20.CalculatorPostTest20;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator20 {

	private static AndroidDriver<MobileElement> driver;
	private CalculatorPostTest20 calculatorPostTest20;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Note_8_Pro");
		capabilities.setCapability("uuid", "89ijduqkhinzmnws");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		capabilities.setCapability("automationName", "UiAutomator1");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 
	}
	
	@BeforeMethod
	public void pageObject() {
		calculatorPostTest20 = new CalculatorPostTest20(driver);
	}
	
	@Test
	public void testTambah() {
		calculatorPostTest20.calcTambah();
		System.out.println("Hasil "+calculatorPostTest20.getTxtResult());
		assertEquals(calculatorPostTest20.getTxtResult(), "3");
	}
	
	public void testKurang() {
		delay(3);
		calculatorPostTest20.calcKurang();
		System.out.println("Hasil "+calculatorPostTest20.getTxtResult());
		assertEquals(calculatorPostTest20.getTxtResult(), "1");
	}
	
	public void testBagi() {
		delay(3);
		calculatorPostTest20.calcBagi();
		System.out.println("Hasil "+calculatorPostTest20.getTxtResult());
		assertEquals(calculatorPostTest20.getTxtResult(), "2");
	}
	
	public void testKali() {
		delay(3);
		calculatorPostTest20.calcKali();
		System.out.println("Hasil "+calculatorPostTest20.getTxtResult());
		assertEquals(calculatorPostTest20.getTxtResult(), "4");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
