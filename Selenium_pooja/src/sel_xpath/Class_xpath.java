package sel_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Class_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
        //driver.findElement(By.linkText("Forgotten account?")).click();
        //driver.findElement(By.partialLinkText("Forgotten")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("638238362");
    	Select day = new Select (driver.findElement(By.id("day")));
    	day.selectByValue("2");
    	Select month = new Select(driver.findElement(By.id("month")));
    	month.selectByVisibleText("May");
    	Select year = new Select (driver.findElement(By.id("year")));
    	year.selectByIndex(4);
    	driver.quit();
	}

}
