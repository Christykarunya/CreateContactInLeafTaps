package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactInLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
    Thread.sleep(2000);
    
    //driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    Thread.sleep(2000);
    
    //driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.id("firstNameField")).sendKeys("Christy");
    driver.findElement(By.id("lastNameField")).sendKeys("Stanley");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Chris");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Stan");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Computer Science");
    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I am a software tester");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@name='primaryEmail' and @id='createContactForm_primaryEmail']")).sendKeys("christykarunya90@gmail.com");
    Thread.sleep(1000);
    
    WebElement eleState = driver.findElement(By.name("generalStateProvinceGeoId"));
    Select dd=new Select(eleState);
    dd.selectByVisibleText("New York");
    Thread.sleep(2000);
    
    driver.findElement(By.className("smallSubmit")).click();
    Thread.sleep(4000);
    
    //Click on Edit button
    //driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@name='description']")).clear();
    Thread.sleep(2000);
    driver.findElement(By.name("importantNote")).sendKeys("I am a software Tester");
    Thread.sleep(4000);
    
    //Click on Update button
    driver.findElement(By.xpath("//input[@value='Update']")).click();
    Thread.sleep(4000);
    
    String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']")).getText();
    System.out.println(text);
    
    
    
    
	
	

	}

}
