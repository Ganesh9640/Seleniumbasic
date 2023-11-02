package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("9640592109");

		WebElement contin=driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']"));
		contin.click();
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ganesh@98");
		WebElement signbutton=driver.findElement(By.cssSelector("form[name=signIn] > div > div:nth-of-type(2) > span:nth-child(1) > span > input:nth-child(1)"));
		signbutton.click();
		//search the product 
		WebElement searchbutton=driver.findElement(By.xpath("//input[@type='text']"));
		 searchbutton.sendKeys("puma");
		WebElement searchclickbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		searchclickbutton.click();
	}

}
