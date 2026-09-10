
public class Employee {
  Employee(){
      System.out.println("the employee");
  }
    int id;
    String name;
    double salary;
}
class Developers extends  Employee{
    String progLang;
}

class Manager extends Employee{

    //default
    Manager() {
        //super() this run default parent constructor called
        System.out.println("The Manager");
    }
    int teamSize=100;

}
