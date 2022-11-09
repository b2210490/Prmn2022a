package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int x = scanner.nextInt();

        String[] input = new String[x];
        for (int i=0; i<x; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println((i+1) + "行目:");
            input[i] = scanner1.nextLine();
            System.out.println("入力した文字列:");
        }
        for (int i=0; i<x; i++) {
            System.out.println("[" + i + "] " + input[i]);
        }
    }
}
