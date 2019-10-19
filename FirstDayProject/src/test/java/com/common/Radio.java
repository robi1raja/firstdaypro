package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		
		WebElement RadioMale=driver.findElement(By.xpath("//input[@id='u_0_a']"));
		RadioMale.click();
		Boolean x = RadioMale.isEnabled();
		System.out.println("is Enabled= "+x);
		
	}

}
