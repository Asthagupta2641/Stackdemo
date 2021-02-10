import java.util.Stack;
public class stack1{


    public static void main(String arg[]) {

        Stack<Integer>stack= new Stack<>();

        System.out.println("Empty stack : " + stack);
        System.out.println("Empty stack : " + stack.isEmpty());
        stack.push(99);
        stack.push(4);
        stack.push(44);
        stack.push(23);
        stack.push(15);
        stack.push(-1);

        System.out.println("Non-Empty stack : " + stack);
        stack.pop();
        System.out.println("Non-Empty stack: Pop Operation : " + stack.pop());
        System.out.println("Non-Empty stack: Peek Operation : " + stack.peek());





    }

}
