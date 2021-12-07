package AlertsHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@name='alert']"));
		alert1.click();
		System.out.println(driver.switchTo().alert().getText());
        Alert alert= driver.switchTo().alert();
        alert.accept();
		
    	WebElement confirmation = driver.findElement(By.xpath("//*[@name='confirmation']"));
		confirmation.click();
		System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//*[@name='prompt']"));
		prompt.click();
		driver.switchTo().alert().accept();

		
		
		
		
	}

}
