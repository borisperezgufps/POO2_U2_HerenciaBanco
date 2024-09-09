package ufps.poo2.ejercicio.banco.modelo;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> cuentas;

    public Bank() {
        this.cuentas = new ArrayList<>();
    }

    public void depositarCuenta(Account cuenta, double sum) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).equals(cuenta)) {
                cuentas.get(i).deposit(sum);
            }
        }
    }

    public void retirarCuenta(Account cuenta, double sum) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).equals(cuenta)) {
                cuentas.get(i).withdraw(sum);
            }
        }
    }

    public void openAccount(char tipo, int accnum) {
        if (tipo == 'C') {
            CurrentAcount c = new CurrentAcount(accnum);
            cuentas.add(c);
        } else {
            SavingsAccount s = new SavingsAccount(accnum);
            cuentas.add(s);

        }

    }

    public void withdrawAccount(int accnum, int pay) {
        buscarCuenta(accnum).withdraw(pay);
    }

    public void payDividend(int accnum, int pay) {
        buscarCuenta(accnum).deposit(pay);

    }

    public ArrayList<Account> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Account> cuentas) {
        this.cuentas = cuentas;
    }

    public double getBalance(int accnum) {
        return buscarCuenta(accnum).getBalance();

    }

    public Account buscarCuenta(int accnum) {
        for (Account cuenta : cuentas) {
            if (cuenta.getAccountNumber() == accnum) {
                return cuenta;
            }

        }
        return null;
    }
    public String sendLetterToOverdraftAccounts(){
        String letter ="Sending letter to this";
        for(Account cuenta: cuentas)
            if(cuenta.getBalance()<0)
                letter+=" "+cuenta.getAccountNumber();
        letter+= " acounts";
        return letter;
    }
        
    }
