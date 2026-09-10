class  student {
    String name1;
    String name2;
    int age;

    void study() {
        name1="father dadi afjun bibi";
        name2="father nani bhukni bibi";
        System.out.println(name1);
        System.out.println(name2);
    }
}

public class teststudent {
    public static void main(String[] args) {
        System.out.println("hello");

        student s=new student();
        System.out.println(s.age);
        System.out.println(s.name1);

        s.study();

    }
}
