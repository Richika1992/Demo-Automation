package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("richikasarkar@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("richika@123");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        Thread.sleep(8000);
       
	}

}
