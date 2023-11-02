package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandletheNotifiactionPopUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
ChromeOptions opts = new ChromeOptions();
opts.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(opts);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.ajio.com/");
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
	}

}
