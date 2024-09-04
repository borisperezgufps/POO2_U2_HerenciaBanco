/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco.modelo;

/**
 *
 * @author Jd
 */
public class CurrentAcount extends Account{
    private double limiteDeSobregiro;
    
    public CurrentAcount(int a, double limSobregiro) {
        super(a);
        this.limiteDeSobregiro=limSobregiro;;
    }
    
    @Override
    public void withdraw(double sum) {
		if (sum <= getBalance()+limiteDeSobregiro)
			super.withdraw(sum);
 
    }
	

    public double getLimiteDeSobregiro() {
        return limiteDeSobregiro;
    }

    public void setLimiteDeSobregiro(int limiteDeSobregiro) {
        this.limiteDeSobregiro = limiteDeSobregiro;
    }
    
}
