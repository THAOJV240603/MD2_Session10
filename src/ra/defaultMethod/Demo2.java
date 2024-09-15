package ra.defaultMethod;

public class Demo2 implements IDemo{

    //Ghi đè
    @Override
    public void hello(){
        System.out.println("Demo2 xin chào");
    }
}
