
public class StatementProcessor {

	float result =0;
	public float processStatement(String in)
	{
		result = 0;
		
	    switch(in.charAt(0))
		{
			case '+':
				for(int i=0; i<in.length();i++){
					if(in.charAt(i)!=' ' && in.charAt(i)!='+')
					{
						
						Character temp = new Character(in.charAt(i));
						result+=Float.parseFloat(temp.toString());
					}
				}
			break;

			case '-':
				if(in.length()<2)
					break;
				for(int i=0; i<in.length();i++){
					if(in.charAt(i)!=' ' && in.charAt(i)!='-' && i==2)
					{
						Character temp = new Character(in.charAt(i));
						result=Float.parseFloat(temp.toString());
						
					}
					
					else if(in.charAt(i)!=' ' && in.charAt(i)!='-')
					{
						Character temp = new Character(in.charAt(i));
						result-=Float.parseFloat(temp.toString());
					}
				}
			break;
			
			case '*':
				result=1;
				for(int i=1; i<in.length();i++)
					if(in.charAt(i)!=' ' && in.charAt(i)!=')' && in.charAt(0)!='*')
					{
						Character temp = new Character(in.charAt(i));
						System.out.println(temp);
						result*=Float.parseFloat(temp.toString());
						System.out.println(result);
					}

			break;
			
			case '/':
				result = 1;
				for(int i=1; i<in.length();i++)
					if(in.charAt(i)!=' ' && in.charAt(i)!=')' && i==2)
					{
						Character temp = new Character(in.charAt(i));
						result=Float.parseFloat(temp.toString());
					}
					else if(in.charAt(i)!=' ' && in.charAt(i)!=')' || in.length()==2)
					{
						Character temp = new Character(in.charAt(i));
						result/=Float.parseFloat(temp.toString());
					}
				
						
			default:
				break;
		}
	    
		System.out.println(result);
		return result;
		
	}
}
