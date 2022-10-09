package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_getAllOptionsFromListbox2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
 		WebDriver driver=new ChromeDriver(); 
 		
 		driver.get("https://www.facebook.com/");	
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();		
		
		Thread.sleep(3000);
				
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		Select s=new Select(month);
		List<WebElement> options = s.getOptions();
		for(WebElement s1:options)
		{
			System.out.println(s1.getText());
		}
		
		 System.out.println("-----------------------------");
		 System.out.println("the size of list box is ");
		 int size = s.getOptions().size();
		 System.out.println(size);
		 
		 Thread.sleep(2000);
		 driver.close();
		 
		
		
	}

}
