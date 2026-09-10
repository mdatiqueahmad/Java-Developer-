package polymorphism;


class a
{
    public void show()
    {
        System.out.println("in a Show");
    }

}
class b extends a{
    public void show()
    {
        System.out.println("in b Show");
    }
}

class c extends a{
    public void show()
    {
        System.out.println("in d Show");
    }
}
public  class dynamicDispatcher {
    public static void main(String a[]) {
        a obj=new b();
        obj.show();
        a obj1=new c();
        obj1.show();
    }
}