import java.util.*;

class table{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number for table: ");
		int num = s.nextInt();

		System.out.print("Enter The starting number of table");
		int first = s.nextInt();

		System.out.print("Enter ending Number of the table");
		int end = s.nextInt();

		for(int i = first; i <= end; i++){
			System.out.println(num+"x"+i+" = "+num*i);
		}
	}
}