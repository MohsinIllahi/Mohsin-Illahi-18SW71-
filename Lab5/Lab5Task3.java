 /* Develop a java class called Dog having three data members; name, breed and age.
 Create a function setDetails() which initializes these data members after taking parameters.
 Create another function showDetails() which print these values if these values are initialized
  otherwise show a message that details are unavailable.*/ 

class Dog{
	
		
	
	String name;
	String breed;
	int age;

public void setDetails(String n,String b,int a){
	name=n;
	breed=b;
	age=a;
}
public void showDetails(){
	System.out.println(name);
	System.out.println(breed);
	System.out.println(age);
}
}
class Lab5Task3{
	public static void main(String[] args){
		Dog d1=new Dog();
		d1.setDetails("dogy","tfft",14);
		d1.showDetails();
		
}
}