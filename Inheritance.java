class Programmer{  
 float salary=40000;  
}  
class Inheritance extends Programmer{  
 int bonus=10000;  
 public static void main(String args[]){  
   Inheritance p=new Inheritance();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
