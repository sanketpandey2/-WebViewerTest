package proj.maven.test.WebViewerTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir")+"\\resourses\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\resourses\\chromedriver.exe");
		System.out.println("test");
		System.out.println("test1");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://10.167.177.152:55051/VMS.AWV.Portal/");
		driver.findElement(By.xpath("//*[@id='inputusername']")).sendKeys("JL/Administtator");
		driver.findElement(By.xpath("//*[@id='inputpassword']")).sendKeys("\\/aR1an@1");
		driver.findElement(By.xpath("//*[@id='btnlogin']")).click();
		
		//driver.close();
		
	}
	
}
