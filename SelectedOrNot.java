package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedOrNot {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/radio.html");

		// Selectable or not
		System.out.println(driver.findElement(By.xpath("(//input[@value= '0'])[1]")).isSelected());

		System.out.println(driver.findElement(By.xpath("(//input[@name = 'news'])[2]")).isSelected());

	}

}
