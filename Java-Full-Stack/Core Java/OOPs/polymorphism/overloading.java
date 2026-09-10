package polymorphism;

class Calculator{
  int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b,int c)
    {
        return a+b+c;
    }

    int add(int a, int b, int c ,int d)
    {
        return a+b+c+d;
    }

}

public class overloading {

    void khanakhaya(String msg)
    {
        System.out.println(msg);
    }

    void khanakhaya(String name, String msg)
    {
        System.out.println(msg);
    }

    void khanakhaya(String name, String msg , String add)
    {
        System.out.println(msg);
    }
}
