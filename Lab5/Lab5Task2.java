import java .util.*;
class Lab5Task2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter numbers you want in array:");
		int n=s.nextInt();
		System.out.print("Enter  Numbers : ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = s.nextInt();
		}

		for(int d=0;d<arr.length;d++){
			System.out.print(arr[d]);
		}
		
}
}