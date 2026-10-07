package Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {
        Vector v= new Vector();
        for (int i=0;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
//First we take cursor
        Enumeration e=v.elements();

        while (e.hasMoreElements()){
            Integer data=(int)e.nextElement(); //it return object so you have to type cast it
            System.out.println(data);
        }
    }
}
