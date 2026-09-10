package protectedDemo;

public class Employee {

     protected double salary=5000;
    protected  void showsal(){
        System.out.println(salary);
    }
}
class Devloper extends Employee{
     void showSalary()
     {
         System.out.println(salary);
     }
}
