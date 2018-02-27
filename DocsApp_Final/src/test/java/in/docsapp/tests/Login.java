package in.docsapp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.docsapp.pages.SiginPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Login {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeDriverManager.getInstance().setup();
		 driver=new ChromeDriver();
		driver.get("https://b2btest.docsapp.in/webviews/telemerdashboardreact/?#!login");
SiginPage sp=new SiginPage(driver);
Thread.sleep(1000);
sp.getEleSigninUsername().sendKeys("ops@docsapp.in");
Thread.sleep(1000);
sp.getEleSigninPassword().sendKeys("1@3$5^");
Thread.sleep(1000);
sp.getEleSignin().click();
	}

}
