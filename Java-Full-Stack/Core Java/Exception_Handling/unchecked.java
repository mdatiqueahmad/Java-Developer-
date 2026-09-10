public class unchecked {

    public static void main(String[] args) {

        try {
            String name="java";
            System.out.println(name.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String out of index");
        }
    }
}
