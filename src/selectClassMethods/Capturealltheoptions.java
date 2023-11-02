package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Capturealltheoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//preconditon
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup/");
		//day
		WebElement iddropdown = driver.findElement(By.id("day"));
		Select temp = new Select(iddropdown);
		String daydetails = temp.getFirstSelectedOption().getText();
		System.out.println(daydetails);
		//month
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select temp1 = new Select(monthdropdown);
		String monthdetails = temp1.getFirstSelectedOption().getText();
		System.out.println(monthdetails);
		//
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select temp2 = new Select(yeardropdown);
		String yeardetails = temp2.getFirstSelectedOption().getText();
		System.out.println(yeardetails);
		//post conditon
		driver.manage().window().minimize();
		driver.quit();
	}

}
