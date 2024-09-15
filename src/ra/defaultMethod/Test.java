package ra.defaultMethod;

public class Test {
    public static void main(String[] args) {
        IDemo iDemo = new Demo1();
        iDemo.hello();

        IDemo iDemo2 = new Demo2();
        iDemo2.hello();
    }
}
