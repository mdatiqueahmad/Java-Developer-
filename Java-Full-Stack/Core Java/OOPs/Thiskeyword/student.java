package Thiskeyword;

public class student {
    String name;
    void setName(String name)
    {
        name=name;
    }
    void showName(){
        System.out.println(this.name);
    }

    //using this keyword we call method
    student(int naming, int marks ){
        this.showName();
    }
}

