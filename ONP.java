import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class ONP
{
	public static void main (String[] args) throws IOException
	{
		int cases;
		Scanner sc = new Scanner(System.in);
		cases  = sc.nextInt();
		char inputExpression[];
		while(cases-- >0){
			inputExpression = sc.next().toCharArray();
			System.out.println(convertPolishNotaion(inputExpression));
		}
	}
	
	private static String convertPolishNotaion(char inputExpression[] ){
		Stack<Character> operator = new Stack<Character>();
		Queue<Character> expression = new LinkedList<Character>();
		int i ;
		for(i=0; i<inputExpression.length;i++){
			if(Character.isLetter(inputExpression[i]))
				expression.offer(inputExpression[i]	);
			else if(operatorPrecedence(inputExpression[i])>0){
				while(operator.size()>0 && (operatorPrecedence(inputExpression[i]) > 0) && (operatorPrecedence(operator.peek()) > operatorPrecedence(operator.peek())) )
					expression.offer(operator.pop());
				operator.push(inputExpression[i]);
			}
			else if(inputExpression[i]=='('){
				operator.push(inputExpression[i]);
			}
			else if(inputExpression[i]==')'){
				while(operator.size() > 0){
					if(operator.peek()=='('){
						operator.pop();
						break;
					}
					expression.offer(operator.peek());
					operator.pop();
				}
			}
				
		}
		while(operator.size()>0)
            expression.add(operator.pop());
        String res = "";
        while(expression.size()>0)
            res += expression.poll();
        return res;
	}
	
	private static int operatorPrecedence(char ch){
		switch (ch){
			case '+' : return 1;
            case '-' : return 2;
            case '*' : return 3;
            case '/' : return 4;
            case '^' : return 5;
			default  : return -1;   	
		}
	}
}
