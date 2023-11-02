package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNestedFrame {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demo.automationtesting.in/Frames.html");
driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
WebElement outframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
driver.switchTo().frame(outframe);
WebElement innerframe = driver.findElement(By.xpath("//div[@class=\'iframe-container\']/iframe"));
driver.switchTo().frame(innerframe);
WebElement innerframetext = driver.findElement(By.xpath("//input[@type='text']"));

innerframetext.sendKeys("selenium");
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
	}

}
