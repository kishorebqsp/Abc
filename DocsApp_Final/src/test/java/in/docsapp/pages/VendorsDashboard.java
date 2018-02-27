package in.docsapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsDashboard {
	public WebDriver driver;
	public VendorsDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@value='Upload']")
	private WebElement eleVendorsDashboardButton;
	
	public WebElement getEleVendorsDashboardButton()
	{
		return eleVendorsDashboardButton;
	}



}
