import java.util.Scanner;


public class Test 
{
	public static void main(String[] args)
	{
		float answer=0;
		String currOperation="";
		Stack ops = new Stack();
		StatementProcessor process = new StatementProcessor();
		String in;
		Scanner input = new Scanner(System.in);
		System.out.println("Input yo string dawg");
		in=input.nextLine();
		
		for(int i=0;i<in.length();i++)
		{
			char c =in.charAt(i);
			switch(c)
			{
				case')':
					
					while((char)ops.peek()!='(')
						currOperation+=ops.pop();
				
					currOperation=reverse(currOperation);
					System.out.println(currOperation);
					answer+=process.processStatement(currOperation);
					
				break;
				
				case '(':
				case '+':
				case '-':
				case '*':
				default:
					ops.push(in.charAt(i));
				break;
			}		
			
			
		}
	}
	
public static String reverse(String s) {
    return new StringBuffer(s).reverse().toString();
}

}
