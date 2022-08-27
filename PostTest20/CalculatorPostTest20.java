package com.juaracoding.appium.pages.PostTest20;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorPostTest20 {

private AndroidDriver<MobileElement> driver;
	
	public CalculatorPostTest20(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Locator
	@AndroidFindBy(id = "com.miui.calculator:id/btn_1_s")
	private MobileElement btnSatu;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_2_s")
	private MobileElement btnDua;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_3_s")
	private MobileElement btnTiga;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_4_s")
	private MobileElement btnEmpat;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_plus_s")
	private MobileElement btnTambah;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_minus_s")
	private MobileElement btnKurang;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_div_s")
	private MobileElement btnBagi;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_mul_s")
	private MobileElement btnKali;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_equal_s")
	private MobileElement btnSamaDengan;
	
	@AndroidFindBy(id = "com.miui.calculator:id/result")
	private MobileElement hasil;
	
	@AndroidFindBy(id = "com.miui.calculator:id/btn_c_s")
	private MobileElement clear;
	
	/* web: xpath = //taghtml[contains(@attr, value)] */
	
	//Method
	public void calcTambah() {
		btnSatu.click();
		btnTambah.click();
		btnDua.click();
		btnSamaDengan.click();
		clear.click();
	}
	
	public void calcKurang() {
		btnEmpat.click();
		btnKurang.click();
		btnDua.click();
		btnSamaDengan.click();
		clear.click();
	}
	
	public void calcBagi() {
		btnEmpat.click();
		btnBagi.click();
		btnDua.click();
		btnSamaDengan.click();
		clear.click();
	}
	
	public void calcKali() {
		btnDua.click();
		btnKali.click();
		btnDua.click();
		btnSamaDengan.click();
		clear.click();
	}

	public String getTxtResult() {
		return hasil.getText();
	}
}
