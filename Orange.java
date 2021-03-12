package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
       driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
       //Thread.sleep(5000);
       driver.navigate().back();
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.name("txtPassword")).sendKeys("123");
       driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
       WebElement errmsg= driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));
       String Actualmsg= errmsg.getText();
       if(Actualmsg.equals("Csrf token validation failed"))
       {
    	   System.out.println("Testcase pass");
    	  
       }
       else
       {
    	   System.out.println("Testcase fail");
       }
       Thread.sleep(8000);

       driver.close();
	}

}
