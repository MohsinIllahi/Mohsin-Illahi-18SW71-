class Teacher {
   String designation = "Teacher";
   String uniName = "MUET";
   void does(){
	System.out.println("Teach");
   }
}

 class javaTeacher extends Teacher{
   String mainSub = "java referance";
   public static void main(String args[]){
	javaTeacher obj = new javaTeacher();
	System.out.println(obj.uniName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSub);
	obj.does();
   }
}