package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginForgotCreate {
     static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	      System.setProperty("webdriver.chrome.driver","C:\\Drivers\\ChromeDriver\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      driver.get("http://www.facebook.com");
	      WebElement id= driver.findElement(By.id("email"));
	      id.click();
		  WebElement pass =driver.findElement(By.name("pass"));
		  pass.click();
		  pass.sendKeys("162jkhljh78");
		  driver.findElement(By.name("login")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("Forgot password?")).click();
	      driver.findElement(By.linkText("Cancel")).click();      
	      driver.findElement(By.linkText("Create new account")).click();
	      WebElement firstName= driver.findElement(By.name("firstname"));
	      firstName.click();
	      firstName.sendKeys("imran");
	      WebElement lastName = driver.findElement(By.name("lastname"));
	      lastName.click();
	      lastName.sendKeys("jamil");
	      WebElement mobilNo = driver.findElement(By.name("reg_email__"));
	      mobilNo.click();
	      mobilNo.sendKeys("123345678");
	      WebElement password = driver.findElement(By.id("password_step_input"));
	      password.click();
	      password.sendKeys("jkjjnljklk");
	      WebElement month = driver.findElement(By.id("month"));
	      Select select = new Select(month);
	      select.selectByVisibleText("Dec");     
	      WebElement day = driver.findElement(By.id("day"));
	      Select selectday = new Select(day);
	      selectday.selectByVisibleText("15");
	      WebElement year = driver.findElement(By.id("year"));
	      Select selectyear = new Select(year);
	      selectyear.selectByVisibleText("1990");
	      Thread.sleep(5000);
	      WebElement male= driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	      male.click();
	      WebElement haveAcc=driver.findElement(By.linkText("Already have an account?"));
		  haveAcc.click();
		}
	}


