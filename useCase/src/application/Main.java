package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	 private static final boolean True = false;
	public static void main(String[] args) {
	        launch(args);
	    }
	
	//public void loginOption()
	 @Override
	
	 public void start(Stage primaryStage) {
	        primaryStage.setTitle("Login Page");

	        
	        
	        Button login = new Button("Login");
	        
	        Label messageLabel = new Label();
	        messageLabel.setText("How would you like to Login as?");
	        
	        RadioButton doctor = new RadioButton("Patient");
		    RadioButton patient = new RadioButton("Doctor");
	        
	        ToggleGroup loginAs = new ToggleGroup();
	        doctor.setToggleGroup(loginAs);
	        patient.setToggleGroup(loginAs);
	        
	        
	       login.setOnAction(event -> {
	        	if(doctor.isSelected() == True) {
	        		
	        		switchToDoctorScene(primaryStage);
	        	}else if(patient.isSelected() == True) {
	        		
	        		switchToPatientScene(primaryStage);
	        	}else {

	                showMessage();
	            }
	        });

	        // Creating a grid pane layout
	        GridPane gridPane = new GridPane();
	        gridPane.setPadding(new Insets(20));
	       // gridPane.setAlignment(Pos.CENTER);
	        gridPane.setVgap(10);
	        gridPane.setHgap(10);
	        gridPane.setPrefSize(400, 400);
	        
	        
	        gridPane.add(messageLabel,4,4); 
	        gridPane.add(doctor,4,5);
	        gridPane.add(patient, 4, 6);
	        gridPane.add(login, 4, 7);

	       
	        // Setting up the scene
	        Scene scene = new Scene(gridPane);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	 
	 
	 private void showMessage() {
	        System.out.print("Please choose your login identity");
	    }
	 
	 //public static void 
	 
	 private void switchToDoctorScene(Stage primaryStage) {
	        // Create another scene (replace this with your actual scene creation code)
	        Label welcome = new Label("Welcome to Doctor Page!");
	       // Label identity = new Label("Are you a new or returning patient");
	        GridPane newGrid = new GridPane();
	        Scene lastScene = new Scene(newGrid, 400, 400);
	        
	        Label userNameLabel = new Label("Username:");
	        Label passwordLabel = new Label("Password:");
	        //Label messageLabel = new Label();

	        // Creating text fields
	        TextField usernameField = new TextField();
	        PasswordField passwordField = new PasswordField();

	        // Creating login button
	        Button logButton = new Button("Login");
	        
	        newGrid.add(welcome,1,1);
	       // newGrid.add(identity, 1, 2);
	        newGrid.add(userNameLabel,1,3);
	        newGrid.add(usernameField, 2, 3);
	        newGrid.add(passwordLabel, 1, 4);
	        newGrid.add(passwordField, 2, 4);
	        newGrid.add(logButton,2,7);
	        

	        // Set the new scene to the stage
	        primaryStage.setScene(lastScene);
	    }
	 private void switchToPatientScene(Stage primaryStage) {
	        // Create another scene (replace this with your actual scene creation code)
	        Label welcomeLabel = new Label("Welcome to Patient Page!");
	      //  Label identify = new Label("Please choose your role");
	        GridPane newPane = new GridPane();
	        Scene anotherScene = new Scene(newPane, 400, 400);
	        
	        newPane.add(welcomeLabel, 0, 0);
	        Label userLabel = new Label("Username:");
	        Label passLabel = new Label("Password:");
	        //Label messageLabel = new Label();

	        // Creating text fields
	        TextField userField = new TextField();
	        PasswordField passField = new PasswordField();

	        // Creating login button
	        Button logButton = new Button("Login");
	        
	       // newPane.add(welcomeLabel,1,1);
	       // newGrid.add(identity, 1, 2);
	        newPane.add(userLabel,1,3);
	        newPane.add(userField, 2, 3);
	        newPane.add(passLabel, 1, 4);
	        newPane.add(passField, 2, 4);
	        newPane.add(logButton,2,7);
	        
	     //   newPane.add(identify, 2, 2);
	       

	        // Set the new scene to the stage
	        primaryStage.setScene(anotherScene);
	    }
	 
}
