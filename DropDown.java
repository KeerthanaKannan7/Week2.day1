package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		// selecting the value by index
		WebElement selectingOption1 = driver.findElement(By.id("dropdown1"));
		Select option = new Select(selectingOption1);
		option.selectByIndex(1);

		// selecting the value by visible text
		WebElement selectingOption2 = driver.findElement(By.name("dropdown2"));
		Select option1 = new Select(selectingOption2);
		option1.selectByVisibleText("Appium");

		// selecting the value by Value
		WebElement selectingOption3 = driver.findElement(By.id("dropdown3"));
		Select option2 = new Select(selectingOption3);
		option2.selectByValue("3");

		// number of Options in drop-down
		WebElement listOfOptions = driver.findElement(By.className("dropdown"));
		Select listOfOption = new Select(listOfOptions);
		List<WebElement> list = listOfOption.getOptions();
		int size = listOfOption.getOptions().size();
		System.out.println(size);

		// list of options in drop-down
		for (int i = 0; i < size; i++) {
			WebElement printingOption = list.get(i);
			String text = printingOption.getText();
			System.out.println(text);
		}
	}
}
