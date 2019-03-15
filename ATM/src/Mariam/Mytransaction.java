package Mariam;

import java.util.ArrayList;

public class Mytransaction implements Transaction {
	Mytransaction tran;
	ArrayList<History> Amount=new ArrayList<>(5);
 double balance=5000;
	
	
	public double getCurrentBalance() {
		
		return balance;
	}

	public void withdraw(double z) {
		balance=balance-z;
		if(Amount.size()>=5) {
			
			Amount.remove(0); 
			Amount.add(new History("Withdraw:",z));
            
		}
		else 
			Amount.add(new History("Withdraw:",z));
	 	
  	   
	}
		

	public void deposit(double z) {
		balance=balance+z;
		if(Amount.size()>=5) {
			Amount.remove(0);
			Amount.add(new History( "Deposit:",z));
		}
		else
		
		Amount.add(new History( "Deposit:",z));
		
	}
	public boolean valid(double z)
	{
		boolean valid=false;
		if(balance >= z) {
			valid=true;
			}
		return valid;	
	}
	
	public void size(double z) {
		if (Amount.size()>5) {
			Amount.remove(0);
			Amount.add(new History( "Deposit:",z));
		}
		else 
			Amount.add(new History( "Deposit:",z));
			
	}

	public void size1 (double z) {
		if (Amount.size()>5) {
			Amount.remove(0);
			Amount.add(new History( "Withdraw:",z));
		}
		else 
			Amount.add(new History( "Withdraw:",z));
			
	}


	
	
	
	
	@Override
	public void action(javafx.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}
}

