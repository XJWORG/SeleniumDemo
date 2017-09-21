package Selenium.com.auto;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Baidu {
	
	@Test
	public  void Test() {
		

		WebDriver driver =null;
//		Tools.initIE(driver);
		Tools.initChrome(driver);
		System.out.println("-------------2------------Hello");
		
		driver.navigate().to("http://www.baidu.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("kw")).sendKeys("自动化测试");
		driver.findElement(By.id("su")).click();
		
		driver.close();
	}
}