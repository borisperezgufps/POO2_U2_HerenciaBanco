package ufps.poo2.ejercicio.banco;

public class CurrentAccount extends Account{

    private double overdraftLimit;

    public CurrentAccount(int accountNumber){
        super(accountNumber);
    }

    public boolean isOverDraft(){
        return true;
    }

    @Override
    public void withdraw(double sum){

    }

    @Override
    public String toString(){
        return null;
    }
}
