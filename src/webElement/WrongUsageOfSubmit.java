package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//it is not made up of the <input> or <button>
//it is not made up of type="submit"
//it is not present inside <form>
driver.get("https://demo.actitime.com/");
WebElement loginbutton=driver.findElement(By.xpath("//a[@id='loginButton']"));
loginbutton.click();

	}

}
