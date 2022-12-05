package lecture06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
        int x = random.nextInt(6) + 1;
        list.add(x);
        }

        System.out.println("さいころを5つ振りました。");

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("何番目のサイコロの値を確認しますか？");
            int x = input.nextInt();
            System.out.println();
        } catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外のアクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        } catch (IllegalArgumentException e) {
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
