package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1つ目の整数を入力してください:");
        String x = scanner.nextLine();
        System.out.println("2つ目の整数を入力してください:");
        String y = scanner.nextLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
