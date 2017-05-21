package Main;

import java.util.Stack;

import com.sun.jna.platform.win32.WinDef.CHAR;

public class RPNCalculator {

	public Object Calculate(String expr) {
		Stack operand = new Stack();
		Stack operator = new Stack();
		String[] expression = expr.split(",");
		for(int index=0;index<expression.length;index++)
		{
			if(expression[index].equals("+")||expression[index].equals("-")||expression[index].equals("/")||expression[index].equals("*")||expression[index].equals("%")||expression[index].equals("!"))
			{
				operator.push(expression[index]);
			}
			else
			{
				operand.push(expression[index]);
			}
		}
		for(int i=1;i<=operator.size();i++)
		{
			String operator1;
			operator1 = (String)operator.pop();
			if(operator1.equals("+"))
			{
				return addition(operand.pop().toString(),operand.pop().toString());
			}
			else if(operator1.equals("-"))
			{
				return subtraction(operand.pop().toString(),operand.pop().toString());
			}
			else if(operator1.equals("/"))
			{
				return division(operand.pop().toString(),operand.pop().toString());
			}
			else if(operator1.equals("*"))
			{
				return multiplication(operand.pop().toString(),operand.pop().toString());
			}
			else if(operator1.equals("%"))
			{
				return percentage(operand.pop().toString(),operand.pop().toString());
			}
			else if(operator1.equals("!"))
			{
				return percentage(operand.pop().toString());
			}
		}
		return -1;//operator.pop();
	}
	public int addition(String num1, String num2){
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
	public int subtraction(String num1, String num2){
		return Integer.parseInt(num2)-Integer.parseInt(num1);
	}
	public int multiplication(String num1, String num2){
		return Integer.parseInt(num1)*Integer.parseInt(num2);
	}
	public int division(String num1, String num2){
		return Integer.parseInt(num2)/Integer.parseInt(num1);
	}
	public int percentage(String num1, String num2){
		return (Integer.parseInt(num2)*100)/Integer.parseInt(num1);
	}
	public int percentage(String num1){
		int factorial=1;
		for(int i=Integer.parseInt(num1);i>0;i--)
		{
			factorial*=i;
		}
		return factorial;
	}

}
