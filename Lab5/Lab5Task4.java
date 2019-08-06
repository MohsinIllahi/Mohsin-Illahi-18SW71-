/* Create a Student class that stores student data, provides methods for initializing and 
displaying student data. Also provide a parameterized constructor for initializing
 student class data members*/
 class Student{
 	String name;
 	String rollno;
 	String department;
 	int age;
 public void setData(String nn,String rr,String dd,int aa){
 	name=nn;
 	rollno=rr;
 	department=dd;
 	age=aa;
 }
 public void showData(){
   System.out.println(name);
   System.out.println(rollno);
   System.out.println(department);
   System.out.println(age);
 }
}
 class Lab5Task4{
 	public static void main(String[] args) {
 	Student s1=new Student();
 	s1.setData("mohsin","18sw71","software",20);
 	s1.showData();	
 	}
 }
