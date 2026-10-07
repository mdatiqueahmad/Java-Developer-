package SetDemo;

public class Student01 implements Comparable<Student01>{
        int id;
        String name;
    Student01(int id, String  name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Student01 o) {
        System.out.println("Camparing "+this.id + " with "+ o.id);
        return Integer.compare(this.id, o.id);
    }

}
