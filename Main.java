public class Main {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        System.out.println("SIZE:" + stack.getSize());

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
