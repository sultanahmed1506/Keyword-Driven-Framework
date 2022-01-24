package keyworddrivenfwk.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import keyworddrivenfwk.utils.ActionClass;
public class TestScript extends TestBase  {
	
	
	@Test
	public void validateLogin() throws Exception
	{
		/*
		 * param1 : driver
		 * param2 : xlsx filename
		 * param3 : sheet name
		 */
		ActionClass actionClass = new ActionClass();
		boolean result = actionClass.run(driver,"inputData.xlsx","E2E_001");
		Assert.assertTrue(result);

	}
	
	
}