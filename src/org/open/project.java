package org.open;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class project {

	public static void main(String[] args) throws AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseprogram\\Opencart\\driver\\chromedriver.exe");
		ChromeOptions os= new ChromeOptions();
		os.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(os);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("boat airpods");
		searchbox.submit();
		WebElement abc = driver.findElement(By.xpath("//span[text()='Immerse yourself in superior sound'][1]"));
		abc.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		WebElement boat = driver.findElement(By.xpath("//a[@data-click-type='OTHER'][1]"));
		boat.click();
		//WebElement adc = driver.findElement(By.xpath("//button[@data-click-type='ADDTOCART'][1]"));
		//adc.click();
		 WebElement adc=driver.findElement(By.name("submit.add-to-cart"));
		 adc.click();		
		

	}

}
