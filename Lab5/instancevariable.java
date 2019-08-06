import java.util.*; 
class Emp { 
  
    public static double salary; 
    public static String name = "Mohsin illahi"; 
} 
  
 class EmpDemo { 
    public static void main(String args[]) 
    { 
   
        Emp.salary = 1000; 
        System.out.println(Emp.name + "salary of Mohsin: "+ Emp.salary); 
    } 
} 