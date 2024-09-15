package ra.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        IFunctionInterface iFunctionInterface = new IFunctionInterface() {

            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };

        iFunctionInterface.hello();

        //Khi có lambda
        IFunctionInterface iFunctionInterface1 = () ->{
            System.out.println("Xin chào");
        };
        iFunctionInterface1.hello();

        //Tùy chọn sử dụng dấu ngoặc {}:
        // khi trong body có một statement duy nhất thì có thể bỏ qua dấu ngoặc {}
        IFunctionInterface iFunctionInterface2 = () -> System.out.println("Xin chào hi");
        iFunctionInterface2.hello();

        //Lambda có tham số truyền vào
        IFunctionInterface2 iFunctionInterface3 = (a,b) -> a+b;
        System.out.println(iFunctionInterface3.addTwoNumbers(10,10));
    }
}
