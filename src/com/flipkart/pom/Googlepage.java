package com.flipkart.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Googlepage
{
	@FindBy(xpath="//textarea[@class='gLFyf']")
	private WebElement enter;
	public Googlepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterName()
	{
		enter.sendKeys("amazon");
	}
	@FindBy(xpath="//span[.='Amazon']")
	private WebElement search;
	public void searching()
	{
		search.click();
	}
	@FindBy(xpath="//span[contains(text(),'Shop online at Amazon ')]")
	private WebElement url;
	public void clicking()
	{
		url.click();
	}
}
