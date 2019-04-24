import java.util.*;
class ArthematicOperations
{
	public static void main(String[] args) 
	{
		int num1=0,num2=0;
		char operator;
		int answer=0;
		double c=0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the First number ");
		num1=input.nextInt();
		System.out.println("Enter the Second Number");
		num2=input.nextInt();
		System.out.println(" Select Arthematic  operator \n'+'\n'-'\n'*'\n'/' ");
		operator=input.next().charAt(0);
		switch(operator){
			case '+': answer=num1+num2;
			break;
			
			case '-': answer=num1-num2;
			break;
			
			case '*': answer=num1*num2;
			break;
			
			case '/':
			
			  c=num1/num2;
			
			
			break;
			
			default :
			 System.out.println("You have select Wrong Operator");
		}
		if(operator!='/')
		{
			System.out.println("Answer : "+answer);}
	else 
	{
		System.out.println("Answer : "+c);}
		
		
	}
}