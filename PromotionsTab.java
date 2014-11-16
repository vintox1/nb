package nextbet;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;


//extend to the base class, make sure to include correct package and base class 
public class PromotionsTab extends nextbet.NavBaseClass1 {

    @Test (priority = 0)
    public void Promotions() throws Exception {
    	wd.findElement(By.linkText("PROMOTIONS")).click();
    }
    
    
    @Test (priority = 1, dependsOnMethods= {"Promotions"})
    public void PromText() {  
  	  assertEquals("Promotions", wd.findElement(By.cssSelector("div.promotions-page > h2")).getText());
     System.out.print("\n contactustext() -> Part executed");
    }
    
   
}
