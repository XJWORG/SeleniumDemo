package Selenium.com.auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tools {
	/*
	 * 初始化IE浏览器
	 */
	public static WebDriver initIE(WebDriver dr) {
		String key = "webdriver.ie.driver";
		String value = "./tool/ie.exe";
		System.setProperty(key, value);
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		dr = new InternetExplorerDriver(ieCapabilities);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return dr;
	}

	/*
	 * 初始化谷歌浏览器
	 */
	public static WebDriver initChrome(WebDriver dr) {
		String key = "webdriver.chrome.driver";
		String value = "./tool/chromedriver.exe";
		System.setProperty(key, value);
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return dr;
	}

	/*
	 * 初始化火狐浏览器
	 */
	public static WebDriver initFireFox(WebDriver dr) {
		String key = "webdriver.firefox.bin";
		String value = "C:/Program Files (x86)/Mozilla Firefox/firefox.exe";
		System.setProperty(key, value);
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return dr;
	}
}
