package Combine;

import java.util.Optional;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class Donate {

  public Stage donation() {

    Text TLabel = new Text("Donation Information");

    //Text field for name 
    TextField TText = new TextField();

    //Label for Donation
    Text DonatLabel = new Text("Donation ");

    //Toggle button for reservation 
    ToggleButton Reservation = new ToggleButton();
    ToggleButton yes = new ToggleButton("Yes");
    ToggleButton no = new ToggleButton("No");
    ToggleGroup groupReservation = new ToggleGroup();
    yes.setToggleGroup(groupReservation);
    no.setToggleGroup(groupReservation);

    //Label for name 
    Text nameLabel = new Text("Name");

    //Text field for name 
    TextField nameText = new TextField();

    //Label for no phone 
    Text NophoneLabel = new Text("No.Phone");

    //Text field for no phone
    TextField NophoneText = new TextField();

    //Label for date of birth 
    Text dobLabel = new Text("Date of birth");

    //date picker to choose type 
    DatePicker datePicker = new DatePicker();

    //Label for choose type
    Text TypeLabel = new Text("Type");

    //Label for donation information
    Text expLabel = new Text("Donation in (RM)");

    //Text field for donation information 
    TextField expText = new TextField();

    //Choice box for Gender
    ChoiceBox TypeLabelchoiceBox = new ChoiceBox();
    TypeLabelchoiceBox.getItems().addAll("Individual", "Company");

    //Label for register 
    Button button2Dnt = new Button("Donate");

    //Creating a Grid Pane 
    GridPane gridPane = new GridPane();

    //Setting size for the pane 
    gridPane.setMinSize(700, 700);

    //Setting the padding    
    gridPane.setPadding(new Insets(20, 20, 20, 20));

    //Setting the vertical and horizontal gaps between the columns 
    gridPane.setVgap(15);
    gridPane.setHgap(15);

    //Setting the Grid alignment 
    gridPane.setAlignment(Pos.CENTER);

    //Arranging all the nodes in the grid 

    gridPane.add(TLabel, 0, 0);

    gridPane.add(DonatLabel, 0, 1);
    gridPane.add(yes, 1, 1);
    gridPane.add(no, 2, 1);

    gridPane.add(nameLabel, 0, 2);
    gridPane.add(nameText, 1, 2);

    gridPane.add(NophoneLabel, 0, 3); //text
    gridPane.add(NophoneText, 1, 3); // layout

    gridPane.add(dobLabel, 0, 4);
    gridPane.add(datePicker, 1, 4);

    gridPane.add(TypeLabel, 0, 5);
    gridPane.add(TypeLabelchoiceBox, 1, 5);

    gridPane.add(expLabel, 0, 6);
    gridPane.add(expText, 1, 6);

    gridPane.add(button2Dnt, 2, 8);

    //Styling nodes   

    TLabel.setStyle("-fx-font: normal bold 24px 'Arial' ");
    DonatLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    NophoneLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    TypeLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    expLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
    // TLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

    button2Dnt.setOnAction(e -> new NewStage());

    //Setting the back ground color 
    gridPane.setStyle("-fx-background-color: BEIGE;");

    Stage stage = new Stage();

    //Creating a scene object 
    Scene scene = new Scene(gridPane, 900, 600);

    //Setting title to the Stage 
    stage.setTitle("Donation Form");

    //Adding scene to the stage 
    stage.setScene(scene);

    //Displaying the contents of the stage 
    stage.show();

    return stage;
  }

}

class NewStage {

  NewStage() {
    Stage subStage = new Stage();
    subStage.setTitle("Alert!");

    FlowPane root = new FlowPane();
    root.setAlignment(Pos.CENTER);

    Text mytext = new Text(20, 20, "Donation Succesful");
    mytext.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 20));
    root.getChildren().add(mytext);

    Scene scene = new Scene(root, 300, 200);

    subStage.setScene(scene);
    subStage.show();
  }
}
