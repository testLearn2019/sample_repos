package Selpooja;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    	driver.findElement(By.id("btnLogin")).click();
    
    	
    	

	}

}
