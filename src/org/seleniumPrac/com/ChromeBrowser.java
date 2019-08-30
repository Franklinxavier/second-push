package org.seleniumPrac.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeBrowser {

	public static void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\DragDrop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement bank = driver.findElement(By.id("credit2"));
		WebElement dropElem1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		WebElement amount1 = driver.findElement(By.xpath("(//li[@id=\"fourth\"])[1]"));
		WebElement dropElem2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		WebElement loan = driver.findElement(By.xpath("//li[@id=\"credit4\"]"));
		WebElement dropElem3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
		Actions ma = new Actions(driver);
		ma.dragAndDrop(bank, dropElem1).build().perform();
		ma.dragAndDrop(amount1, dropElem2).build().perform();
		ma.dragAndDrop(loan, dropElem3).build().perform();
		//Thread.sleep(5000);
		//driver.quit();
		
		
		
		
		}
	public static void main(String[] args) throws InterruptedException {
		openBrowser();
	}
}
