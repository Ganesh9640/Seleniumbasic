package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiplemultipleselect {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("file:///C:/Users/ganes/OneDrive/Desktop/multipleselect.html");
WebElement carsdropdown = driver.findElement(By.id("cars"));
Select dropdownselect=new Select(carsdropdown);
if(dropdownselect.isMultiple())
{
	System.out.println("dropdown is multiple dropdown");
	//dropdownselect.selectByIndex(1);
	//dropdownselect.selectByIndex(2);
	dropdownselect.selectByValue("audio");
	Thread.sleep(2000);
	dropdownselect.selectByValue("benz");
	Thread.sleep(2000);
	dropdownselect.selectByValue("bicycle");
	Thread.sleep(2000);
	dropdownselect.selectByValue("scotter");
}
else
{
	System.out.println("dropdown is single dropdown");
}
//driver.manage().window().minimize();
//driver.quit();
	}

}
