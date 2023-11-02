package selectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultSelectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ganes/OneDrive/Desktop/static%20webpage.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("A"));
		Select s=new Select(dropdown);
	  s.selectByIndex(2);
	  s.selectByVisibleText("Mallii");
	  
	}

}
