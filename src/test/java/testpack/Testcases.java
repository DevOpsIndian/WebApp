package testpack;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Testcases {
	
	@Test
	
	public void Testcase1()
	{
		
		int result=1+9;
		Assert.assertEquals(10, result);
	}

}
