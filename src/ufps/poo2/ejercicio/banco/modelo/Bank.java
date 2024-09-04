package ufps.poo2.ejercicio.banco.modelo;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> cuentas;

    public Bank() {
        this.cuentas = new ArrayList<>();
    }
    
    public void depositarCuenta(Account cuenta, double sum){
        for(int i=0; i< cuentas.size();i++){
            if(cuentas.get(i).equals(cuenta))
                cuentas.get(i).deposit(sum);
        }
    }
        public void retirarCuenta(Account cuenta, double sum ){
            for(int i=0; i< cuentas.size();i++){
            if(cuentas.get(i).equals(cuenta))
                cuentas.get(i).withdraw(sum);
        }
        }
        public void  abrirCuenta(boolean corriente,int accnum, double limSobregiro, double interest){
            if(corriente){
                CurrentAcount c = new CurrentAcount(accnum, limSobregiro);
                cuentas.add(c);
            }
            else{
                SavingsAccount s = new SavingsAccount(accnum, interest);
                cuentas.add(s);
                
            }
            
            
        }
        
        public void cerrarCuenta(Account c ){
            for(int i=0; i<cuentas.size();i++){
            if(cuentas.get(i).equals(c))
                cuentas.remove(c);
        }
            
        }

    public ArrayList<Account> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Account> cuentas) {
        this.cuentas = cuentas;
    }
    }


