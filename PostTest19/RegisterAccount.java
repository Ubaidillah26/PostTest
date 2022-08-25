package com.juara.coding.PageObject.PostTest19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageObject.drivers.DriverSingleton;

public class RegisterAccount {

	private WebDriver driver;

	public RegisterAccount() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//  Create Account =====================================
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement btnCreate;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement radioGender;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//select[@id='days']")
	private WebElement btnTgl;
	
	@FindBy(xpath = "//*[@id=\"days\"]/option[32]")
	private WebElement clickTgl;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement btnBln;
	
	@FindBy(xpath = "//*[@id=\"months\"]/option[4]")
	private WebElement clickBln;
	
	@FindBy(xpath = "//select[@id='years']")
	private WebElement btnThn;
	
	@FindBy(xpath = "//*[@id=\"years\"]/option[27]")
	private WebElement clickThn;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement radioNews;
	
	@FindBy(xpath = "//input[@id='optin']")
	private WebElement radioOption;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement txtFirstNameAddress;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement txtLastNameAddress;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement txtCompany;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement txtAddress1;
	
	@FindBy(xpath = "//input[@id='address2']")
	private WebElement txtAddress2;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;
	
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement btnState;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]/option[3]")
	private WebElement btnPilihState;
	
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement txtPostalCode;
	
	@FindBy(xpath = "//select[@id='id_country']")
	private WebElement btnCountry;
	
	@FindBy(xpath = "//*[@id=\"id_country\"]/option[2]")
	private WebElement btnPilihCountry;
	
	@FindBy(xpath = "//textarea[@id='other']")
	private WebElement txtAdditional;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement txtHomePhone;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement txtMobilePhone;
	
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement txtAddressOptional;
	
	@FindBy(xpath = "//span[normalize-space()='Register']")
	private WebElement btnRegist;
	
//	Login ==========================================
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEmailLogin;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement txtPassLogin;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement btnLogin;
	
//	Replace =========================================
	
	public void txtEmailLogin() {
		txtEmailLogin.sendKeys("ubaidillah.jobs@gmail.com");
	}
	
	public void txtPassLogin() {
		txtPassLogin.sendKeys("ubai123");
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	
	public void txtEmail() {
		txtEmail.sendKeys("ubaidillah.jobs@gmail.com");
	}
	
	public void btnCreate() {
		btnCreate.click();
	}
	
	public void radioGender() {
		radioGender.click();
	}
	
	public void txtFirstName() {
		txtFirstName.sendKeys("Ubai");
	}
	
	public void txtLastName() {
		txtLastName.sendKeys("Dillah");
	}
	
	public void txtPassword() {
		txtPassword.sendKeys("ubai123");
	}
	
	public void btnTgl() {
		btnTgl.click();
	}
	
	public void clickTgl() {
		clickTgl.click();
	}
	
	public void btnBln() {
		btnBln.click();
	}
	
	public void clickBln() {
		clickBln.click();
	}
	
	public void btnThn() {
		btnThn.click();
	}
	
	public void clickThn() {
		clickThn.click();
	}
	public void radioNews() {
		radioNews.click();
	}
	
	public void radioOption() {
		radioOption.click();
	}
	
	public void txtFirstNameAddress() {
		txtFirstNameAddress.sendKeys("Musyawarah");
	}
	
	public void txtLastNameAddress() {
		txtLastNameAddress.sendKeys("Jagakarsa");
	}
	
	public void txtCompany() {
		txtCompany.sendKeys("PT. Axiata Digital Lab");
	}
	
	public void txtAddress1() {
		txtAddress1.sendKeys("Gg.Musyawarah");
	}
	
	public void txtAddress2() {
		txtAddress2.sendKeys("RT006/RW04");
	}
	
	public void txtCity() {
		txtCity.sendKeys("Jakarta Selatan");
	}
	
	public void btnState() {
		btnState.click();
	}
	
	public void btnPilihState() {
		btnPilihState.click();
	}
	
	public void txtPostalCode() {
		txtPostalCode.sendKeys("14620");
	}
	
	public void btnCountry() {
		btnCountry.click();
	}
	
	public void btnPilihCountry() {
		btnPilihCountry.click();
	}
	
	public void txtAdditional() {
		txtAdditional.sendKeys("Rumah Saya Dekat Dengan Masjid");
	}
	
	public void txtHomePhone() {
		txtHomePhone.sendKeys("02198886622");
	}
	
	public void txtMobilePhone() {
		txtMobilePhone.sendKeys("089652427840");
	}
	
	public void txtAddressOptional() {
		txtAddressOptional.sendKeys("Jakarta Indonesia");
	}
	
	public void btnRegist() {
		btnRegist.click();
	}
}
