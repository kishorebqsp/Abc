package in.docsapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorsDashboard {
	public WebDriver driver;
	public DoctorsDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindAll
	({
		@FindBy(id="add_appId"),
		@FindBy(xpath="//*[@placeholder='Application ID']")
	})
	private WebElement eleDoctorsDashboardDiagnosisButton;
	
	public WebElement getEleDoctorsDashboardDiagnosisButton()
	{
		return eleDoctorsDashboardDiagnosisButton;
	}

}
