package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSelectedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the
		 driver.get("https://demo.actitime.com/");
		 WebElement emailcheckbox=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		 if(emailcheckbox.isSelected())
		 {
			System.out.println("checkbox is selected");
		 }
		 else
		 {
			 emailcheckbox.click(); 
			 System.out.println("checkbox is not selected");
		 }
	}

}
