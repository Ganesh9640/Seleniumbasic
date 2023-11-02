package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,200)");
		driver.switchTo().frame(0);
		WebElement draggableelement = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(draggableelement, droppable).perform();
		driver.manage().window().minimize();
		driver.quit();

	}

}
