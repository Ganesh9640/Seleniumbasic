package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletheconfirmMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/ganes/OneDrive/Desktop/confirm.html");
		String confirmtext=driver.switchTo().alert().getText();
		System.out.println(confirmtext);
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
