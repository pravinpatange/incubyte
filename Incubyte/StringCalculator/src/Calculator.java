
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
			sum += Integer.parseInt(numbers[i]);
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
}
