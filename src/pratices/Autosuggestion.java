package pratices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.google.com/");
driver.switchTo().activeElement().click();
List<WebElement> autto = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
for(WebElement b2:autto)
{
	String textfield = b2.getText();
	System.out.println(textfield);
	
}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
