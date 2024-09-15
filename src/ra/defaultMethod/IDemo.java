package ra.defaultMethod;

public interface IDemo {

    //public void demo();

    default void hello(){
        System.out.println("Xin chào");
    }
}
