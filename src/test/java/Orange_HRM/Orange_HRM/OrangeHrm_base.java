package Orange_HRM.Orange_HRM;

import org.testng.Assert;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm_base {

	WebDriver d;
	@BeforeTest
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");



		d= new ChromeDriver(options);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


	}	@Test(priority = 1)
	public void open_dashboard() {

		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String title=d.getTitle();
		String etitle="OrangeHRM";
		Assert.assertEquals(title, etitle,"verification failed");


	}
	@Test(priority = 2)
	public void create_user() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
				d.findElement(By.name("firstName")).sendKeys("shiva-basava");
		d.findElement(By.name("middleName")).sendKeys("M");
		d.findElement(By.name("lastName")).sendKeys("patil");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		String n=d.findElement(By.cssSelector("/]")).getText();
		System.out.println(n+"employee ID");



	}
	@AfterTest
	public void teardpwn() {

		d.quit();
	}


}
