import java.util.*;
class Bill{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter NO OF UNITS");
		int units=sc.nextInt();
		int total=0;
		if(units<=50)
		{
			 total=units*10;
		}
		else if(units>50 && units<=100)
		{
			 total=50*10+(units-50)*15;
		}
		else if(units>100 && units<=200)
		{
			 total=50*10+50*15+(units-100)*20;
		}
		else if(units>200 && units<=300)
		{
			 total=50*10+50*15+100*20+(units-200)*25;
		}
		else
		{
			 total=50*10+50*15+100*20+100*25+(units-300)*30;
		}
		

		System.out.println(" Total bill " +total);
	}
}