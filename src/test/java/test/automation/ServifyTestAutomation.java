package test.automation;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ServifyTestAutomation {

	private  WebDriver driver;
    public WebDriver getDriver() {
		return driver;
	}

   
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	

    @Test(priority=1)
     public void LaunchChromeBrowser() {
     this.driver = new ChromeDriver();
    System.out.println("  Helloo test  welcome Test Chrome git ");
  }
    @Test (priority=2)
     public void OpenLinkServify360DashbordUrl () throws InterruptedException{
    	System.out.println("Open360Dashbordboard URL");
      driver.get("https://360.servify.in/");
      // driver.get("http://staging.servify.in:3000/");  
      //driver.get ("http://staging.servify.in:3002/");
      //driver.findElement(By.name("username")).sendKeys("karan.b@servify.in"); 
       String homePageUrl = driver.getCurrentUrl();
       AssertJUnit.assertEquals(homePageUrl, "https://360.servify.in/");
       Thread.sleep(2000); 
       System.out.println("Opened Successfully 360Dashbordboard URL");
 }
     @Test	(priority=3)
     public void UserLoginServify360Dashbord () throws InterruptedException {
     System.out.println("Start User login on 360Dashbordboard ");
	 driver.findElement(By.name("username")).sendKeys("vishal.b@servify.in");
     driver.findElement(By.name("next")).click();	
     Thread.sleep(2000);
     //driver.findElement(By.name("password")).sendKeys("|$JBRmed+K#im");
    driver.findElement(By.name("password")).sendKeys("vishal09");
     driver.findElement(By.name("submit")).click();
     Thread.sleep(2000); 
     String HomepageURl = driver.getCurrentUrl();
     AssertJUnit.assertEquals(HomepageURl, "https://360.servify.in/dashboard");
     Thread.sleep(6000);
     //WebElement element =driver.findElement(By.id("filterDashboard"));
    // Assert.assertNotEquals(element, null);  
     System.out.println(" User logined Successfully 360Dashbordboard ");
     Thread.sleep(2000);
     }
    
     
    	 

 
   
}


	
	
	
	
	
	
	
	

