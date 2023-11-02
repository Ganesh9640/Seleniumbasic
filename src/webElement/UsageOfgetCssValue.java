package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UsageOfgetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		String name=loginbutton.getCssValue("background-color");
		System.out.println(name);
		String color1=Color.fromString(name).asHex();
		System.out.println(color1);
		
		
	}

}
