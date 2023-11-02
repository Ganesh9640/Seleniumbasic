package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack_login {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		System.out.println("yes");
		//identify the login button in welcome page
		WebElement loginbutton_h=driver.findElement(By.xpath("//button[text()='Login']"));
		Thread.sleep(2000);
		loginbutton_h.click();
		System.out.println("yes");
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.cssSelector("input[name='Email']"));
		Email.sendKeys("ganeshlalapnoor");
		System.out.println("yes");
		Thread.sleep(2000);
	WebElement password=driver.findElement(By.cssSelector("input[name='Password']"));
	password.sendKeys("Ganesh@98");	
	System.out.println("yes");
	WebElement loginbutton=driver.findElement(By.xpath("//span[text()='Login']"));
	System.out.println("yes");
	loginbutton.click();
	}

}
