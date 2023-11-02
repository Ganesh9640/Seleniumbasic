package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CandidateDetails {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//precondition
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/signup/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//day
//WebElement daydropdown = driver.findElement(By.id("day"));
WebElement daydropdown = driver.findElement(By.xpath("//select[@aria-label='Day']"));

Select selectday=new Select(daydropdown);
selectday.selectByIndex(20);
Thread.sleep(2000);
//month
WebElement monthdropdown = driver.findElement(By.id("month"));
Select selectmonth=new Select(monthdropdown);
selectmonth.selectByValue("9");
Thread.sleep(2000);
//year
WebElement yeardropdown = driver.findElement(By.id("year"));
Select selectyear=new Select(yeardropdown);
selectyear.selectByVisibleText("2000");
//post condition
driver.manage().window().minimize();
driver.quit();




	}

}
