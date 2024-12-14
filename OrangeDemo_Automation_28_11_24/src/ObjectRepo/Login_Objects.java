package ObjectRepo;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;



   public class Login_Objects {

		WebDriver driver;
		
		public Login_Objects(WebDriver driver) {
			
			this.driver = driver;
			
		}

	
	By username = By.xpath("//input[@name='username']");
			
	By password = By.xpath("//input[@name='password']");	
	
	By loginbtn = By.xpath("//button[@type='submit']");

	
	public void enterUsername(String UserName) {
		
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void enterPassword(String Password) {
	
	
		driver.findElement(password).sendKeys("admin123");
		
    }
	
	public void loginBtn() {
		
		
		driver.findElement(loginbtn).click();
	
	
	}
}
