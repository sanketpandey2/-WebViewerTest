package proj.maven.test.WebViewerTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AppTest{
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir")+"\\resourses\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dtf8207\\eclipse-workspace\\WebViewerTest\\resourses\\chromedriver.exe");
		System.out.println("test");
		System.out.println("test1");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.google.com");
		
	}
	
}
