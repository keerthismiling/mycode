import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Cookies {
    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.ie.driver","C://Users//Admin//Desktop//Selenium//Poc -modify//Action_Bot//Drivers//IEDriverServer.exe");
    	WebDriver driver =new InternetExplorerDriver();
        
		 driver.get("https://www.ancestry.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        System.out.println("cookies before delete: "+driver.manage().getCookies());
        
        driver.manage().deleteAllCookies(); 
        
        System.out.println("cookies after delete: "+driver.manage().getCookies());
    }
}