package Functions.Bank;

import java.util.*;

public class MainBank {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank();

        Account account1 = new Account("Peter Parker", "C0011", 5000);
        Account account2 = new Account("Emily Kaldwin", "C0121", 4500);
        Account account3 = new Account("Leon Kennedy", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("Après le dépôt de 1000 euros sur le compte C0011 :");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());

        System.out.println("Aucune transaction sur le compte C0121 :");
        System.out.println(account2.getAccountInfo());

        System.out.println("Après le retrait de 5000 euros du compte C0222 :");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}
