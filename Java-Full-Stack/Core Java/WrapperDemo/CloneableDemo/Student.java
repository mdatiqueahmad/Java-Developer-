package CloneableDemo;
public class Student implements Cloneable{
    int id;
    String name;


    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable
{
    int id;
    Address address;

    Student2(int id,Address address)
    {
        this.id=id;
        this.address=address;
    }

    @Override
    public Student2 clone() throws CloneNotSupportedException {
       //For shallow copy
        //return (Student2) super.clone();
        // For deep copy
        Student2 cloned=(Student2) super.clone();
        cloned.address=new Address(this.address.city);
        return cloned;
    }
}

class Address
{
    String city;
    Address(String city)
    {
        this.city=city;
    }
}