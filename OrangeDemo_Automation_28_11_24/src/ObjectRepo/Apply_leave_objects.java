package ObjectRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Apply_leave_objects {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("admin123");
	
	WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	loginbtn.click();
	
	WebElement applyleavebtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button"));
	applyleavebtn.click();
	
	WebElement leaveTypeDropdown = driver.findElement(By.xpath("//*[contains(@class,'select-text--active')]"));
	Select leaveType = new Select(leaveTypeDropdown); 
	leaveType.selectByVisibleText("Annual Leave");
	leaveTypeDropdown.click();
	
	WebElement fromdate = driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
	fromdate.clear();
	fromdate.sendKeys("2024-30-11");
	

		
	}

}
