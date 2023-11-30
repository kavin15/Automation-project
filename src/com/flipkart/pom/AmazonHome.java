package com.flipkart.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonHome 
{
	@FindBy(xpath="//div[@class='nav-fill']//input[1]")
	private WebElement entering;
	public AmazonHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void searchBox(String s)
	{
		entering.sendKeys(s);
	}
	@FindBy(xpath="//div[contains(text(),' ceiling fan')]")
	private WebElement auto;
	public void clickAuto()
	{
		auto.click();
	}
	@FindBy(name="proceedToRetailCheckout")
	private WebElement pb;
	public void proceedButton()
	{
		pb.click();
	}
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement usname;
	public void userNAme(String s)
	{
		usname.sendKeys(s);
	}
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement pd;
	public void password(String s)
	{
		pd.sendKeys(s);
	}
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[1]")
	private WebElement fs;
	public void firstName(String s)
	{
		fs.sendKeys(s);
	}
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[2]")
	private WebElement mb;
	public void mobile(String s)
	{
		mb.sendKeys(s);
	}
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[3]")
	private WebElement pin;
	public void pincode(String s)
	{
		pin.clear();
		pin.sendKeys(s);
	}
	@FindBy(xpath="//span[.='Use this address']")
	private WebElement ad;
	public void sunmitAddress()
	{
		ad.click();
	}
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[6]")
	private WebElement ld;
	public void landMark(String s)
	{
		ld.sendKeys(s);
	}
}
