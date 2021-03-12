package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
       
       /* driver.findElement(By.id("email")).sendKeys("richikasarkar@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("richika@123");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        Thread.sleep(8000);
        //Alert al=driver.switch.to();
        driver.navigate().back();*/
        driver.findElement(By.id("email")).sendKeys("richikasarkar@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("richika");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
         WebElement errmsg= driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
        String actualmsg = errmsg.getText();
        if(actualmsg.equalsIgnoreCase("The password that you've entered is incorrect."))
        {
         System.out.println("Testcase pass");
        }
        else
         {
        	 System.out.println("Testcase fail");
         }
        WebElement link= driver.findElement(By.xpath("//div[@id=\"login_link\"]/div/a"));
        Actions act =new Actions(driver);
        act.click(link).perform();
        Thread.sleep(8000);
		
        driver.close();
	}


}
