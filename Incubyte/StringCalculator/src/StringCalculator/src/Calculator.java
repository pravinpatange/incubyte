import com.sun.tools.javac.parser.Scanner;

public class Calculator {

	public int calculate(String string) throws Exception {
		
		String numbers[] = string.split(",|\n");
		if(string.isEmpty())
		{
			return 0;
		}
		if(string.length()==1)
		{
			return Integer.parseInt(string);
		}
		else
		{
			return add(numbers);
		}
	}
	
	private int add(String numbers[]) throws Exception
	{
		for (int i = 0; i < numbers.length; i++) {
			if(Integer.parseInt(numbers[i])<0)
			{
				throw new Exception("Negative Not allowed");
			}
		}
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			if(!isGreater(numbers[i]))
			sum =sum+ Integer.parseInt(numbers[i]);
		}
		return sum;
	}

	private boolean isGreater(String number)
	{
		if(Integer.parseInt(number)>=1000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private class even_odd{
		java.util.Scanner sc =new java.util.Scanner(System.in);
		String str= sc.nextLine();
		int sum_even=0;
		int sum_odd=0;
		if(str.ChaarAt(0)=='E') {
			String arr[]=str.split(",|E|O");
			for(int i=0;i<arr.length;i++) {
				if(Integer.parseInt(arr[i])%2==0))
			}
		}
		
	}
}
