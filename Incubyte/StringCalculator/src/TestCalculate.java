import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {

	private Calculator calculator;
	
	@BeforeTest
	public void init()
	{
		calculator = new Calculator();
	}
	
	
	public void EmptyStringReturnZero() throws Exception
	{
		assertEquals(calculator.calculate(""), 0);
	}
	
	public void SingleValue() throws Exception
	{
		assertEquals(calculator.calculate("1"), 1);
	}
	
	public void twoNumberCommaDelimiter() throws Exception
	{
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	public void NewlineDelimiter() throws Exception
	{
		assertEquals(calculator.calculate("1\n2"), 3);
	}
	
	public void ThreeNum() throws Exception
	{
		assertEquals(calculator.calculate("1,2,3"), 6);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void negativeInputException() throws Exception
	{
		calculator.calculate("-1");
	}
	
	public void Greaterthan1000() throws Exception
	{
		assertEquals(calculator.calculate("10,10,1000"), 20);
	}
}
