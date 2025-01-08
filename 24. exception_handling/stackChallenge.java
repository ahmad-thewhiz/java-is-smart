class StackUnderFlowException extends Exception {
    public String toString() {
        return "Stack Underflow";
    }
}

class StackOverFlowException extends Exception {
    public String toString() {
        return "Stack Overflow";
    }
}

class Stack {
    int top = -1;
    int[] arr = new int[5];

    void push(int data) throws StackOverFlowException {
        if (top == 4) {
            throw new StackOverFlowException();
        }
        arr[++top] = data;
    }

    int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        return arr[top--];
    }
}


public class stackChallenge {
    Stack s = new Stack();

    void push(int data) {
        try {
            s.push(data);
        } catch (StackOverFlowException e) {
            System.out.println(e);
        }
    }

    void pop() {
        try {
            System.out.println(s.pop());
        } catch (StackUnderFlowException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        stackChallenge sc = new stackChallenge();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        sc.push(6);
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
    }
}
