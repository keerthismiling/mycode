import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Naukri_Web {
	
	WebDriver driver;
		
		
	@BeforeTest
	public void launch()
	{
		
		driver=new FirefoxDriver();
	}
	
	@Test(dataProvider="geturl")
	public void realtest(String url)
	{
		WebElement email;
		int a;
		try
		{
		driver.get(url);
		//a=10;
		 driver.findElement(By.id("txt2")).sendKeys("ff");
		 //driver.findElement(By.xpath(".//*[@id='txt2']")).sendKeys("dd");
		}
		catch(Exception e)
		{
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('txt2').value='sanjay'");
			System.out.println(driver.findElement(By.xpath(".//*[@id='txt2']")).isEnabled());
			System.out.println(e.getMessage()+"\n.........."+"Element not enabled");
		}
		/*email.sendKeys("zenqa123@yopmail.com");
		System.out.println(email.isEnabled());*/
	}
	@DataProvider
	public Object[][] geturl()
	{
		
		Object[][] testdata=new Object[1][1];
		testdata[0][0]="http://my.naukri.com/manager/createacc2.php?othersrcp=5424&wExp=N";
		return testdata;
	}

}
