package ufps.poo2.ejercicio.banco.modelo;

public class BankClient {
    public static void main(String[] args) {
       
        Bank banco = new Bank();
        
        
        banco.abrirCuenta(true, 101, 500.0, 0.0);
        banco.abrirCuenta(false, 102, 0.0, 2.5);  

      
        Account cuentaCorriente = banco.getCuentas().get(0); 
        Account cuentaAhorro = banco.getCuentas().get(1);    

    
        banco.depositarCuenta(cuentaCorriente, 1000.0); 
        banco.depositarCuenta(cuentaAhorro, 1500.0);    

        
        banco.retirarCuenta(cuentaCorriente, 200.0);    
        banco.retirarCuenta(cuentaAhorro, 300.0);       

        
        System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getBalance());
        System.out.println("Saldo cuenta de ahorro: " + cuentaAhorro.getBalance());

     
        banco.cerrarCuenta(cuentaAhorro);

     
        banco.depositarCuenta(cuentaAhorro, 500.0);
        System.out.println("Intentando depositar en una cuenta cerrada: " + cuentaAhorro.getBalance());

      
        System.out.println("Cuentas restantes en el banco: " + banco.getCuentas().size());
    }
}
