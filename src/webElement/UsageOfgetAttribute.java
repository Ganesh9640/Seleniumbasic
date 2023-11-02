package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetAttribute {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Thread.sleep(4000);
    WebElement attribute=driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
    Thread.sleep(4000);
     String size=attribute.getAttribute("href");
		System.out.println(size);
		
		
		
		
	}

}
