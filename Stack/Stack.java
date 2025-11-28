package Stack;

public class Stack {

    static class MyStack {
        int arr[];
        int top;
        int size;

        // Constructor
        MyStack(int size){
            this.size = size;
            arr = new int[size];
            top = -1;    // stack is empty
        }

        // Check empty
        boolean isEmpty(){
            return top == -1;
        }

        // Check full
        boolean isFull(){
            return top == size - 1;
        }

        // Push
        void push(int data){
            if(isFull()){
                System.out.println("Stack is Full! Cannot push " + data);
                return;
            }
            arr[++top] = data;
        }

        // Pop
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty! Nothing to pop");
                return -1;
            }
            return arr[top--];
        }

        // Peek
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[top];
        }

        // Print stack
        void printStack(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return;
            }

            System.out.print("Stack: ");
            for(int i = 0; i <= top; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        MyStack st = new MyStack(5);  // stack size = 5

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.printStack();   // 10 20 30 40

        System.out.println("Peek: " + st.peek()); // 40
        
        st.pop();
        st.printStack();   // 10 20 30

        st.push(50);
        st.push(60);
        st.push(70);   // will show "Stack Full"
        
        st.printStack();
    }
}
