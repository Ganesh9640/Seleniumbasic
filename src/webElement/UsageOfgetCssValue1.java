package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UsageOfgetCssValue1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement loginbutton=driver.findElement(By.xpath("//a[@id='loginButton']"));
		Thread.sleep(2000);
		String actitime=loginbutton.getCssValue("background-color");
		
		String actitime1=loginbutton.getCssValue("font-family");
		System.out.println(actitime);
		System.out.println(actitime1);
		//String color2=Color.fromString(actitime1).asHex();
		String color3=Color.fromString(actitime).asHex();
		//System.out.println(color2);
		System.out.println(color3);
		

	}

}
