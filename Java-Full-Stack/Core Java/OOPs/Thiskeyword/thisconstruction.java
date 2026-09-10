package Thiskeyword;

 class cfs {
     String name="code for success";
    cfs()
    {
        System.out.println("this default contruction");
    }
}

class course extends cfs {
     String name="spark6.0";
    course()
    {
        //super is there in build
        System.out.println("course default construction");

    }
    course(String name){
        this();
        System.out.println("parameter constuction");

    }
    void showName(){
        System.out.println(name);//current class
        System.out.println(this.name);//current class
        System.out.println(super.name);//parent class
    }
}

public class thisconstruction {
    public static void main(String[] args) {
        course C=new course("my name is");
    }
}
