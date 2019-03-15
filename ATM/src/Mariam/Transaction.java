package Mariam;

import javafx.event.ActionEvent;

public interface  Transaction {


	public double getCurrentBalance();
	
	public void withdraw();

	public void deposit();
	
	public void action(ActionEvent e);
	
	}



