import java.util.*;
class Marksheet{
	public static void main(String[] args)
	{
		int totalmarks=300;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Marks of Operating System");
		int marks1=sc.nextInt();
		System.out.println("Marks of C++");
		int marks2=sc.nextInt();
		System.out.println("Marks of Data Structure");
		int marks3=sc.nextInt();
		int obtainmarks=marks1+marks2+marks3;
		System.out.println("Total Marks : "+totalmarks);
		System.out.println("Marks in Operating System : "+marks1);
		System.out.println("Marks in C++: "+marks2);
		System.out.println("Marks in Data Structure : "+marks3);
		System.out.println("Obtain Marks out of 300 : "+obtainmarks);
		
		float percentage=((obtainmarks*100f)/totalmarks);
		System.out.println("Percentage : "+ percentage);
		if(percentage>=90){System.out.println("Grade A");}
		  if(percentage<90 && percentage>80){System.out.println("Grade B");}
		  if(percentage<80 && percentage>70){System.out.println("Grade C");}
		if (percentage<70 && percentage>60){System.out.println("Grade D");}
		if(percentage<60){System.out.println("Fail");}
		
			
	}
}