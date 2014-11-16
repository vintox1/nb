package nextbet;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import static org.openqa.selenium.OutputType.*;

public class navigate {
	
	public static WebDriver wd = new FirefoxDriver();
	
	String Actualtext;
  
	@Test
  public void nav() throws Exception {
	  
	  wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  wd.get("http://195.244.215.132:5000/en/sports");
	  	  
      
//      wd.findElement(By.cssSelector("#mainbook_navigation > ul.rollup-content > li > h3.sport > div.expander")).click();
//      wd.findElement(By.cssSelector("h4.event_path > div.expander")).click();
//      wd.findElement(By.linkText("Primera B Nacional, Group A")).click();
	  
//      Actualtext = wd.findElement(By.cssSelector("span.col1")).getText();
	  
	  Actualtext = wd.findElement(By.cssSelector("h1.markets-title > span")).getText();

      assertEquals(Actualtext, "Top Live Matches");
      
  }
	    @AfterTest
        public void tearDown() throws Exception {
    	wd.quit();
	    }

}
