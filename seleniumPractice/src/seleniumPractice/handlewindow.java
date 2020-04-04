package seleniumPractice;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
	String oldwindowis=	driver.getWindowHandle();
	
		WebElement firstbutton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));

		firstbutton.click();
		
		Set<String> newwindow=driver.getWindowHandles();
		System.out.println(newwindow.size());
		
		Iterator<String> second=newwindow.iterator();
		//driver.switchTo().window(second);
		
		driver.findElement(By.id("home")).click();
	}
}

		/*for (String newwindow1: newwindow) {
			
		
		driver.switchTo().window(newwindow1);
	}

		driver.findElement(By.id("home")).click();
}}*/
