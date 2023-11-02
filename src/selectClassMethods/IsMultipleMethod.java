package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/signup/");
WebElement iddropdown = driver.findElement(By.id("day"));
//WebElement iddropdown = driver.findElement(By.xpath("//select[@aria-label='the day']"));
//WebElement iddropdown = driver.findElement(By.xpath("//select[@title=\"the day\"]"));

Select temp = new Select(iddropdown);
if(temp.isMultiple())
{
	System.out.println("the dropdown is multipeselector");
}
else
{
	System.out.println("the dropdown is singleselector");
}
driver.manage().window().minimize();
driver.quit();
	}

}
