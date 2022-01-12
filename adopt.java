package Combine;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public class regTest  {
	

	public Stage adoption() {

		String dates[] = { "1", "2", "3", "4", "5",
	            "6", "7", "8", "9", "10",
	            "11", "12", "13", "14", "15",
	            "16", "17", "18", "19", "20",
	            "21", "22", "23", "24", "25",
	            "26", "27", "28", "29", "30",
	            "31" };
		
		String months[] = { "Jan", "feb", "Mar", "Apr",
	        "May", "Jun", "July", "Aug",
	        "Sup", "Oct", "Nov", "Dec" };
	        
	     String years[] = { "1962", "1963", "1964", "1965",
	    		 "1966", "1967", "1968", "1969", "1970", "1971",
	    		 "1972", "1973", "1974", "1975", "1976", "1977",
	    		 "1978", "1979", "1980", "1981", "1982", "1983",
	    		 "1984", "1985", "1986", "1987", "1988", "1989", 
	    		 "1990", "1991", "1992", "1993", "1994", "1995",
	    		 "1996", "1997", "1998", "1999", "2000", "2001",
	              "2002", "2003", "2004" };
	      
	     
	   
	    	 GridPane pane = new GridPane();
	    	 pane.setAlignment(Pos.CENTER);
//	    	 pane.setGridLinesVisible(true);
	    	 pane.setHgap(15);
	    	 pane.setVgap(12);
	    	 pane.setPadding(new Insets(20, 20, 20,20));
	   
//	    		 
//	     Button donate {
//	         Button donateBtn = new Button("Donate");
//	         donateBtn.setPrefHeight(40);
//	         donateBtn.setDefaultButton(true);
//	         donateBtn.setPrefWidth(100);
//	         GridPane.setHalignment(donateBtn, HPos.CENTER);
//	         
//	         return donateBtn;
//	         }
	     
	  
	 		HBox hbox = new HBox(15);
	 		ToggleGroup tg = new ToggleGroup();
			
			RadioButton r1 = new RadioButton("Yes");
			RadioButton r2 = new RadioButton("No");
			
			r1.setToggleGroup(tg);
			r2.setToggleGroup(tg);
	 	    hbox.getChildren().addAll(r1, r2);
	 	    
	 	    HBox hbox2 = new HBox(15);
	 		ToggleGroup tg2 = new ToggleGroup();
			
			RadioButton r12 = new RadioButton("Yes");
			RadioButton r22 = new RadioButton("No");
			
			r12.setToggleGroup(tg2);
			r22.setToggleGroup(tg2);
	 	    hbox2.getChildren().addAll(r12, r22);
	 	    
	 	 
	    
//	     	ScrollPane scroll(GridPane pane) {
//				ScrollPane scrollPane = new ScrollPane(pane);
//				
//				scrollPane.setPrefSize(600, 200);
//				scrollPane.setContent(pane);
//				scrollPane.setFitToHeight(true);
//				scrollPane.setPannable(true);
//				scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
//	    		 
//				return scrollPane; 
//	    	 }
	    	 
//	    	 private ScrollBar scrollB() {
//	    		 ScrollBar s = new ScrollBar();
//	    		 s.setMin(0);
//	    		 s.setValue(200);;
//	    		 s.setOrientation(Orientation.VERTICAL);
//	    		 s.setValue(110);
//	    		 s.setUnitIncrement(12);
//	    		 s.setBlockIncrement(10);
//	    		 
//	    		 return s;
//	    	 }
		
	
		
//		ScrollPane scrollPane = scroll(grid);
//		ScrollBar scroll = scrollB();
		
			
		Text header = new Text("Contact Information");
		header.setFont(Font.font("Arial", FontWeight.LIGHT, 25));
		pane.add(header, 0, 0);
		
		Label labName = new Label("Full Name: ");
		pane.add(labName , 0, 1);
		
		TextField txtName = new TextField();
		txtName.setPrefWidth(500);
		pane.add(txtName, 1, 1);
		
		Label labPhone = new Label("Phone Number: ");
		pane.add(labPhone, 0, 2);
		
		TextField txtPhone = new TextField();
		pane.add(txtPhone, 1, 2);
		
		Label labGender = new Label("Gender: ");
		pane.add(labGender , 0, 3);
	     
		HBox hboxsex = new HBox(15);
		ToggleGroup group = new ToggleGroup();  
	    RadioButton male = new RadioButton("Male");
	    male.setToggleGroup(group); 
	    RadioButton female = new RadioButton("Female"); 
	    female.setToggleGroup(group);
	    hboxsex.getChildren().addAll(male, female);
	    pane.add(hboxsex, 1, 3);
	    
	    Label labdob = new Label("Date of Birth: ");
	    pane.add(labdob, 0, 4);
	    
	    HBox hbox1 = new HBox(15);
	    ComboBox dobDates = new ComboBox(FXCollections.
	    		observableArrayList(dates));
	    dobDates.setPromptText("Day");
	    
	    ComboBox dobMonths = new ComboBox(FXCollections.
	    		observableArrayList(months));
	    dobMonths.setPromptText("Month");
	    
	    ComboBox dobYears = new ComboBox(FXCollections.
	    		observableArrayList(years));
	    dobYears.setPromptText("Year");
	    hbox1.getChildren().addAll(dobDates, dobMonths, dobYears);
	    pane.add(hbox1, 1, 4);
	    
	    Label labAddr = new Label("Address: ");
	    pane.add(labAddr, 0, 5);
	    
	    TextField txtAddr = new TextField();
		txtAddr.setPrefWidth(100);
		txtAddr.setPrefHeight(20);
		pane.add(txtAddr, 1, 5);
	    
	    Label labEmail = new Label("Email: ");
	    pane.add(labEmail, 0, 6);
	    
	    TextField txtEmail = new TextField();
		pane.add(txtEmail, 1, 6);
		
	    
		
		Text section1 = new Text("About pet's new family");
		section1.setFont(Font.font("Arial", FontWeight.LIGHT, 25));
		pane.add(section1, 0, 8);
		
		Label labReason = new Label("Why are you interested "
				+ "in finding new pet?");
	    pane.add(labReason, 0, 10);
	    
	    TextField txtReason = new TextField();
	  		pane.add(txtReason, 1, 10);
		

	  		Label labFirstCat = new Label("is this your first time"
				+ " raising a pet? ");
	    pane.add(labFirstCat, 0, 11);
	    
	    //adding yes or no
//	    HBox confirm = answer();
	    pane.add(hbox, 1, 11);
	    

		Label labAdults = new Label("How many people in your home? ");
	    pane.add(labAdults, 0, 12);
    
	    HBox person = new HBox(15);
	    TextField txtAdult = new TextField();
	    txtAdult.setPromptText("Adult");

		TextField txtChildren = new TextField();
	    txtChildren.setPromptText("Children");
	    person.getChildren().addAll(txtAdult, txtChildren);
	    pane.add(person, 1, 12);
	   
		
		Label labAllergyOwner = new Label("Does anyone in your house have allergies to "
			+ "either cat or dog? ");
	    pane.add(labAllergyOwner, 0, 13);
	    
//	    HBox confirm1 = answer();
	    pane.add(hbox2, 1, 13);
		
		//Insert calendar
		Label adoptDate = new Label("Enter date to adopt the pet from the shelter: ");
	    pane.add(adoptDate, 0, 14);
	    
	    HBox adopt = new HBox(15);
		ComboBox adoptDay = new ComboBox(FXCollections.
	    		observableArrayList(dates));
	    adoptDay.setPromptText("Day");
	    
	    ComboBox adoptMonth = new ComboBox(FXCollections.
	    		observableArrayList(months));
	    adoptMonth.setPromptText("Month");
	    
	    adopt.getChildren().addAll(adoptDay, adoptMonth);
	    pane.add(adopt, 1, 14);
	    
		
		//Insert agreement for user
		CheckBox agreement = new CheckBox("Do ypu agree to treat the adopted pet "
				+ "with love as a living being?");
		HBox checkbox = new HBox(agreement);
		pane.add(checkbox, 0, 15);
//		
//		//submit button and option button
//		
		Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        pane.add(submitButton, 1, 16);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0, 20,0));
        
        pane.setStyle("-fx-background-color: BEIGE;"); 
        
        Scene scene = new Scene(pane);
		Stage adoptstage = new Stage();
		
		
		adoptstage.setTitle("Adoption Application");
		adoptstage.setScene(scene);
		adoptstage.show();
		
        

        submitButton.setOnAction(e -> {
                if(txtName.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(txtEmail.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Form Error!", "Please enter your e-mail");
                    return;
                }
                if(txtPhone.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Form Error!", "Please enter your phone Number");
                    return;
                }
                if(!agreement.isSelected()) {
                    showAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Form Error!", "Please tick the agreement");
                    return;
                }

               showAlert(Alert.AlertType.CONFIRMATION, pane.getScene().getWindow(), "Registration Successful!", "Welcome " + txtName.getText());

                
                
                
        	}
        );
        
	

        return adoptstage;
	}
	
	
	
	
	

	private void showAlert (Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
         
    }
	
         
    }

