package ListDemo;

import java.util.Stack;

public class ListP05 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push("A");
        s.push("7");
        s.push(12);
        s.push("A");
        s.push("");
        s.push("A");
        s.push("A");
        System.out.println(s);
        System.out.println(s.indexOf("A"));
        System.out.println(s.peek());

    }
}
