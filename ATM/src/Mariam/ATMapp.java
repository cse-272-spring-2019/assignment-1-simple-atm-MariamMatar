package Mariam;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ATMapp extends Application  {

	 ATM login;
		public static void main(String[] args)
		{
			launch(args);
		}
		@Override
		public void start(Stage primaryStage) throws Exception {
			primaryStage.setTitle("ATM");
			Mytransaction obj=new Mytransaction();
			GUI loginform= new GUI(primaryStage,obj);
			Homescreen homescreen=new Homescreen(primaryStage,obj);
			Numbers Number=new Numbers(primaryStage,obj);
			Numdep dep=new Numdep(primaryStage,obj);
			loginform.setHomescreen(homescreen);
			homescreen.setNumbers(Number);
			homescreen.setNumDep(dep);
			Number.setHomescreen(homescreen);
			dep.setHomescreen(homescreen);
			homescreen.preparescene();
			Number.preparescene();
			dep.preparescene();
			loginform.preparescene();
			primaryStage.setScene(loginform.getScene());
			primaryStage.show();
			
}}
