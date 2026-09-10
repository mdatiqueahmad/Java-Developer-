public class returntype {

    int add(int a , int b){
        int adding=a+b;
        return adding;
    }

    int sub(int a, int b) {
        int sub =a-b;
        return sub;
    }

    public static void main(String[] args) {
        returntype r=new returntype();
        System.out.println(  r.add(5,10));
        System.out.println(r.sub(15,2));
    }
}
