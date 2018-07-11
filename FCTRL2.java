import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class FCTRL2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int cases;
		Scanner sc = new Scanner(System.in);
		cases = sc.nextInt();
		while(cases-- > 0){
			int input = sc.nextInt();
			//long result = factorial(input);
			System.out.println(factorial(input));
		}
	}
	
	public static BigInteger factorial(int number){
		BigInteger result = new BigInteger("1");
		for(int i = 1;i<=number;i++){
			result =result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
