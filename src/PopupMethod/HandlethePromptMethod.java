package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlethePromptMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/ganes/OneDrive/Desktop/prompt.html");
		String prompttext = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println( prompttext);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("18");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
