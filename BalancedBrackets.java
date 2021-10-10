package lab3;
import java.util.*;

public class BalancedBrackets {

	static boolean balanced(String s)
	{
		Deque<Character>stack = new ArrayDeque<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char x = s.charAt(i);
			
			if(x == '(' || x=='[' || x == '{') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			
			switch(x) {
			case')':
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
				
			case '}':
				check = stack.pop();
				if(check == '(' || check == ']')
					return false;
				break;
				
			case ']' :
				check = stack.pop();
				if(check == '(' || check == '{')
					return false;
				break;
			}
			
		}
		return (stack.isEmpty());
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(balanced(s))
		{
			System.out.println("The entered string has balanced brackets");
		}
		else
		{
			System.out.println("The entered string do not contain balanced brackets");
		}

	}

}
