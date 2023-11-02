import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.com/");
Set<Cookie> cookies = driver.manage().getCookies();
System.out.println("the size of cookies"+':'+cookies.size());
for(Cookie cookie:cookies)
{
	System.out.println(cookie.getName()+':'+cookie.getValue());
	
}
driver.quit();

	}

}
