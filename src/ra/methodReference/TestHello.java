package ra.methodReference;

public class TestHello {

    public static void main(String[] args) {
        SayHello hello = Hello::new;
        hello.display("Hi");
    }
}
