package Mariam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Numbers {
	Homescreen homescreen;
	Stage stage;
	GUI gui;
	Scene scene;
	Mytransaction tran;

	public Numbers (Stage stage,Mytransaction obj) {
		this.tran=obj;
		this.stage=stage;
	}

	
	public void preparescene() {
		Button A =new Button ("0");
		Button B =new Button ("1");
		Button C =new Button ("2");
		Button D =new Button ("3");
		Button E= new Button ("4");
		Button F =new Button ("5");
		Button G =new Button ("6");
		Button H =new Button ("7");
		Button I =new Button ("8");
		Button J =new Button ("9");
		Button Back=new Button("Back");
		Label Value =new Label("Enter the amount");
		Label Done=new Label();
		Label not=new Label();
		TextField Num =new TextField ();
		Button Next=new Button("Next");
		
		 GridPane abs =new GridPane();
		 
	  		abs.add(Value, 0, 0);
			abs.add(Num, 5,6);
			abs.add(Next, 6, 9);
			abs.add(Done, 6,11 );
			abs.add(not, 5, 4);
			abs.add(Back, 4, 9);
			abs.add(A, 2, 7);
			abs.add(B, 1, 4);
			abs.add(C, 2, 4);
			abs.add(D, 3, 4);
		    abs.add(E, 1, 5);
		    abs.add(F, 2, 5);
			abs.add(G, 3, 5);
			abs.add(H, 1, 6);
			abs.add(I, 2, 6);
		    abs.add(J, 3, 6);
		    
		    A.setTextFill(Color.web("CadetBlue"));
		    A.setFont(new Font("Verdana",15));
		    B.setTextFill(Color.web("CadetBlue"));
		    B.setFont(new Font("Verdana",15));
		    C.setTextFill(Color.web("CadetBlue"));
		    C.setFont(new Font("Verdana",15));
		    D.setTextFill(Color.web("CadetBlue"));
		    D.setFont(new Font("Verdana",15));
		    E.setTextFill(Color.web("CadetBlue"));
		    E.setFont(new Font("Verdana",15));
		    F.setTextFill(Color.web("CadetBlue"));
		    F.setFont(new Font("Verdana",15));
		    G.setTextFill(Color.web("CadetBlue"));
		    G.setFont(new Font("Verdana",15));
		    H.setTextFill(Color.web("CadetBlue"));
		    H.setFont(new Font("Verdana",15));
		    I.setTextFill(Color.web("CadetBlue"));
		    I.setFont(new Font("Verdana",15));
		    J.setTextFill(Color.web("CadetBlue"));
		    J.setFont(new Font("Verdana",15));
		    Next.setTextFill(Color.web("CadetBlue"));
		    Next.setFont(new Font("Verdana",15));
		    Back.setTextFill(Color.web("CadetBlue"));
		    Back.setFont(new Font("Verdana",15));
		    
		    abs.setVgap(5);
		    abs.setHgap(5);
		   Value.setTextFill(Color.web("NavajoWhite"));
		   Value.setFont(new Font("Verdana",17));
	   
	    
	    A.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
		        Num.appendText("0");
			}
					
	});
	     B.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
		        Num.appendText("1");
			}
					
	});
	     C.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("2");
				}
						
		});
	     D.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("3");
				}
						
		});
	     E.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("4");
				}
						
		});
	     F.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("5");
				}
						
		});
	     G.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("6");
				}
						
		});
	     H.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("7");
				}
						
		});
	     I.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("8");
				}
						
		});
	     J.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
			        Num.appendText("9");
				}
						
		});
	      
	     
	     Next.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				
				 double z=Double.parseDouble(Num.getText());
				 
				  boolean valid=tran.valid(z);
				
				 if (valid) {
					 tran.withdraw(z);
					Done.setTextFill(Color.web("NavajoWhite"));
				    Done.setFont(new Font("Verdana",17));
				    Done.setText("Done! ");
				 }
				 else {
				    not.setTextFill(Color.web("NavajoWhite"));
					not.setFont(new Font("Verdana",17));
				    not.setText("Not Enough Balance!");
				 } 
				 
				 Num.clear();
			    
			
			}
					
	});
	     Back.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					  not.setText(" ");
					  Done.setText(" ");
			          stage.setScene(homescreen.getScene());
				}
						
		});
	     
	     abs.setStyle("-fx-background-color:CadetBlue ");
	    scene=new Scene(abs,600,400);
	}
	
	
	public void setGui(GUI gui) {
		this.gui = gui;
	}


	
	public Scene getScene() {
		return scene;
	}
	public void setHomescreen(Homescreen homescreen) {
		this.homescreen = homescreen;
	}
	
}
