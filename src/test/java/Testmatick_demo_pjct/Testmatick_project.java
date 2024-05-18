package Testmatick_demo_pjct;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmatick_project {
	@Test
	public void clss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhimanyu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testmatick.com/");
		 Actions actions = new Actions(driver);

	        // Move the mouse pointer to the center of the navbar.
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"))).perform(); // move to Home
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"menu-item-26645\"]/a")).click();
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"))).perform();
	        Thread.sleep(2000);
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26483\"]/a"))).perform();
			driver.findElement(By.xpath("//*[@id=\"menu-item-26663\"]/a/span")).click();
			
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"))).perform(); // move to Home
		    Thread.sleep(2000);
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-28366\"]/a/span"))).perform(); // move to careers
	        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-29147\"]/a/span"))).perform(); // move to our openings
	        driver.findElement((By.xpath("//*[@id=\"menu-item-29147\"]/a/span"))).click(); // click our openings

			driver.findElement(By.xpath("//*[@id=\"nf-field-160-wrap\"]/div/span/input")).sendKeys("swathi");
			driver.findElement(By.xpath("//*[@id=\"nf-field-161-wrap\"]/div/span/input")).sendKeys("swathi@gmail.com");
			
			// file upload code -- not working 
		    //WebElement element = driver.findElement(By.xpath("//*[@id=\"nf-field-163-wrap\"]/div[2]/label"));
		   // element.sendKeys("C:\\\\Users\\\\Abhimanyu\\\\Downloads\\\\test.pdf");
          //driver.findElement(By.xpath("//*[@id=\"wpcf7-f39305-p29125-o1\"]/form/div[5]/div/div/input")).click();
			
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"personal_requirements\"]"))).perform(); 
		    Thread.sleep(2000);
		    driver.findElement((By.xpath("//*[@id=\"personal_requirements\"]"))).click();
		    
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"_our_benefits_and_goodies\"]"))).perform(); 
		    Thread.sleep(2000);
		    driver.findElement((By.xpath("//*[@id=\"_our_benefits_and_goodies\"]"))).click();
		  
		    driver.findElement(By.xpath("//*[@id=\"wpcf7-f39309-p29125-o2\"]/form/div[2]/div/div[2]/span/input")).sendKeys("swathi");
		    driver.findElement(By.xpath("//*[@id=\"wpcf7-f39309-p29125-o2\"]/form/div[3]/div/div[2]/span/input")).sendKeys("swathi123@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"wpcf7-f39309-p29125-o2\"]/form/div[4]/div/div/div[2]/span/select")).sendKeys("Hacker");
		    WebElement element = driver.findElement(By.xpath("//*[@id=\"wpcf7-f39309-p29125-o2\"]/form/div[5]/div/div[2]/label"));
	        File file = new File("C:\\Users\\Abhimanyu\\Downloads\\test.pdf");
		    driver.findElement(By.xpath("//*[@id=\"wpcf7-f39309-p29125-o2\"]/form/div[6]/div/div[2]/span/textarea")).sendKeys("2 years exp");

		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-31103\"]/a"))).perform(); 
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26631\"]"))).perform(); 
		    driver.findElement((By.xpath("//*[@id=\"menu-item-26631\"]/a/span"))).click();
		    
			driver.findElement(By.xpath("//*[@id=\"nf-field-222\"]")).sendKeys("swathi");
			driver.findElement(By.xpath("//*[@id=\"nf-field-227\"]")).sendKeys("futura");
			driver.findElement(By.xpath("//*[@id=\"nf-field-223\"]")).sendKeys("swati@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"nf-field-229\"]")).sendKeys("8985414541");
			driver.findElement(By.xpath("//*[@id=\"nf-field-231\"]")).sendKeys("Togo");
			driver.findElement(By.xpath("//*[@id=\"nf-label-field-230-0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"nf-field-224\"]")).sendKeys("automation testing");
			driver.findElement(By.xpath("//*[@id=\"nf-field-232\"]")).sendKeys("In about a week");
			driver.findElement(By.xpath("//*[@id=\"nf-field-225\"]")).click();
		    Thread.sleep(2000);

		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26351\"]/a"))).perform(); 
		    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26358\"]/a/span"))).perform(); 
		    driver.findElement((By.xpath("//*[@id=\"menu-item-26358\"]/a/span"))).click();
	}
		    @BeforeTest
		    public void beforetestclass() {
			    	System.setProperty("webdriver.chromedriver","\"C:\\Users\\Abhimanyu\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
				    WebDriver driver = new ChromeDriver();
				    driver.get("https://testmatick.com/");
					driver.findElement(By.cssSelector("#s")).sendKeys("manual testing");
					driver.findElement(By.xpath("//*[@id=\"subheader\"]/div/div[2]/div/form/button")).click();	
		    }
		    @AfterTest
		    public void aftertestclass() {
		    	System.setProperty("webdriver.chromedriver","\"C:\\Users\\Abhimanyu\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://testmatick.com/");
			    Actions actions = new Actions(driver);
			    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-26351\"]/a"))).perform(); 
			    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-28291\"]/a"))).perform(); 
				driver.findElement(By.xpath("//*[@id=\"menu-item-28291\"]/a")).click();

			  		    }
		 
	}




