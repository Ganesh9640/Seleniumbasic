package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNestedFrameA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
WebDriver parentframe = driver.switchTo().frame("iframeResult");
//using the method frame(int Index)
driver.switchTo().frame(0);
WebElement childframe = driver.findElement(By.xpath("//body/h1"));
String childtext = childframe.getText();
System.out.println(childtext);
//using the method called the parentframe()
driver.switchTo().parentFrame();
String parentelement= driver.findElement(By.xpath("//body/p")).getText();
System.out.println(parentelement);
driver.manage().window().minimize();
driver.quit();


	}

}
