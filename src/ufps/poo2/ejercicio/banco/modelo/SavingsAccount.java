/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

/**
 *
 * @author Jd
 */
public class SavingsAccount extends Account{
    private double interest;
    
    public SavingsAccount(int n) {
        super(n); 
        this.interest=0.2;
                
    }
    
    @Override
    public void deposit(double sum) {
		if (sum >= getBalance())
			super.deposit(sum);
	}
    
     @Override
    public void withdraw(double sum) {
		if (sum <= getBalance())
			super.withdraw(sum);
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
