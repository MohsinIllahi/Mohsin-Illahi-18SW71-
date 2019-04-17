class Bitwise{
	public static void main(String[] args){
		int x=2;
		int y=~x;
		int z=3;
		System.out.println("where x=2 and z=3");
		System.out.println("Compliment ~ of x "+y);
		System.out.println("Bitwise AND & Between X and Z = "+(x&y));
		System.out.println("Bitwise OR | Between X and Z ="+(x|y));
		System.out.println("Bitwise left shift << X = "+(x<<2));
		System.out.println("Bitwise right shift >> Z =  "+(z>>2));
	}
}