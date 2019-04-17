class Biodata{
	public static void main(String[] args)
	{
		String n="MOHSIN iLLAHI";
		int marks1st=444;
		long marks2nd=450;
		int total1st=550;
		int totalmarks=1100; 
		float percentage1st=((marks1st*100)/550);
		float percentage2nd=((marks2nd*100)/550);
		char grade='A';
		double avgpercentage=(percentage1st+percentage2nd)/2;
		boolean pass=true;
		
		byte sems=1;
		
	System.out.print("Name of student : "+n					);
	System.out.println("Semester "+sems							);
	System.out.println("Marks Obtain in 1st Year "+marks1st		);
	System.out.println("Total Marks in 1st Year "+total1st		);
	System.out.println("Percentage in 1st year "+ percentage1st	);
	System.out.println("Marks Obtain in 2nd Year "+marks2nd		);
	System.out.println("Total Marks in 2nd Year "+total1st		);
	System.out.println("Percentage in 2nd Year "+ percentage2nd	);
	System.out.println("Total Marks in 1st and 2nd Year "+totalmarks);
	System.out.println("Final Percentage "+avgpercentage		);
	System.out.println("Grade "+grade							);
	if(avgpercentage>50)
	{
		if(pass==true)
		{
			System.out.println("Final Status : Pass"			);
		}
	}

	
	
}
}