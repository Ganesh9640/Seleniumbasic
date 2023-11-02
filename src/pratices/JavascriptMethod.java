package pratices;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("");
	}

}
