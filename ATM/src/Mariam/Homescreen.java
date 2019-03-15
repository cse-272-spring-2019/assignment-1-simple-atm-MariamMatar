package Mariam;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
public class Homescreen {
	GUI gui;
	Stage stage;
	Scene scene;
	Numbers Number;
	Numdep dep;
	Mytransaction tran;
	int i=0;
	

	public void preparescene() {
		Label Welcome=new Label("Welcome Mariam Matar!");
		Label Output=new Label();
		Label prev1=new Label();
		Label prev2=new Label();
		Label Bal=new Label();
		Button Withdraw =new Button ("Withdraw");
		Button Deposit =new Button ("Deposit");
		Button BalanceIn =new Button ("Balance Inquiry");
		Button Previous =new Button ("Previous");
		Button Next =new Button ("Next");
		GridPane abs =new GridPane();
		
		
		abs.add(Output, 3, 7);
		abs.add(prev2, 3, 8);
		abs.add(prev1, 4, 8);
		abs.add(Bal, 2, 7);
		abs.add(Withdraw, 0, 3);
		abs.add(Deposit, 0, 4);
		abs.add(BalanceIn, 0, 5);
		abs.add(Previous, 0, 6);
	    abs.add(Next, 0, 7);
	    abs.add(Welcome,0 ,0);
	    abs.setVgap(10);
	    
	    Withdraw.setTextFill(Color.web("CadetBlue"));
	    Withdraw.setFont(new Font("Verdana",15));
	    Deposit.setTextFill(Color.web("CadetBlue"));
	    Deposit.setFont(new Font("Verdana",15));
	    BalanceIn.setTextFill(Color.web("CadetBlue"));
	    BalanceIn.setFont(new Font("Verdana",15));
	    Previous.setTextFill(Color.web("CadetBlue"));
	    Previous.setFont(new Font("Verdana",15));
	    Next.setTextFill(Color.web("CadetBlue"));
	    Next.setFont(new Font("Verdana",15));
	    
	    
	    
	    
	    
	    Welcome.setTextFill(Color.web("NavajoWhite"));
	    Welcome.setFont(new Font("Verdana",17));
		
        Withdraw.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				stage.setScene(Number.getScene());
			
			}
					
	});
        Deposit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				stage.setScene(dep.getScene());
			}
        	
        });
        
        BalanceIn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				prev1.setText("");
 				prev2.setText("");
 			    Bal.setTextFill(Color.web("NavajoWhite"));
 			    Bal.setFont(new Font("Verdana",17));
				Bal.setText("Your Current Balance is: ");
				double B=tran.getCurrentBalance();
			    Output.setTextFill(Color.web("NavajoWhite"));
			    Output.setFont(new Font("Verdana",17));
				Output.setText(String.valueOf(B));
				
				
			}
        	
        });
       Previous.setOnAction(new EventHandler<ActionEvent>() {

 			@Override
 			public void handle(ActionEvent event) {
 				
 				Bal.setText("");
 				Output.setText("");
                
 				if(tran.Amount.size()>=i) {
 				if(i>0) {
 				prev1.setTextFill(Color.web("NavajoWhite"));
 			    prev1.setFont(new Font("Verdana",17));
 				prev2.setTextFill(Color.web("NavajoWhite"));
 			    prev2.setFont(new Font("Verdana",17));
 				prev1.setText(String.valueOf(tran.Amount.get(i-1).getAmount()));
				prev2.setText(String.valueOf(tran.Amount.get(i-1).getType()));
 				i--;
 				}
 				else {
 					prev1.setTextFill(Color.web("NavajoWhite"));
 				    prev1.setFont(new Font("Verdana",17));
 					prev1.setText("No History To Show");
 					prev2.setText(" ");
 				}
 				}
 				else {
 				    prev1.setTextFill(Color.web("NavajoWhite"));
 				    prev1.setFont(new Font("Verdana",17));
 					prev1.setText("No History To Show");
 					prev2.setText(" ");
 				}
 			}
         	
         });
     
       
       Next.setOnAction(new EventHandler<ActionEvent>() {
    	   

    			@Override
    			public void handle(ActionEvent event) {
    				
    				Bal.setText("");
    				Output.setText("");
    				if(tran.Amount.size()<=i) {
    					Output.setTextFill(Color.web("NavajoWhite"));
    				    Output.setFont(new Font("Verdana",17));
    					Output.setText("No History to show!");
    					prev2.setText(" ");
    					prev1.setText(" ");
    		
    				}
    				else {
    					prev1.setTextFill(Color.web("NavajoWhite"));
    	 			    prev1.setFont(new Font("Verdana",17));
    	 				prev2.setTextFill(Color.web("NavajoWhite"));
    	 			    prev2.setFont(new Font("Verdana",17));
    				prev1.setText(String.valueOf(tran.Amount.get(i).getAmount()));
    				
    				prev2.setText(String.valueOf(  tran.Amount.get(i).getType()));
    				i++;
    				if(i>5) {
    					prev1.setTextFill(Color.web("NavajoWhite"));
    	 			    prev1.setFont(new Font("Verdana",17));
    	 				prev2.setTextFill(Color.web("NavajoWhite"));
    	 			    prev2.setFont(new Font("Verdana",17));
    					prev2.setText("No more History");
        				prev1.setText(" to show!");
        				Bal.setText(" ");
        				Output.setText(" ");
        				
    				}}
    				
    			}
            	
            });
        

     
        abs.setStyle("-fx-background-color:CadetBlue ");
	    scene=new Scene(abs,600,400);
	}
	public Homescreen (Stage stage,Mytransaction obj) {
		this.tran=obj;
		this.stage=stage;
		
	}
	public Scene getScene() {
		return scene;
	}
	public void setGui(GUI gui) {
		this.gui = gui;
	}
	public void setNumbers(Numbers numbers) {
		this.Number = numbers;
	}
	public void setNumDep(Numdep dep) {
		this.dep = dep;
	}
	
	

}
