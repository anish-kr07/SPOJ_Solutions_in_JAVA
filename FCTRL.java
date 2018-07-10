import java.util.*;
import java.lang.*;

class FCTRL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int cases;
		Scanner sc = new Scanner(System.in);
		cases = sc.nextInt();
		while(cases-- >0){
			int inputNumber = sc.nextInt();
			int result = zerosInFactorial(inputNumber);
			System.out.println(result);
		}
	}
	public static int zerosInFactorial (int input){
		int count = 0;
		for(int i = 5; input/i>=1;i*=5){
			 count += input/i ;
		}
		return count;
	}
}
