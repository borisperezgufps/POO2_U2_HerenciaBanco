package ufps.poo2.ejercicio.banco;

import java.util.LinkedList;

public class Bank {

    private LinkedList<Account> accounts;

    public Bank(){
        accounts = new LinkedList<>();
    }

    public void openAccount(char accType, int accNumber){
        Account newAccount;
        switch (accType) {
            case 'A' -> {
                newAccount = new SavingsAccount(accNumber);
            }
            case 'B' -> {
                newAccount = new CurrentAccount(accNumber);
            }
            default -> {
                throw new RuntimeException("Invalid account type");
            }
        }

        if(accounts.contains(newAccount)) throw new RuntimeException("There's already an account with that number!");

        accounts.add(newAccount);
    }

    public void payDividend(int accNumber, double amount){

    }

    public void withdrawAccount(int accNumber, double amount){
        for (Account account : accounts) {
            if(account.getAccountNumber() == accNumber){
                account.withdraw(amount);
                return;
            }
        }
        throw new RuntimeException("There is no account with that number");
    }

    public void depositAccount(int accNumber, double amount){
        for (Account account : accounts) {
            if(account.getAccountNumber() == accNumber){
                account.deposit(accNumber);
                return;
            }
        }
        throw new RuntimeException("There is no account with that number");
    }

    public double accountBalance(int accNumber){
        for (Account account : accounts) {
            if(account.getAccountNumber() == accNumber){
                return account.getBalance();
            }
        }
        throw new RuntimeException("There is no account with that number");
    }

    public void sendLetterToOverdraftAccounts(){
        for (Account account : accounts) {
            if(!(account instanceof CurrentAccount)) continue;
            CurrentAccount currentAcc = (CurrentAccount) account;
            if(currentAcc.isOverDraft()){}
        }
    }

    public void closeAccount(int accNumber){
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountNumber() == accNumber){
                accounts.remove(i);
                return;
            }
        }
        throw new RuntimeException("There is no account with that number");
    }
}
