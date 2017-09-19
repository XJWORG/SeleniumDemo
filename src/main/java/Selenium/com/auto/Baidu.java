package Selenium.com.auto;

import org.junit.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Baidu {
	
	@Test
	public  void Test() {
		
		//chrome config
		String chromeKey = "webdriver.chrome.driver";
		String chromeValue = "/chromedriver.exe";
		
		//firefox config
		String firefoxKey = "webdriver.firefox.bin";
		String firefoxValue = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
		

		System.out.println("-------------1------------Hello");
		//设置浏览器路径
		System.setProperty(chromeKey,chromeValue );

		System.out.println("-------------2------------Hello");
		FirefoxProfile profile = new FirefoxProfile();
		// 设置浏览器开始页地址为空
		profile.setPreference("browser.startup.homepage", "about:blank");
		profile.setPreference("startup.homepage_welcome_url", "about:blank");
		profile.setPreference("startup.homepage_welcome_url.additional", "about:blank");
		profile.setPreference("browser.usedOnWindows10.introURL", "about:blank");
		System.out.println("-------------------------Hello");
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.navigate().to("http://www.baidu.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("kw")).sendKeys("自动化测试");
		driver.findElement(By.id("su")).click();
		
		driver.close();
	}
}