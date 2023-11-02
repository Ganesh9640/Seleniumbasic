package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentXpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		WebElement mens=driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		Thread.sleep(4000);
		mens.click();
		Thread.sleep(4000);
		System.out.println("yes");
		driver.manage().window().minimize();
		driver.close();
	}

}
