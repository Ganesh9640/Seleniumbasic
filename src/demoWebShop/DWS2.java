package demoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://demowebshop.tricentis.com/");
		 WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Log in']"));
		 loginbutton.click();
		 WebElement emailtextfield = driver.findElement(By.id("Email"));
		 emailtextfield.sendKeys("ganeshlalapnoor@gmail.com");
		 WebElement passwordtetxfield = driver.findElement(By.id("Password"));
		 passwordtetxfield.sendKeys("Ganesh@98");
		 WebElement loginbutton1=driver.findElement(By.xpath("//input[@value='Log in']"));
		 loginbutton1.click();
		 driver.manage().window().minimize();
		 driver.quit();

	}

}
