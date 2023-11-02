package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmanage {

	public static void main(String[] args) {
		//
		WebDriver driver = new ChromeDriver();
		// pass the URL
		driver.get("https://www.facebook.com/");
		// create the new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// pass the URL
		driver.get("https://www.amazon.in/");
		Set<String> allwindowId = driver.getWindowHandles();
		for (String wid : allwindowId) {
			String windowurl = driver.switchTo().window(wid).getCurrentUrl();

			if (windowurl.equals("https://www.facebook.com/")) {
				driver.close();
			} else if (windowurl.equals("https://www.amazon.in/")) {
				Dimension amazonsize = driver.manage().window().getSize();
				int amazonwidth = amazonsize.getWidth();
				System.out.println(amazonwidth);
				int amazonheight = amazonsize.getHeight();
				System.out.println(amazonheight);
				Point amazonposition1 = driver.manage().window().getPosition();
				int amazonstartx = amazonposition1.getX();
				System.out.println(amazonstartx);
				int amazonstartY = amazonposition1.getY();
				System.out.println(amazonstartY);
				Dimension amazonsize2 = new Dimension(200, 300);
				driver.manage().window().setSize(amazonsize2);
				Point amazonposition2 = new Point(400, 500);
				driver.manage().window().setPosition(amazonposition2);
				driver.close();
			}

		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
