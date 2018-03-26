import java.util.*;
import java.lang.*;
import java.io.*;
class TEST
{
	public static void main (String[] args) throws IOException
	{
		DataInputStream obj = new DataInputStream(System.in);
		int num = Integer.parseInt(obj.readLine());
		while(num != 42){
			System.out.println(num);
			num = Integer.parseInt(obj.readLine());
		}
		
		 System.exit(0);
	}
}
