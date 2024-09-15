package ra.methodReference;


public class Test1 {
    //Action thực hiện tính toán
    public  static int action(int a, int b, ExecuteFunction executeFunction){
        return executeFunction.execute(a, b);
    }

    public static void main(String[] args) {
        //Cách 1
        //IFunctionalInterface iFunctionalInterface = (a,b) -> a + b;

        //Cách 2
        IFunctionalInterface iFunctionalInterface = Integer::sum;

        int sum =action(30,70,MathUt::sum);
        System.out.println("Tổng = " + sum);
    }
}
