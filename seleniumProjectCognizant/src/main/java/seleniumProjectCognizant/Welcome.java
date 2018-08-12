package seleniumProjectCognizant;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Welcome {
	
	public String exePath;
	public static WebDriver driver;
	
	
	public Welcome(){
		
		exePath = "C:\\Users\\Shivaji\\Videos\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
	}
	
	
	//Enter the data in the date picker uing webDriver
	public void DatePickerFill(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09252013");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        dateBox.sendKeys("0245PM");

	
	}
	
	
	//Login to the facebook 
	public void facebookLogin(){
		
		//WebDriver driver = new FirefoxDriver();
	    //driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	   // Thread.sleep(10000);
	    WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement password = driver.findElement(By.id("pass"));
	    
	    WebElement Login = driver.findElement(By.xpath("//input[@type='submit']"));
	    username.sendKeys("7840998802");
	    password.sendKeys("punam112001");
	    //Thread.sleep(2000);
	    Login.click();
	    		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\Chrome Driver\\V229\\chromedriver.exe");
		
		
		//driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
			Welcome a = new Welcome();
			//a.facebookLogin();
			a.DatePickerFill();
			
			
		
	}
}
