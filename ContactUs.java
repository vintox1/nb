package nextbet;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

//extend to the base class, make sure to include correct package and base class 
public class ContactUs extends nextbet.NavBaseClass1 {
    
      @Test (priority = 0)
      public void ClickContactUs() throws Exception {
    	  wd.findElement(By.linkText("Contact Us")).click();
      }
     
      @Test (priority = 1, dependsOnMethods= {"ClickContactUs"})
      public void contactustext() {  
    	  assertEquals("Contact Us", wd.findElement(By.cssSelector("h2.page-heading")).getText());
       System.out.print("\n contactustext() -> Part executed");
      }
    
      @Test (priority = 2, dependsOnMethods= {"contactustext"})
      public void text1() {  
    	  assertEquals("Should you be experiencing any problems or have any questions you would like answered, you can get in touch with us in several different ways.  You can contact our customer services team 24/7 via instant chat or e mail, which ever suits you best.  The contact details are as follows:", wd.findElement(By.cssSelector("p.intro-par")).getText());
       System.out.print("\n text1() -> Part executed");
      }
      
      @Test (priority = 3, dependsOnMethods= {"text1"})
      public void livesupport() {  
    	  assertEquals("Live Chat Support", wd.findElement(By.linkText("Live Chat Support")).getText());
       System.out.print("\n livesupport() -> Part executed");
      }
     
      @Test (priority = 4, dependsOnMethods= {"livesupport"})
      public void generalinquiries() {  
      assertEquals(" For general inquiries, please send an email to support@nextbet.com", wd.findElement(By.xpath("//div[@id='centre']/div[2]/div/div/p[3]")).getText());
      System.out.print("\n generalinquiries() -> Part executed");
     }
    
      @Test (priority = 5, dependsOnMethods= {"generalinquiries"})
      public void supportemail() {  
      assertEquals("support@nextbet.com", wd.findElement(By.linkText("support@nextbet.com")).getText());
      System.out.print("\n supportemail() -> Part executed");
     }
      
      @Test (priority = 6, dependsOnMethods= {"supportemail"})
      public void marketingmail() {  
      assertEquals("marketing@nextbet.com", wd.findElement(By.linkText("marketing@nextbet.com")).getText());
      System.out.print("\n marketingmail() -> Part executed");
     }

      @Test (priority = 7, dependsOnMethods= {"marketingmail"})
      public void liveimage() {
   	  Assert.assertTrue(wd.findElement(By.cssSelector("img.asset.image")).isDisplayed());  
      System.out.print("\n liveimage() -> Part executed");
      }
     
      @Test (priority = 8, dependsOnMethods= {"liveimage"})
      public void question() {
    	  Assert.assertTrue(wd.findElement(By.xpath("//img[@alt='Contact gen']")).isDisplayed()); 
      System.out.print("\n question() -> Part executed");
      }
       
      @Test (priority = 9, dependsOnMethods= {"question"})
      public void mail() {
    	  Assert.assertTrue(wd.findElement(By.xpath("//img[@alt='Contact mark']")).isDisplayed()); 
      System.out.print("\n mail() -> Part executed");
      }
       
      @Test (priority = 10, dependsOnMethods= {"mail"})
      public void affiliate() {
    	  Assert.assertTrue(wd.findElement(By.xpath("//img[@alt='Contact aff']")).isDisplayed()); 
      System.out.print("\n affiliate() -> Part executed");
      }
    
      
}
