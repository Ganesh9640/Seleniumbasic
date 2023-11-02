package selectClassMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Displayalltheoptions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/signup/");
Thread.sleep(3000);
WebElement monthdropdown = driver.findElement(By.id("year"));
Select monthselect=new Select(monthdropdown);
Thread.sleep(3000);
List<WebElement> alloptions = monthselect.getOptions();
Thread.sleep(3000);
for(WebElement opt:alloptions)
{
	String tagtext = opt.getText();
	//Thread.sleep(3000);
	System.out.println(tagtext);
	monthselect.selectByVisibleText(tagtext);
	if(opt.isSelected())

{
	System.out.println("all the optiond are captured");
}
else
{
	System.out.println("all the optiond are not captured");

	}

}
driver.manage().window().minimize();
driver.quit();
	}
}
