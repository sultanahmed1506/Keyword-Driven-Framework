package keyworddrivenfwk.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import keyworddrivenfwk.utils.ActionClass;
import keyworddrivenfwk.utils.TestBase;
public class TestScript extends TestBase  {
	
	
	@Test
	public void invalidLoginTest() throws Exception
	{
		/*
		 * param1 : driver
		 * param2 : xlsx filename
		 * param3 : sheet name
		 */
		ActionClass actionClass = new ActionClass();
		boolean result = actionClass.run(driver,"inputData.xlsx","E2E_001");
		
		//System.out.println("Results >>>" +result);
		
		String status =actionClass.readResultsStatusFromExcel(driver, "inputData.xlsx","E2E_001",5,6);
		System.out.println("status : "+status);
		if (status.equalsIgnoreCase("pass")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
}