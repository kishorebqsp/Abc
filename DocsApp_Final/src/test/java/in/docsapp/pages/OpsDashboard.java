package in.docsapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpsDashboard {
	public WebDriver driver;
	public OpsDashboard (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@value='+ Add']")
	private WebElement eleOpsDashboardAddButton;
	
	public WebElement getOpsDashboardAddButton()
	{
		return eleOpsDashboardAddButton;
	}
	@FindBy(xpath="//input[@value='Assign ']")
	private WebElement eleOpsDashboardAssignButton;
	
	public WebElement getOpsDashboardAssignButton()
	{
		return eleOpsDashboardAssignButton;
	}


}
