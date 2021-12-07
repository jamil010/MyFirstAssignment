package papaJohns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrderPizza {
    static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers//ChromeDriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.papajohns.com/");
        // driver.get("https://www.papajohns.com/?utm_source=google&utm_medium=cpc&utm_campaign=branded&gclid=CjwKCAiAwKyNBhBfEiwA"
        //		+ "_mrUMkii_ztquaSb8Kw7MmXlUzlfa-pUV1cZqnvBtkkSU6u-yP0EW6iHYBoCsOoQAvD_BwE&gclsrc=aw.ds");	    		 
         driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
         WebElement start =driver.findElement(By.xpath("//a[text()='Start Your Order']"));
         start.click();
         WebElement residence = driver.findElement(By.id("locations-addresstype"));
         Select select = new Select(residence);
         select.selectByVisibleText("Business");
         WebElement address= driver.findElement(By.xpath("//div[@id='autocomplete-container']"));
         Actions action = new Actions(driver);
         action.moveToElement(address).click().build().perform();
         action.sendKeys("2305 huntington av").build().perform();
         Thread.sleep(2000);
         action.sendKeys(Keys.ARROW_DOWN).build().perform();
         action.sendKeys(Keys.ENTER).build().perform();       
        Thread.sleep(2000);
         WebElement submit = driver.findElement(By.xpath("//*[@class='button button-large']"));
         submit.click();
         Thread.sleep(2000);
        WebElement specials= driver.findElement(By.xpath("//*[@class='nav-main-link ']")); 
         specials.click();
        WebElement baconOrder=  driver.findElement(By.xpath("//*[@class='button']"));
         baconOrder.click();
         WebElement addOrder =  driver.findElement(By.xpath("//*[@class='button button--small d-none d-md-inline-block button--white']"));
         addOrder.click();
         Thread.sleep(2000);
         WebElement addCart =driver.findElement(By.id("cart"));
         addCart.click();
        WebElement visa = driver.findElement(By.xpath("//*[@class='v-button vco-button-cart visa-button']"));
        visa.click();
		
		
	}

}
