package ra.methodReference;

public class Hello implements SayHello{


    //Constructor
    public Hello(String string) {
        System.out.println("Hàm khởi tạo của Hello");
    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}
