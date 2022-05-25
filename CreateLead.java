package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // dowloading the chromedriver automattically

		ChromeDriver driver = new ChromeDriver(); // lauching chrome driver

		driver.get("http://leaftaps.com/opentaps/control/login"); // launching the given url

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KK");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Manual Testing and Automation Testing (Java Selenium)");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9095326910");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthanakannan15497@gmail.com");

		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(dropdown);
		option.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();

		System.out.println(title);

		driver.close();
	}

}
