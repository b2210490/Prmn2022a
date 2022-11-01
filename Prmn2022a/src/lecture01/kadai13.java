package lecture01;

import java.util.Scanner;

public class kadai13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int age = input.nextInt();

        if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

    }
}