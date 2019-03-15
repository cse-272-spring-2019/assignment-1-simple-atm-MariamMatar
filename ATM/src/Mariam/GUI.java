package Mariam;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GUI {
	Stage stage;
	Scene scene;
	Homescreen homescreen;
	 ATM login;
	
	Mytransaction tran;
	public GUI(Stage stage,Mytransaction obj) {
		this.tran=obj;
		this.stage=stage;
	}
	public void preparescene(){
		login=new ATM();
		Label Pin=new Label ("Enter Pin Code");
		PasswordField PinCode=new PasswordField ();
		Button Enter =new Button ("Enter");
		Label Valid=new Label();
		
		GridPane abs= new GridPane();
		abs.add(Pin, 0, 1);
		abs.add(PinCode, 1, 1);
		abs.add(Enter,1,2);
		abs.add(Valid,2,3);
		abs.setVgap(10);
		abs.setHgap(8);
		
	    Pin.setTextFill(Color.web("NavajoWhite"));
		Pin.setFont(new Font("Verdana",17));
	    Enter.setTextFill(Color.web("CadetBlue"));
	    Enter.setFont(new Font("Verdana",15));
	    
	    
		Enter.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String pins=PinCode.getText();
				boolean valid= login.login(pins);
				if(valid) {
					stage.setScene(homescreen.getScene());
				}
				else {
					Valid.setTextFill(Color.web("NavajoWhite"));
					Valid.setText("Wrong PinCode!\nPlease Try Again");
					
					Valid.setFont(new Font("Verdana",17));
					
				}
				
			}
		});
		  abs.setStyle("-fx-background-color:CadetBlue ");
		scene=new Scene(abs,600,400);
	}
	public Scene getScene() {
		return this.scene;
	}
	public void setHomescreen(Homescreen homescreen) {
		this.homescreen = homescreen;
	}

}
