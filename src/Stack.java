public class Stack {
    private int arr[];
    private int top;
    private int capacity; 
    Stack (int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void printStack(){
        for (int i =0; i<= top;i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println("");
    }
    public Boolean isFull(){
        return top == capacity -1 ;
    }
    public Boolean isEmpty(){
        return top==-1;
    }
    public int getSize(){
        return top + 1;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("No items in stack");
            System.exit(1);
        }
        return arr[top--];
    }
    public void push(int append){
        arr[top+1]=append;
        top++;
    }
    public int peek(){
        return arr[top-1];
    }

}


