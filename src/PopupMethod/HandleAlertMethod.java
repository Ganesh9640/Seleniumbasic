package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("file:///C:/Users/ganes/OneDrive/Desktop/alert.html");
String alerttext =driver.switchTo().alert().getText();
System.out.println("alerttext");
//accepting the accept method
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.manage().window().minimize();
driver.quit();
	}

}
