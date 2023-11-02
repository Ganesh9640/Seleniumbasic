package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
WebElement vtgusername=driver.findElement(By.id("username"));
String attributename = vtgusername.getAttribute("value");

		if(attributename.isEmpty())
				{
			vtgusername.sendKeys("admin");
			System.out.println("the attribute is pass");
					
		}else
		{
			System.out.println("the attribute is fail");
		}
		driver.manage().window().minimize();
		
	}

}
