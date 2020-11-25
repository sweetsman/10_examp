package example;

public class e7 {
    public static void main(String[] args) {
        e8 stack = new e8();
        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
