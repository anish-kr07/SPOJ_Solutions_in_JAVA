import java.util.*;
class ADDREV
{
	public static void main(String args[])
	{
		int cases,c;
		Scanner sc=new Scanner(System.in);
		cases=sc.nextInt();
		try
		{
			while(cases-->0)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				int ra=reverse_number(a);
				int rb=reverse_number(b);
				int rc=ra+rb;
				c=reverse_number(rc);
				System.out.println(c);
			}
		}
		catch(Exception e)
			{
			return;
			}
	}
	public static int reverse_number(int m)
	{
		int temp = 0;
		while(m!=0)
		{
		temp=temp*10 + m%10;
		m=m/10;
		}
		return temp;
	}

}
