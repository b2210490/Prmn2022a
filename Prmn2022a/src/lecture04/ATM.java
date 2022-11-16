package lecture04;

import javax.security.auth.login.AccountException;
import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accountList;

    ATM() {
        accountList = new ArrayList<>();
    }

    void registerAccount(String name, String number) {
        if (!existsAccount(name, number)) {
            accountList.add(new Account(name, number));
            System.out.println(name + " さんのアカウントを口座番号: " + number + " で登録しました。");
        }
    }

    boolean existsAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println("名前:" + name + " 口座番号:" + number + "は存在します。");
                return true;
            } else if (account.getNumber().equals(number)) {
                System.out.println("口座番号:" + number + " は既に使用されています。");
                return true;
            }
        }
            System.out.println("名前:" + name + " 口座番号:" + number + "は存在しません。");
            return false;
            }

    void deposit(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
               account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました");
            } else {
                System.out.println(" 口座番号:" + number + "は存在しません。");
            }

        }
    }

    long withdraw(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
                if (account.getBalance() > money) {
                    account.setBalance(account.getBalance() - money);
                    System.out.println("口座番号:" + number + " から " + money + " 円引き出しました。 残高:" + account.getBalance() + "円です。");
                    return 0;
                } else {
                    System.out.println("口座番号:" + number + " から " + money + " 円引き出せませんでした。 残高:" + account.getBalance() + "円です。");
                    return 0;
                }
            }
        }
        System.out.println(" 口座番号:" + number + "は存在しません。");
        return 0;
    }


}



