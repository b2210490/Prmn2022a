package lecture06;

import java.util.*;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(random.nextInt(6) +1);
        }

        System.out.println("さいころを5つ振りました。");

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("何番目のサイコロの値を確認しますか？");
            int x = input.nextInt();
            System.out.println(list.get(x));
        } catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外のアクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
