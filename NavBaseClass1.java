package nextbet;

import org.testng.annotations.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class NavBaseClass1 {
	public static WebDriver wd = new FirefoxDriver();
	
	@BeforeSuite
    public void setUp() throws Exception {
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("http://195.244.215.132:5000/en/sports");
    }
	
    
    

	@AfterSuite
        public void tearDown() throws Exception {
    	wd.quit();
    } 

}
