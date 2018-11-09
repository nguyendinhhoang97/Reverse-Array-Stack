public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Before reverse: ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for(int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }

        System.out.println("After reverse: ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
