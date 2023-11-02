package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIndividualFrame {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//frame1
driver.switchTo().frame("packageListFrame");
WebElement fram1 = driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']"));
fram1.click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
//fram2
driver.switchTo().frame("packageFrame");
WebElement frame2 = driver.findElement(By.xpath("//span[text()='Alert']"));
Thread.sleep(2000);
frame2.click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
//frame3
driver.switchTo().frame("classFrame");
WebElement frame3 = driver.findElement(By.xpath("//a[text()='Method']"));
Thread.sleep(2000);
frame3.click();
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
	}

}

