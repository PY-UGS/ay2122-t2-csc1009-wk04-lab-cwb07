public class StackOfIntegers {
    private int size;
    private int[] elements;
    private int capacity = 0;

    public StackOfIntegers() {
        size = -1;
        elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.capacity = capacity;
        size = -1;
        elements = new int[capacity]; 
    }

    public boolean empty() {
        if (size == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int peek(){
        return elements[size];
    }

    public void push(int value) {
        size += 1;
        elements[size] = value;
    }

    public int pop(){
        int returnValue = elements[size];
        size -= 1;
        return returnValue;
    }

    public int getSize(){
        if (size == -1) {
            return 0;
        } else {
            return size+1;
        }
    }
}