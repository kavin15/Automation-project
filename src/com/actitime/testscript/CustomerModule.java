package com.actitime.testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException 
	{
		Reporter.log("CreateCustomer",true);
		Thread.sleep(2000);
		HomePage h=new HomePage(d);
		h.setTaskTab();
		TaskListPage ts=new TaskListPage(d);
		ts.setAddNewBtn();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ts.clickNewCustomer();
		Thread.sleep(2000);
		FileLib f=new FileLib();
		String s1 = f.getExcelData("sheet1", 1, 3);
		String s2 = f.getExcelData("sheet1", 2, 3);
		ts.setCustomerName(s1);
		ts.setCustomerDescription(s2);
		ts.clickSelectCustomer();
		ts.clickbigBangCompany();
		ts.clickCreateCustomer();
		Thread.sleep(1000);
		String result = ts.createdCustomeName().getText();
		System.out.println(result+" expected");
		Assert.assertEquals(s1,result);
	}	
}