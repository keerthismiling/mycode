import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Calendar_Yatra {

	
	static WebDriver d;
	@BeforeTest
	public void lbrowser()
	{
		
		 d=new FirefoxDriver();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.manage().window().maximize();
	}
	@Test(dataProvider="getcontent")
	public void datepick(String url)
	{
		todayCalendar();
		tightsleep(10);
		d.get(url);
		check(By.xpath(".//*[@id='webklipper-publisher-widget-container-notification-container']"));
		d.findElement(By.xpath(".//*[@id='BE_flight_form']/div/div[2]/ul[3]/li[1]/i")).click();
		System.out.println("Clicked successfully");

		/*if(flag)
		{
			System.out.println("Popup exits");
			d.findElement(By.xpath(".//*[@id='webklipper-publisher-widget-container-notification-container']/a")).click();
		}*/
		System.out.println("test");
	}
		private void tightsleep(int i) {
		// TODO Auto-generated method stub
		
	}
		@DataProvider
		public Object[][] getcontent()
		{
			//1 row 1 column
			Object[][] testdata=new Object[1][1];
			//1row 1st column
			testdata[0][0]="http://www.yatra.com";
			//2nd row 1st parameter
			
			
			return testdata;
			
		}

	static boolean check(By xpath)
	{
		
		try
		{
		d.findElement(xpath).click();;
		return true;
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to Find Element due to" + e.getMessage());
			return false;
		}

		
	}
	/**
	 * 
	 * @param a
	 */
	static void todayCalendar()
	{
		  
		  int day, month, year;
          GregorianCalendar date = new GregorianCalendar();
          day = date.get(Calendar.DAY_OF_MONTH);
          month = date.get(Calendar.MONTH)+1;
          year = date.get(Calendar.YEAR);
          String today = "a_"+year+"_"+month+"_"+day;
          System.out.println(today);
     
	}
}
