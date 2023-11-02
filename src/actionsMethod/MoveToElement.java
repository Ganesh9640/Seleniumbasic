package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.landrover.in/range-rover/index.html");
WebElement vehiclelink = driver.findElement(By.xpath("//span[text()='VEHICLES']"));
WebElement purchaselink = driver.findElement(By.xpath("//a[@aria-haspopup='dialog']/span[text()='PURCHASE']"));
WebElement ownerslink = driver.findElement(By.className("//li//span[text()='OWNERS']"));
WebElement explorelink = driver.findElement(By.className("//li//span[text()='EXPLORE']"));
Actions actions = new Actions(driver);
actions.moveToElement(vehiclelink).pause(1000).moveToElement(purchaselink).pause(1000).moveToElement(explorelink).pause(1000).moveToElement(ownerslink).perform();

	}

}
