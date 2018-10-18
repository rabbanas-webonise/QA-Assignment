package testing;

//import org.apache.bcel.generic.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingAssignment {
    
 
    public static void main(String []args) throws InterruptedException {
        
      
        
       
        System.setProperty("webdriver.chrome.driver", "/home/webonise/workspace/testing/Resource/chromedriver");
        WebDriver driver;
       
        driver = new ChromeDriver();
        
        
        driver.get("https://web-stg.gofaceoff.com/");
       // WebElement element = driver.findElement(By.xpath(//a[@href='/signup']));
        WebElement signup = driver.findElement(By.xpath("//a[@href='/signup']"));
        signup.click();
        
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("rabbanShaikh@gmail.com");
        
        
      
        
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
       username.sendKeys("rabbi");
        
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
      password.sendKeys("rabbi111");
        		
      WebElement firsname = driver.findElement(By.xpath("//input[@name='first_name']"));
      firsname.clear();
      firsname.sendKeys("Rabbana");
      
      WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
      lastname.clear();
      lastname.sendKeys("Shaikh");
      
    
      
      
      WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='dateOfBirth']"));
      dateOfBirth.clear();
      dateOfBirth.sendKeys("06/12/1995");
      
  

      WebElement state = driver.findElement(By.xpath("//*[ @name = 'state']"));
      Select selectcountry = new Select(state);
      selectcountry.selectByVisibleText("LA");
      
      WebElement referralCode = driver.findElement(By.xpath("//*[ @name = 'referralCode']"));
      referralCode.clear();
      referralCode.sendKeys("ian");
      
      
      WebElement signup1 = driver.findElement(By.xpath("//*[ @type='submit']"));
      signup1.click();
      
      
      Thread.sleep(10000);
      WebElement skip = driver.findElement(By.xpath("//a[ text()='Skip']"));
      skip.click();
      
      WebElement log_pref = driver.findElement(By.xpath("//span[@class = 'dropDownIcon']"));
      log_pref.click();
      
      
      WebElement logout = driver.findElement(By.xpath("//a[ text()='Log Out']"));
      logout.click();
      
    	
    }
}


