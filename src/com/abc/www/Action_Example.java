package com.abc.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.cssSelector("#sb_ifc0"));
		
		Actions oActions =new Actions(driver);
		Actions moreActions = oActions
				.moveToElement(element)
				.click()
				.keyDown(element,Keys.SHIFT)
				.sendKeys(element,"selenium");
		Action enterinCaps=moreActions.build();
		 enterinCaps.perform();
		 System.out.println("abhay");
		
		
	}

}
