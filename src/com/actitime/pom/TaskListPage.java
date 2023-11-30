package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;

	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerListBox;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerButton;

	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement addNewProjectButton;

	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectName;

	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomerToAddProjectListBox;

	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;

	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectButton;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement createdUserName;
	public TaskListPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void setAddNewBtn() 
	{
		addNewBtn.click();
	}

	public void clickNewCustomer()
	{
		newCustomer.click();
	}
	public void setCustomerName(String customerName)
	{
		enterCustomerName.sendKeys(customerName);
	}
	public void setCustomerDescription(String description)
	{
		customerDescription.sendKeys(description);
	}
	public void clickSelectCustomer()
	{
		selectCustomerListBox.click();
	}
	public void clickCreateCustomer()
	{
		createCustomerButton.click();
	}
	public void clickAddNewProjectButton()
	{
		addNewProjectButton.click();
	}
	public void setProjectName(String name)
	{
		enterProjectName.sendKeys(name);
	}
	public void clickSelectCustomerToAddProject()
	{
		selectCustomerToAddProjectListBox.click();
	}
	public void clickbigBangCompany()
	{
		bigBangCompany.click();
	}
	public void setProjectDescription(String description)
	{
		projectDescription.sendKeys(description);
	}
	public void clickCreateProject()
	{
		createProjectButton.click();
	}
	public WebElement createdCustomeName()
	{
		return createdUserName;
	}
}
