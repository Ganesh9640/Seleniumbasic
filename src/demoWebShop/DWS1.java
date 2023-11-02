package demoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://demowebshop.tricentis.com/");
 WebElement registerref = driver.findElement(By.xpath("//a[text()='Register']"));
 Thread.sleep(2000);
 registerref.click();
 WebElement radiobutton = driver.findElement(By.id("gender-male"));
 radiobutton.click();
//firstname
 WebElement firstname = driver.findElement(By.id("FirstName"));
 firstname.sendKeys("Lalapnur");
 //lastname
 WebElement lastname = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
 lastname.sendKeys("Ganesh");
 //email
 WebElement emailtextfield = driver.findElement(By.xpath("//input[@name='Email']"));
 emailtextfield.sendKeys("ganeshlalapnoor@gmail.com");
 //password
 WebElement passwprdtextfield = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
 passwprdtextfield.sendKeys("Ganesh@98");
 //confirm password
 WebElement confirmpassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
 confirmpassword.sendKeys("Ganesh@98");
 //click on register button
 WebElement register = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
 register.click();
 Thread.sleep(1000);
 driver.manage().window().minimize();
 driver.quit();
	}

}
