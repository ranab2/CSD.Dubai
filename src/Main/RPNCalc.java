package Main;

import java.awt.List;
import java.util.ArrayList;

import com.beust.jcommander.internal.Lists;

public class RPNCalc {

	public int Calculate(String expr) {
		// TODO Auto-generated method stub
		String[] SlitedExpr = expr.split(",");
		ArrayList operators = new ArrayList();
		ArrayList operands = new ArrayList();
		for (int i=0;i<SlitedExpr.length;i++)
		{
			if(SlitedExpr[i].equals("+") || SlitedExpr[i].equals("-") || SlitedExpr[i].equals("*") || SlitedExpr[i].equals("/"))
			{
				operators.add(SlitedExpr[i]);
			}
			else if(Integer.parseInt(SlitedExpr[i])>=0)
			{
				operands.add(Integer.parseInt(SlitedExpr[i]));
			}
		}
		if(operands.size()>operators.size()-1)
		{
			
		}
/*		else if(operands.size()==operators.size())
		{
			if(operators[0]=="%")
			{
				return Integer.parseInt(operands[0]);
			}
		}*/
		/*if(SlitedExpr[2].equals("+")){
			return Integer.parseInt(SlitedExpr[0])+Integer.parseInt(SlitedExpr[1]);
		}
		else if(SlitedExpr[2].equals("-"))
		{
			return Integer.parseInt(SlitedExpr[0])-Integer.parseInt(SlitedExpr[1]);
		}*/
		
		return 0;
	}
	
	

}
