import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack {
    private LinkedList<Integer> stack;

    MyStack(){
        stack = new LinkedList<>();
    }

    public void push(int element){
        System.out.println("Push operation is done! "+element+" is push to stack");
        stack.addFirst(element);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        System.out.println("Pop operation is done! Remove the first element: "+stack.get(0));
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}