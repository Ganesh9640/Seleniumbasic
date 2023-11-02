package pratices;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demopratices {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/signup/");
WebElement dayselect = driver.findElement(By.id("day"));
Select slt=new Select(dayselect);
String sname = slt.getFirstSelectedOption().getText();
System.out.println(sname);
Thread.sleep(2000);
//month
WebElement monthsel = driver.findElement(By.id("month"));
Select slt1=new Select(monthsel);
String sname1 = slt1.getFirstSelectedOption().getText();
System.out.println(sname1);
Thread.sleep(2000);
//year
WebElement yearsel = driver.findElement(By.id("year"));
Select slt2=new Select(yearsel);
 String snr = slt2.getFirstSelectedOption().getText();
System.out.println(snr);
Thread.sleep(2000);

driver.manage().window().minimize();
driver.quit();

  
	}

}
