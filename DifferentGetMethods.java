package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentGetMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Edit.html");

		// to get title
		System.out.println(driver.getTitle());

		// to get current URL
		System.out.println(driver.getCurrentUrl());

		// to get HTML code
		System.out.println(driver.getPageSource());

		// to get the values of attribute
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

		// enabled or not
		boolean enabledOrDisabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabledOrDisabled);

		boolean disabledOrEnabled = driver.findElement(By.xpath("//input[@value = 'Clear me!!']")).isEnabled();
		System.out.println(disabledOrEnabled);

		// displayed or not
		boolean displayedOrNot = driver.findElement(By.xpath("//input[@value = 'Append ']")).isDisplayed();
		System.out.println(displayedOrNot);
	}

}
