package day1;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);

//        bài 2
        double vietValue = 25234.5;
        System.out.println("Giá vnd hôm nay là: " + vietValue);
        System.out.println("Mời bạn nhập vào số tiền usd bạn muốn chuyển: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vndChange = usd * vietValue;
        System.out.println("Bạn sẽ dổi được:" + vndChange + "vnd");
// bài 3 tính chu vi và diện tích của hình vuông
        System.out.println("Mời bạn nhập chiều dài cạnh");
        double squareLength = Double.parseDouble(scanner.nextLine());
        double perimeter = squareLength * 4;
        double area = squareLength *squareLength;
        System.out.println("Chu vi hình vuông là: " + perimeter);
        System.out.println("Diện tích hình vuông là: " + area);

//bài 4
        System.out.println("Hãy nhập điểm Toán: ");
        float mathMark = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm Văn: ");
        float literatureMark = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm Anh: ");
        float englishMark = Float.parseFloat(scanner.nextLine());
        double avg= DoubleStream.of(mathMark,literatureMark,englishMark).average().getAsDouble();
        System.out.println("Điểm trung bình các môn là: " + avg);

//        Bài 5
        double radiusCircle, circumference, areCircle;
        final double PI = 3.14159;
        System.out.print("Hãy nhập bán kính của đường tròn: ");
        radiusCircle = Double.parseDouble(scanner.nextLine());
        circumference = 2 * PI * radiusCircle;
        areCircle = PI * radiusCircle * radiusCircle;

        // Hiển thị kết quả
        System.out.println("Chu vi của hình tròn là: " + circumference);
        System.out.println("Diện tích của hình tròn là: " + areCircle);
    }
}