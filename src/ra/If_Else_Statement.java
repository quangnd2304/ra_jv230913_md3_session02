package ra;

import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        /*
         * if(condition1){
         *   block statements1;
         * } else if(condition2){
         *   block statements2;
         * }....
         * else if(conditionN){
         *   block statementN;
         * }else{
         *   block staatementN+1;
         * }
         * */
        //1. Nhập vào một số, kiểm tra số nguyên là số chẵn hay số lẻ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Số nguyên là số chẵn");
        } else {
            System.out.println("Số nguyên là số lẻ");
        }
        //2. In ra số dư trong phép chia 3, phải sử dụng if-else
        if (number % 3 == 0) {
            System.out.println("Số nguyên chia hết cho 3");
        } else if (number % 3 == 1) {
            System.out.println("số nguyên chia 3 dư 1");
        } else {
            System.out.println("Số nguyên chia 3 dư 2");
        }
        //Ứng dụng: in ra số dư trong phép chia 5
    }
}
