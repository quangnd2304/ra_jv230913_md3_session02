package ra;

import java.util.Scanner;

public class Bus_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        float price;
        if (age < 6 || age > 60) {
            price = 0;
        } else if (age < 18) {
            price = 7000 * 0.5F;
        } else {
            price = 7000;
        }
        System.out.println("Giá vé của bạn là: " + price);
    }
}
