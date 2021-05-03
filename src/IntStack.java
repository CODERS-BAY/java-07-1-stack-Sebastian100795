import java.util.ArrayList;
import java.util.List;

public class IntStack {
    List<Integer> myStack = new ArrayList<>();

    public void push(int numberToAdd) {
        myStack.add(numberToAdd);
    }

    public int size() {
        return myStack.size();
    }

    public int pop() {

        if (myStack.size()==0){
            throw new StackTooSmallException();
        }
        int number = myStack.get(myStack.size()-1);
        myStack.remove(myStack.size()-1);
        return number;

    }

    public int peek() {
        if (myStack.size()==0){
            throw new StackTooSmallException();
        }
        int number = myStack.get(myStack.size()-1);
        return number;
    }

    public int[] popN(int n) {
        if (myStack.size()==0){
            throw new StackTooSmallException();
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
           numbers[i]=pop();

        }
        return numbers;
    }
}
