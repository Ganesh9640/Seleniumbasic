package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfindependentofdependentXpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(4000);
		WebElement mens=driver.findElement(By.xpath("//input[text()='Male']/..//input[@type='radio']"));
		mens.click();
		driver.manage().window().minimize();
		driver.close();

	}

}
