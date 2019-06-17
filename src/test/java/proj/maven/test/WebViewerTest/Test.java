package proj.maven.test.WebViewerTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
public static void main(String[] args) {
		
		//System.out.println(System.getProperty("user.dir")+"\\resourses\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\resourses\\chromedriver.exe");
		System.out.println("test");
		System.out.println("test1");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.google.com");
		String currUrl=driver.getCurrentUrl();
		System.out.println("current url is-"+currUrl);
				
	driver.close();
		
		//*[@id="fakebox-input"]

}

}