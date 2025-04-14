import java.util.*;
public class StackNew {
    public static void bottom(Stack<Integer> s , int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        bottom(s, data);
        s.push(top);
    }
    public static void reveseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        reveseStack(s);
        bottom(s, top);
    }
    public static void print(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String arrgs[]){
        Stack<Integer> s =new Stack();
        s.push(8);
        s.push(9);
        s.push(0);

        // bottom(s, 7);
        reveseStack(s);
        print(s);
        

    }
}
