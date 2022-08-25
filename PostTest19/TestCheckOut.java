package com.juaracoding.pageObject.Test19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juara.coding.PageObject.PostTest18.SampleWishlist;
import com.juara.coding.PageObject.PostTest19.RegisterAccount;
import com.juara.coding.PageObject.PostTest19.SampleCheckOut;
import com.juaracoding.pageObject.drivers.DriverSingleton;

public class TestCheckOut {

	public static WebDriver driver;
	private RegisterAccount registerAccount;
	private SampleWishlist sampleWishlist;
//	private SampleCheckOut sampleCheckOut ;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		registerAccount = new RegisterAccount();
		sampleWishlist = new SampleWishlist();
	}

// Test Create Account ======================
	
	@Test(priority = 1)
	public void testBuatAkun() {
		registerAccount.txtEmail();
		registerAccount.btnCreate();
	}

	@Test(priority = 2)
	public void testIsiBiodata() {
		delay(5);
		registerAccount.radioGender();
		registerAccount.txtFirstName();
		registerAccount.txtLastName();
		registerAccount.txtPassword();
		registerAccount.btnTgl();
		registerAccount.clickTgl();
		registerAccount.btnBln();
		registerAccount.clickBln();
		registerAccount.btnThn();
		registerAccount.clickThn();
		registerAccount.radioNews();
		registerAccount.radioOption();
		registerAccount.txtFirstNameAddress();
		registerAccount.txtLastNameAddress();
		registerAccount.txtCompany();
		registerAccount.txtAddress1();
		registerAccount.txtAddress2();
		registerAccount.txtCity();
		registerAccount.btnState();
		registerAccount.btnPilihState();
		registerAccount.txtPostalCode();
		registerAccount.btnCountry();
		registerAccount.btnPilihCountry();
		registerAccount.txtAdditional();
		registerAccount.txtHomePhone();
		registerAccount.txtMobilePhone();
		registerAccount.txtAddressOptional();
		registerAccount.btnRegist();
			System.out.println("Kamu Berhasil Buat Akun");
	}
	
//	Test Login =======================================
	
	@Test(priority = 3)
	public void testLogin() {
		registerAccount.txtEmailLogin();
		registerAccount.txtPassLogin();
		registerAccount.btnLogin();
			System.out.println("Kamu Berhasil Login");
	}

//	Test CheckOut ====================================
	
	@Test(priority = 4)
	public void testWishlist() {
		delay(3);
		sampleWishlist.btnTxtSearch();
		sampleWishlist.txtSearch();
		sampleWishlist.btnSearch();
			System.out.println("Berhasil Melakukan Pencarian");
	}

	@Test(priority = 5)
	public void testWishlist1() {
		scroll(500);
		sampleWishlist.cssPilih1();
		sampleWishlist.btnChart1();
		sampleWishlist.btnCloseChart1();
		delay(10);
		sampleWishlist.cssPilih2();
		sampleWishlist.btnChart2();
		sampleWishlist.btnCloserChart2();
		delay(10);
			System.out.println("Berhasil Checkout 2 Barang");
	}

	@AfterClass
	public void closeBrowser() {
		delay(10);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}
