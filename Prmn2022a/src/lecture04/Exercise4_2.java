package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.registerAccount("大塚淳史", "12345");
        atm.existsAccount("大塚淳史", "12345");
        atm.deposit("12345", 1000);
        atm.withdraw("12345", 2000);
        atm.withdraw("12345", 500);
    }
}
