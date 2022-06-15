package Jmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jmeter {
	
 	 
	@Test
	public  void user1() throws InterruptedException, ParseException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://agl78:9090/QuaLISWeb/#/login");
		
		driver.findElement(By.xpath("//*[@id='sloginid']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='spassword']")).sendKeys("123");
		
		System.out.print("Enter");
		
		for (int i=1; i>0; i++)
		{
			Scanner booleanValue=new Scanner(System.in);
			
			boolean value=booleanValue.nextBoolean();
		 	if (value==true)
			{
				System.out.println("It is true");
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/form/button")).click();
			}
			else
			{
				System.out.println("It is false");
			}
		}
		
		
		
		
	}
	 
 
	
	public static String time() throws ParseException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH.mm.ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		String time=dtf.format(now);
		
		
         
		return time;
	}
	
	public static void main(String[] args)throws ParseException {
		time();
	}

}
