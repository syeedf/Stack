
public class App {
    public static void main(String[] args) throws Exception {
    
        //last in first out


        Stack num= new Stack(5);

        System.out.println(num.isEmpty());

        num.push(5);
        num.push(22);
        num.push(3);
        num.printStack();

        num.pop();
        System.out.println(num.isFull());
        num.printStack();
        num.pop();
        num.pop();
        num.pop();
        num.printStack();

    }
}
