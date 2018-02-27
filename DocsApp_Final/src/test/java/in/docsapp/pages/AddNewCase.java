package in.docsapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCase {
	public WebDriver driver;
	public AddNewCase(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindAll
	({
		@FindBy(id="add_appId"),
		@FindBy(xpath="//*[@placeholder='Application ID']")
	})
	private WebElement eleAddNewCaseApplicationIDTextBox1;
	
	public WebElement getEleAddNewCaseApplicationIDTextBox()
	{
		return eleAddNewCaseApplicationIDTextBox1;
	}
	@FindAll
	({
		@FindBy(id="add_name"),
		@FindBy(xpath="//*[@placeholder='Name']")
	})
	private WebElement eleAddNewCaseNameTextBox;
	
	public WebElement getEleAddNewCaseNameTextBox()
	{
		return eleAddNewCaseNameTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_phone"),
		@FindBy(xpath="//*[@placeholder='Primary Contact Number']")
	})
	private WebElement eleAddNewCasePhoneNumberTextBox;
	
	public WebElement getAddNewCasePhoneNumberTextBox()
	{
		//return eleAddNewCasePhoneNumberTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_altphone"),
		@FindBy(xpath="//*[@placeholder='Secondary Contact Number']")
	})
	private WebElement eleAddNewCaseAltPhoneNumberTextBox;
	
	public WebElement getAddNewCaseAltPhoneNumberTextBox()
	{
		return eleAddNewCaseAltPhoneNumberTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_dobdd"),
		@FindBy(xpath="//input[@placeholder='DD']")
	})
	private WebElement eleAddNewCaseDateTextBox;
	
	public WebElement getAddNewCaseDateTextBox()
	{
		return eleAddNewCaseDateTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_dobmm"),
		@FindBy(xpath="//input[@placeholder='MM']")
	})
	private WebElement eleAddNewCaseMonthTextBox;
	
	public WebElement getAddNewCaseMonthTextBox()
	{
		return eleAddNewCaseMonthTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_dobyy"),
		@FindBy(xpath="//input[@placeholder='YYYY']")
	})
	private WebElement eleAddNewCaseYearTextBox;
	
	public WebElement getAddNewCaseYearTextBox()
	{
		return eleAddNewCaseYearTextBox;
	}
		@FindBy(id="add_gender")
		private WebElement eleAddNewCaseGenderTextBox;
		public WebElement getAddNewCaseGenderTextBox()
	{
		return eleAddNewCaseGenderTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_address"),
		@FindBy(xpath="//input[@placeholder='Full Address']")
	})
	private WebElement eleAddNewCaseAddressTextBox;
	
	public WebElement getAddNewCaseAddressTextBox()
	{
		return eleAddNewCaseAddressTextBox;
	}
	
	@FindBy(id="add_vendor")
	private WebElement eleAddNewCaseVendorTextBox;
	
	public WebElement getAddNewCaseVendorTextBox()
	{
		return eleAddNewCaseVendorTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_pan"),
		@FindBy(xpath="//input[@placeholder='Enter PAN']")
	})
	private WebElement eleAddNewCasePANTextBox;
	
	public WebElement getAddNewCasePANTextBox()
	{
		return eleAddNewCasePANTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_plan"),
		@FindBy(xpath="//input[@placeholder='Plan Details']")
	})
	private WebElement eleAddNewCasePlanDetailsTextBox;
	
	public WebElement getAddNewCasePlanDetailTsextBox()
	{
		return eleAddNewCasePlanDetailsTextBox;
	}
	@FindAll
	({
		@FindBy(id="add_nomineeName"),
		@FindBy(xpath="//input[@placeholder='Name of Nominee']")
	})
	private WebElement eleAddNewCaseNomineeTextBox;
	
	public WebElement getAddNewCaseNomineeTextBox()
	{
		return eleAddNewCaseNomineeTextBox;
	}
	
	@FindAll
	({
		@FindBy(id="add_nomineedob"),
		@FindBy(xpath="//input[@placeholder='YYYY-MM-DD']")
	})
	private WebElement eleAddNewCaseNomineesDateofBirthTextBox;
	
	public WebElement getAddNewCaseNomineesDateofBirthTextBox()
	{
		return eleAddNewCaseNomineesDateofBirthTextBox;
	}
	@FindAll
	({
		@FindBy(id="submit_btn"),
		@FindBy(xpath="//btn[.='Submit']")
	})
	private WebElement eleAddNewCaseSubmitButton;
	
	public WebElement getAddNewCaseSubmitButton()
	{
		return eleAddNewCaseSubmitButton;
	}
	@FindAll
	({
		@FindBy(id="submit_add_btn"),
		@FindBy(xpath="//btn[text()='Submit & Add Another']")
	})
	private WebElement eleAddNewCaseNomineeDateofBirthButton;
	
	public WebElement getAddNewCaseNomineeDateofBirthButton()
	{
		return eleAddNewCaseNomineeDateofBirthButton;
	}
	


	
	
	
}
