package pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions opts=new ChromeOptions();
opts.addArguments("--disable-notificaton");
WebDriver driver=new ChromeDriver();
	}

}
