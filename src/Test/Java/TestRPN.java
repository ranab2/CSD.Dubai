package Test.Java;

import org.junit.Assert;
import org.junit.Test;

import Main.RPNCalc;

public class TestRPN {
	
	@Test
	public void TestCase1(){
		String expr = "1,1,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(0, obj.Calculate(expr));
	}
	@Test
	public void TestCase2(){
		String expr = "2,2,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(0, obj.Calculate(expr));
	}
	@Test
	public void TestCase3(){
		String expr = "3,2,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(0, obj.Calculate(expr));
	}

}
