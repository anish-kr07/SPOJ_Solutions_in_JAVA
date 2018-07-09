/**
* Sieve of Eratosthenes - is another good practice to find prime numbers.
* link : https://www.geeksforgeeks.org/sieve-of-eratosthenes/
*/

import java.util.*;
import java.lang.*;

class PRIME1{
	
	public static void main (String[] args) throws java.lang.Exception{
		
		int cases;
		Scanner sc=new Scanner(System.in);
		cases=sc.nextInt();
		try{
			while(cases-->0){
				
				int start=sc.nextInt();
				int end=sc.nextInt();
				primeNumberGenerator(start,end);
				System.out.println();
			}
		}
		catch(Exception e){
			return;
		}
	}
	public static void primeNumberGenerator(int start , int end){
		if(start == 1){
			start +=1;
		}
		for(int i=start;i<=end;i++){
			boolean flag = false;
			for(int line = 2;line <= (int)Math.sqrt(i);line++){
				if(i % line ==0){
					flag = true;
					break;
				}
			}
			if(flag == false)
				System.out.println(i);
		}
	}

}
