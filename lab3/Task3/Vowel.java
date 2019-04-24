import java.util.*;
class Vowel{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		char option;
		do{
		System.out.print("Enter the character :");
		char ch=sc.next().charAt(0);
		switch(ch){
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		System.out.print("Entered charater is Vowel \n");
		break;
		default:
		System.out.print("Your Entered Character is consonant \n");
		}
		
		System.out.println("Do you want to Check an other Character y/n");
		option= sc.next().charAt(0);
		}
		while(option!='n');
		
		
	}
}