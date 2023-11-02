package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    String ExpectedText = "Forgotten password?";
	    System.out.println(ExpectedText);
	   WebElement text=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	   String  ActualText=text.getText();
	   System.out.println(ActualText);
	   if(ActualText.equals(ExpectedText)) {
		   text.click();		
		   System.out.println("the actual text is similar to expectedtext");
	   }
	   else
	   {
		   System.out.println("the actual text is not similar to expectedtext");
	   }
	   driver.close();
	}

}
