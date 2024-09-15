package ra.stream;


import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Áo sơ mi", 100));
        products.add(new Product(2, "Áo sơ mi 2", 50));
        products.add(new Product(3, "Áo sơ mi 3", 150));
        products.add(new Product(4, "Áo sơ mi 4", 100));

        //in ra danh sách sản phẩm có giá lớn hơn hoặc bằng 100
        //Cách 1
//        for (Product product : products) {
//            if (product.getPrice() >= 100) {
//                System.out.println(product.toString());
//            }
//        }

        //Cách 2: sử dụng stream
        products.stream().filter(product -> product.getPrice() >= 100).forEach(
            System.out::println
        );

        System.out.println("\n");
        //
        List<Product> products1 =  products.stream().filter(product -> product.getPrice() >= 100).toList();
        for (Product product : products) {
            System.out.println(product.toString());
        }

        //In ra tên sản phẩm, phương thức map
        //products.stream().map(product -> product.getName()).forEach(System.out::println);
        //rút gọn
        products.stream().map(Product::getName).forEach(System.out::println);


        //Sắp xếp sorted
        //Sắp xếp sản phẩm theo giá tăng dần
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        System.out.println("\n");

        //Sắp xếp sản phẩm theo giá giảm dần
        products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);

        System.out.println("\n");

        //Check xem trong danh sách sp có sp nằm trong giá từ 40 - 100 không
        boolean check = products.stream().anyMatch(product -> product.getPrice() >=40 && product.getPrice() <= 100);
        System.out.println("Có nằm trong 40 - 100 không: " + check);

        //Đếm sp có giá = 100
        long total = products.stream().filter(product -> product.getPrice() == 100).count();
        System.out.println("Các sản phẩm có giá = 100 là: " + total);

        //Tìm sp có giá lớn nhất
        Product productMax = products.stream().max(Comparator.comparing(Product::getPrice)).orElse(null);
        System.out.println("Sản phẩm: " + productMax.toString());

        //Thống kê
        DoubleSummaryStatistics statistics = products.stream().mapToDouble(Product::getPrice).summaryStatistics();
        System.out.println("Giá cao nhất: " + statistics.getMax());
        System.out.println("Giá thấp nhất: " + statistics.getMin());
        System.out.println("Giá trung bình: " + statistics.getAverage());

        //Tính tổng tiền của các sp
        double totalPrice = products.stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
        System.out.println("Tổng tiền của sản phẩm: " + totalPrice);
    }
}
