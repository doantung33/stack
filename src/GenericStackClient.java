public class GenericStackClient {

    public static void main(String[] args) {

        MyGenericStack<String> stack =new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("for");
        stack.push("five");
        System.out.println("Do dai cua mang sau khi day là : " + stack.size());
        System.out.println("Xoa phan tu : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }
        System.out.println("Kich co của mang sau khi xoa la : " + stack.size());

        MyGenericStack<Integer> stack1 =new MyGenericStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println("Do dai cua mang sau khi day là : " + stack1.size());
        System.out.println("Xoa phan tu : ");
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());

        }
        System.out.println("Kich co của mang sau khi xoa la : " + stack.size());
    }


}
