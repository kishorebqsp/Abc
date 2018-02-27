package in.docsapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.docsapp.pages.AddNewCase;
import in.docsapp.pages.SiginPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class AssignCase {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriverManager.getInstance().setup();
	 driver=new ChromeDriver();
	driver.get("https://b2btest.docsapp.in/webviews/telemerdashboardreact/?#!cases");
	AddNewCase a=new AddNewCase(driver);
Thread.sleep(1000);
a.getEleAddNewCaseAddButton().click();
}
}
