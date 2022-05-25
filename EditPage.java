package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("keerthanakannan15497@gmail.com");

		driver.findElement(By.xpath("//input[@value = 'Clear me!!']")).clear();

		boolean enabledOrDisabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabledOrDisabled);

		String title = driver.getTitle();
		System.out.println(title);

		driver.close();

	}

}
