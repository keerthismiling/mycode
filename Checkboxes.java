import java.util.List;
//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import bsh.commands.dir;

public class Checkboxes {

	public WebDriver d;
	
	@BeforeTest
	public void init()
	{
		
		d=new FirefoxDriver();
		
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		d.get("http://www.gsmarena.com/samsung-phones-9.php");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> k=d.findElements(By.xpath(".//input[@type='Checkbox']"));
		//System.out.println("test");
		//js.executeScript(document.w, arg1)
		//js.executeScript(arg0, arg1)
		for(int i=0;i<k.size();i=i+2)
		{	
			k.get(i).click();
		}		
		int checkedcount=0,unchecked_count=0;
		for(int i=0;i<k.size();i++)
		{
			 if(k.get(i).isSelected())
			 {
				 System.out.println(i+"Checkbox selected"+k.get(i).isSelected());
				 checkedcount++;
				 
			 }
			 else
			 {
				 System.out.println(i+"Checkbox Not selected"+k.get(i).isSelected());
				  unchecked_count++;
			 }
			
		}
		
		System.out.println("Number of Selected CheckBoxes"+ checkedcount);
		System.out.println("Number of Selected CheckBoxes"+ unchecked_count);
		
	}
	
	@Test
	public void test2()
	{
		
		System.out.println("Second test");
		
	}
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("thrd tes");
		String a="a";
		
		Assert.assertTrue(a.contentEquals("dd"));
	}
	@AfterTest
	public void finish()
	{
		System.out.println("End of testing");
	}
}
