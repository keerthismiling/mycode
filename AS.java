//package Testng;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
public class AS {
	

	
	    public static void main(String[] args) {
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.hdfcbank.com/");
	        driver.manage().window().maximize();
	        Actions act = new Actions(driver);
	        WebElement link = driver.findElement(By.linkText("Two Wheeler Loan"));
	        act.moveToElement(link).contextClick().sendKeys("T").perform();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.close();
	      
	  
}
}