package TestCaseRepo;

   import java.time.Duration;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
   import ObjectRepo.Login_Objects;

    public class LoginTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		Login_Objects obj = new Login_Objects(driver);
		
		obj.enterUsername("Admin");
		obj.enterPassword("admin123");
		obj.loginBtn();
		
	}

}
