package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyalttextbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/search?q=3afea702aba732c499bb7ed9f429d299db231eb024c36740a6163ccd4033&rlz=1C1ONGR_enIN1026IN1026&sourceid=chrome&ie=UTF-8");
	}

}
