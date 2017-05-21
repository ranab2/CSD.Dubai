package Test.Java;

import org.junit.Assert;
import org.junit.Test;

//import Main.RPNCalc;
import Main.RPNCalculator;

public class TestRPN1 {
	
	@Test
	public void TestCase1(){
		String expresion = "2,2,+";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(4, obj.Calculate(expresion));
	}
	
	@Test
	public void TestCase2(){
		String expresion1 = "3,2,+";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(5, obj.Calculate(expresion1));
	}
	
	@Test
	public void TestCase3(){
		String expresion2 = "3,2,*";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(6, obj.Calculate(expresion2));
	}
	
	@Test
	public void TestCase4(){
		String expresion3 = "2,2,/";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(1, obj.Calculate(expresion3));
	}
	
	@Test
	public void TestCase5(){
		String expresion4 = "3,2,-";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(1, obj.Calculate(expresion4));
	}

	@Test
	public void TestCase6(){
		String expresion4 = "50,100,%";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(50, obj.Calculate(expresion4));
	}
	
	@Test
	public void TestCase7(){
		String expresion4 = "3,!";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(6, obj.Calculate(expresion4));
	}
	
	@Test
	public void TestCase8(){
		String expresion4 = "10,!";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(3628800, obj.Calculate(expresion4));
	}
	
	@Test
	public void TestCase9(){
		String expresion4 = "4,!";
		RPNCalculator obj = new RPNCalculator();
		Assert.assertEquals(24, obj.Calculate(expresion4));
	}
}
