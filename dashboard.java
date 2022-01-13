package Combine.copy;

import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class examplewithinheritance {

	Cat pet = new Cat("Lulu", "~18 months", "Male", "Gray", "Shelter Sri Gombak");
	Kitten pet2 = new Kitten("Molo", "New Born", "Female", "White", "Shelter Sri Gombak");
	Adult pet3 = new Adult("Oliver", "~22 months", "Male", "Orange", "Shelter Sri Gombak");
	Kitten pet4 = new Kitten("Leo", "~2 months", "female", "Black&White", "Shelter Sri Gombak");
	Adult pet5 = new Adult("Simba", "~21 months", "Male", "Dark Orange", "Shelter Sri Gombak");
	Cat pet6 = new Cat("Milo", "~16 months", "Male", "Black & White & Orange", "Shelter Sri Gombak");
	 
	
	
	public Stage dashboard() {
		
//pet 1 dashboard
	    	Image imaged = new Image ("https://upload.wikimedia.org/wikipedia/commons/8/8c/British_Shorthair_cat._Female._18_months_old.jpg");
		ImageView viewimaged = new ImageView(imaged);
		viewimaged.setFitHeight(80);
		viewimaged.setFitWidth(80);
		
		Rectangle rd = new Rectangle();
		rd.setStroke(Color.BLACK);
		rd.setFill(Color.WHITE);
		rd.setHeight(130);
		rd.setWidth(230);
		rd.setArcHeight(20);
		rd.setArcWidth(20);

		GridPane gpane = new GridPane();
		Button butdetails = new Button("See Deatils");
		gpane.add(butdetails,0,1);
		gpane.add(new Text("Name: Lulu\nAge: ~18 Months"), 0, 0);
		gpane.setAlignment(Pos.CENTER);
		gpane.setVgap(10);

		FlowPane fpane = new FlowPane();
		fpane.getChildren().addAll(viewimaged,gpane);
		fpane.setAlignment(Pos.CENTER);
		fpane.setHgap(20);
		
		StackPane spane = new StackPane();
		spane.getChildren().addAll(rd,fpane);
	
//pet 2 dashboard		
		Image imaged2 = new Image ("http://www.saveacat.org/uploads/4/8/4/1/48413975/published/313802.jpg?1623713378");
		ImageView viewimaged2 = new ImageView(imaged2);
		viewimaged2.setFitHeight(80);
		viewimaged2.setFitWidth(80);
	    
		Rectangle rd2 = new Rectangle();
		rd2.setStroke(Color.BLACK);
		rd2.setFill(Color.WHITE);
		rd2.setHeight(130);
		rd2.setWidth(230);
		rd2.setArcHeight(20);
		rd2.setArcWidth(20);

		GridPane gpane2 = new GridPane();
		Button butdetails2 = new Button("See Deatils");
		gpane2.add(butdetails2,0,1); 
		gpane2.add(new Text("Name: Molo\nAge: New Born"), 0, 0);
		gpane2.setAlignment(Pos.CENTER);
		gpane2.setVgap(10);

		FlowPane fpane2 = new FlowPane();
		fpane2.getChildren().addAll(viewimaged2,gpane2);
		fpane2.setAlignment(Pos.CENTER);
		fpane2.setHgap(20);
		
		StackPane spane2 = new StackPane();
		spane2.getChildren().addAll(rd2,fpane2);
	
//pet 3 dashboard		
		Image imaged3 = new Image ("https://i2.wp.com/pawsomekitty.com/wp-content/uploads/Why-are-cats-so-lazy.png?resize=766%2C463");
		ImageView viewimaged3 = new ImageView(imaged3);
		viewimaged3.setFitHeight(80);
		viewimaged3.setFitWidth(80);
	    
		Rectangle rd3 = new Rectangle();
		rd3.setStroke(Color.BLACK);
		rd3.setFill(Color.WHITE);
		rd3.setHeight(130);
		rd3.setWidth(230);
		rd3.setArcHeight(20);
		rd3.setArcWidth(20);

		GridPane gpane3 = new GridPane();
		Button butdetails3 = new Button("See Deatils");
		gpane3.add(butdetails3,0,1);
		gpane3.add(new Text("Name: Oliver\nAge: ~22 months"), 0, 0);
		gpane3.setAlignment(Pos.CENTER);
		gpane3.setVgap(10);

		FlowPane fpane3 = new FlowPane();
		fpane3.getChildren().addAll(viewimaged3,gpane3);
		fpane3.setAlignment(Pos.CENTER);
		fpane3.setHgap(20);
		
		StackPane spane3 = new StackPane();
		spane3.getChildren().addAll(rd3,fpane3);
	    
//pet 4 dashboard		
		Image imaged4 = new Image ("https://i.pinimg.com/564x/de/58/53/de58539915b8f9db2e196da757f5aee3.jpg");
		ImageView viewimaged4 = new ImageView(imaged4);
		viewimaged4.setFitHeight(80);
		viewimaged4.setFitWidth(80);
	    
		Rectangle rd4 = new Rectangle();
		rd4.setStroke(Color.BLACK);
		rd4.setFill(Color.WHITE);
		rd4.setHeight(130);
		rd4.setWidth(230);
		rd4.setArcHeight(20);
		rd4.setArcWidth(20);

		GridPane gpane4 = new GridPane();
		Button butdetails4 = new Button("See Deatils");
		gpane4.add(butdetails4,0,1);
		gpane4.add(new Text("Name: Leo \nAge: ~2 months"), 0, 0);
		gpane4.setAlignment(Pos.CENTER);
		gpane4.setVgap(10);

		FlowPane fpane4 = new FlowPane();
		fpane4.getChildren().addAll(viewimaged4,gpane4);
		fpane4.setAlignment(Pos.CENTER);
		fpane4.setHgap(20);
		
		StackPane spane4 = new StackPane();
		spane4.getChildren().addAll(rd4,fpane4);
	    
//pet 5 dashboard		
		Image imaged5 = new Image ("https://dl5zpyw5k3jeb.cloudfront.net/photos/pets/44763418/1/?bust=1571423223&width=720");
		ImageView viewimaged5 = new ImageView(imaged5);
		viewimaged5.setFitHeight(80);
		viewimaged5.setFitWidth(80);
	    
		Rectangle rd5 = new Rectangle();
		rd5.setStroke(Color.BLACK);
		rd5.setFill(Color.WHITE);
		rd5.setHeight(130);
		rd5.setWidth(230);
		rd5.setArcHeight(20);
		rd5.setArcWidth(20);;

		GridPane gpane5 = new GridPane();
		Button butdetails5 = new Button("See Deatils");
		gpane5.add(butdetails5,0,1);
		gpane5.add(new Text("Name: Simba \nAge: ~21 months"), 0, 0);
		gpane5.setAlignment(Pos.CENTER);
		gpane5.setVgap(10);

		FlowPane fpane5 = new FlowPane();
		fpane5.getChildren().addAll(viewimaged5,gpane5);
		fpane5.setAlignment(Pos.CENTER);
		fpane5.setHgap(20);
		
		StackPane spane5 = new StackPane();
		spane5.getChildren().addAll(rd5,fpane5);
		
	
//pet 6 dashboard		
		Image imaged6 = new Image ("https://i2.wp.com/www.diamondpet.com/wp-content/uploads/2016/09/20160927-PlayKitty_1200x630.jpg?w=1200&ssl=1");
		ImageView viewimaged6 = new ImageView(imaged6);
		viewimaged6.setFitHeight(80);
		viewimaged6.setFitWidth(80);
		
		Rectangle rd6 = new Rectangle();
		rd6.setStroke(Color.BLACK);
		rd6.setFill(Color.WHITE);
		rd6.setHeight(130);
		rd6.setWidth(230);
		rd6.setArcHeight(20);
		rd6.setArcWidth(20);

		GridPane gpane6 = new GridPane();
		Button butdetails6 = new Button("See Deatils");
		gpane6.add(butdetails6,0,1);
		gpane6.add(new Text("Name: Milo\nAge: ~16 months"), 0, 0);
		gpane6.setAlignment(Pos.CENTER);
		gpane6.setVgap(10);

		FlowPane fpane6 = new FlowPane();
		fpane6.getChildren().addAll(viewimaged6,gpane6);
		fpane6.setAlignment(Pos.CENTER);
		fpane6.setHgap(20);
		
		StackPane spane6 = new StackPane();
		spane6.getChildren().addAll(rd6,fpane6);
	   
		GridPane gpane1 = new GridPane();
		
		gpane1.add(spane, 0, 0);
		gpane1.add(spane2, 1, 0);
		gpane1.add(spane3, 2, 0);
		gpane1.add(spane4, 0, 1);
		gpane1.add(spane5, 1, 1);
		gpane1.add(spane6, 2, 1);
		
		gpane1.setAlignment(Pos.CENTER);
		gpane1.setHgap(-130);
		gpane1.setVgap(50);
		
		Button donate = new Button ("DONATE NOW");
		Button login = new Button ("LOGIN NOW");

		HBox laybutton = new HBox(50);
		laybutton.getChildren().addAll(donate, login);
		laybutton.setAlignment(Pos.CENTER);
		
		Label title = new Label("PETS");

		title.setFont(Font.font("Courier",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 80));
		title.setTextAlignment(TextAlignment.JUSTIFY);
		title.setTextFill(Color.BLACK);

		VBox dashboardLaydonate = new VBox(50);
		dashboardLaydonate.getChildren().addAll(title,gpane1,donate);
		dashboardLaydonate.setAlignment(Pos.TOP_CENTER);
		
//FIRST PET
		GridPane mypane = new GridPane();
		StackPane spanepet = new StackPane();
		mypane.setAlignment(Pos.CENTER);
  		mypane.setHgap(15);
  		mypane.setVgap(15);

  		HBox hboxpet = new HBox(5);
  		
  		Image imagepet = new Image ("https://upload.wikimedia.org/wikipedia/commons/8/8c/British_Shorthair_cat._Female._18_months_old.jpg");
  		ImageView viewpet = new ImageView(imagepet);
  		viewpet.setFitHeight(200);
  		viewpet.setFitWidth(200);
  		
  		hboxpet.getChildren().add(viewpet);
  		
		mypane.add(new Label("Name: "), 1, 1);
  		mypane.add(new Label(pet.name), 2, 1);

  		mypane.add(new Label ("Age: "), 1, 2);
  		mypane.add(new Label(pet.age), 2, 2);
  		
  		mypane.add(new Label("Sex: "),1,3);
  		mypane.add(new Label(pet.sex), 2, 3);
  		
  		mypane.add(new Label ("Colours: "), 1,4);
  		mypane.add(new Label(pet.colour), 2, 4);
  	
  		mypane.add(new Label ("Pickup: "), 1,5);
  		mypane.add(new Label(pet.pickup), 2, 5);
  		
  		mypane.add(new Label ("Description: "), 1, 6);
  		mypane.add(new Label(pet.Description()), 2, 6);
  	
  		Button butclosep = new Button ("Close");
  		mypane.add(butclosep,1,7);
  		Button butadoptp = new Button ("Adopt");
  		mypane.add(butadoptp, 2, 7);
	
  		FlowPane fpanepet = new FlowPane();
  		fpanepet.getChildren().addAll(viewpet,mypane);
  		fpanepet.setAlignment(Pos.CENTER);
  		fpanepet.setHgap(50);
  		
  		Rectangle r = new Rectangle(900, 500);
  	    	r.setStroke(Color.BLACK);
  	    	r.setFill(Color.BEIGE);
  	    
  	    	spanepet.getChildren().addAll(r,fpanepet);
  	  
  	    	Scene scenepet = new Scene(spanepet, 1000,600);
  		
  		
//SECOND PET
  	    
		GridPane mypane2 = new GridPane();
  		StackPane spanepet2 = new StackPane();
  		mypane2.setAlignment(Pos.CENTER);
  		mypane2.setHgap(15);
  		mypane2.setVgap(15);
  		
  		HBox hboxpet2 = new HBox(5);
  		
  		Image imagepet2 = new Image ("http://www.saveacat.org/uploads/4/8/4/1/48413975/published/313802.jpg?1623713378");
  		ImageView viewpet2 = new ImageView(imagepet2);
  		viewpet2.setFitHeight(200);
  		viewpet2.setFitWidth(200);
  		
  		hboxpet2.getChildren().add(viewpet2);
  		
		mypane2.add(new Label("Name: "), 1, 1);
  		mypane2.add(new Label(pet2.name), 2, 1);

  		mypane2.add(new Label ("Age: "), 1, 2);
  		mypane2.add(new Label(pet2.age), 2, 2);
  		
  		mypane2.add(new Label("Sex: "),1,3);
  		mypane2.add(new Label(pet2.sex), 2, 3);
  		
  		mypane2.add(new Label ("Colours: "), 1,4);
  		mypane2.add(new Label(pet2.colour), 2, 4);
  	
  		mypane2.add(new Label ("Pickup: "), 1,5);
  		mypane2.add(new Label(pet2.pickup), 2, 5);
  		
  		mypane2.add(new Label ("Description: "), 1, 6);
  		mypane2.add(new Label(pet2.Description()), 2, 6);
  	
  		Button butclosep2 = new Button ("Close");
  		mypane2.add(butclosep2,1,7);
  		Button butadoptp2 = new Button ("Adopt");
  		mypane2.add(butadoptp2, 2, 7);
	
  		FlowPane fpanepet2 = new FlowPane();
  		fpanepet2.getChildren().addAll(viewpet2,mypane2);
  		fpanepet2.setAlignment(Pos.CENTER);
  		fpanepet2.setHgap(50);
  		
  		Rectangle r2 = new Rectangle(900, 500);
  	    	r2.setStroke(Color.BLACK);
  	    	r2.setFill(Color.BEIGE);
  	    
  	    	spanepet2.getChildren().addAll(r2,fpanepet2);
  
  	    	Scene scenepet2 = new Scene(spanepet2, 1000,600);
  	    
 //THIRD PET
		GridPane mypane3 = new GridPane();
		StackPane spanepet3 = new StackPane();
		mypane3.setAlignment(Pos.CENTER);
		mypane3.setHgap(15);
		mypane3.setVgap(15);

		HBox hboxpet3 = new HBox(5);

		Image imagepet3 = new Image ("https://i2.wp.com/pawsomekitty.com/wp-content/uploads/Why-are-cats-so-lazy.png?resize=766%2C463");
		ImageView viewpet3 = new ImageView(imagepet3);
		viewpet3.setFitHeight(200);
		viewpet3.setFitWidth(300);

		hboxpet3.getChildren().add(viewpet3);

		mypane3.add(new Label("Name: "), 1, 1);
		mypane3.add(new Label(pet3.name), 2, 1);

		mypane3.add(new Label ("Age: "), 1, 2);
		mypane3.add(new Label(pet3.age), 2, 2);

		mypane3.add(new Label("Sex: "),1,3);
		mypane3.add(new Label(pet3.sex), 2, 3);

		mypane3.add(new Label ("Colours: "), 1,4);
		mypane3.add(new Label(pet3.colour), 2, 4);

		mypane3.add(new Label ("Pickup: "), 1,5);
		mypane3.add(new Label(pet3.pickup), 2, 5);

		mypane3.add(new Label ("Description: "), 1, 6);
		mypane3.add(new Label(pet3.Description()), 2, 6);

		Button butclosep3 = new Button ("Close");
		mypane3.add(butclosep3,1,7);
		Button butadoptp3 = new Button ("Adopt");
		mypane3.add(butadoptp3, 2, 7);

		FlowPane fpanepet3 = new FlowPane();
		fpanepet3.getChildren().addAll(viewpet3,mypane3);
		fpanepet3.setAlignment(Pos.CENTER);
		fpanepet3.setHgap(50);

		Rectangle r3 = new Rectangle(900, 500);
		r3.setStroke(Color.BLACK);
		r3.setFill(Color.BEIGE);

		spanepet3.getChildren().addAll(r3,fpanepet3);

		Scene scenepet3 = new Scene(spanepet3, 1000,600);
  	  	    
//FOURTH PET
  	  	    
  	  	GridPane mypane4 = new GridPane();
		StackPane spanepet4 = new StackPane();
		mypane4.setAlignment(Pos.CENTER);
  		mypane4.setHgap(15);
  		mypane4.setVgap(15);

  		HBox hboxpet4 = new HBox(5);
  		
  		Image imagepet4 = new Image ("https://i.pinimg.com/564x/de/58/53/de58539915b8f9db2e196da757f5aee3.jpg");
  		ImageView viewpet4 = new ImageView(imagepet4);
  		viewpet4.setFitHeight(200);
  		viewpet4.setFitWidth(200);
  		
  		hboxpet4.getChildren().add(viewpet4);
  		
		mypane4.add(new Label("Name: "), 1, 1);
  		mypane4.add(new Label(pet4.name), 2, 1);

  		mypane4.add(new Label ("Age: "), 1, 2);
  		mypane4.add(new Label(pet4.age), 2, 2);
  		
  		mypane4.add(new Label("Sex: "),1,3);
  		mypane4.add(new Label(pet4.sex), 2, 3);
  		
  		mypane4.add(new Label ("Colours: "), 1,4);
  		mypane4.add(new Label(pet4.colour), 2, 4);
  	
  		mypane4.add(new Label ("Pickup: "), 1,5);
  		mypane4.add(new Label(pet4.pickup), 2, 5);
  		
  		mypane4.add(new Label ("Description: "), 1, 6);
  		mypane4.add(new Label(pet4.Description()), 2, 6);
  	
  		Button butclosep4 = new Button ("Close");
  		mypane4.add(butclosep4,1,7);
  		Button butadoptp4 = new Button ("Adopt");
  		mypane4.add(butadoptp4, 2, 7);
	
  		FlowPane fpanepet4 = new FlowPane();
  		fpanepet4.getChildren().addAll(viewpet4,mypane4);
  		fpanepet4.setAlignment(Pos.CENTER);
  		fpanepet4.setHgap(50);
  		
  		Rectangle r4 = new Rectangle(900, 500);
  	  	r4.setStroke(Color.BLACK);
  	 	r4.setFill(Color.BEIGE);
  	    
  	   	spanepet4.getChildren().addAll(r4,fpanepet4);

  	   	Scene scenepet4 = new Scene(spanepet4, 1000,600);
  	    
//FIFTH PET    
  		GridPane mypane5 = new GridPane();
		StackPane spanepet5 = new StackPane();
		mypane5.setAlignment(Pos.CENTER);
		mypane5.setHgap(15);
		mypane5.setVgap(15);

		HBox hboxpet5 = new HBox(5);
		
		Image imagepet5 = new Image ("https://dl5zpyw5k3jeb.cloudfront.net/photos/pets/44763418/1/?bust=1571423223&width=720");
		ImageView viewpet5 = new ImageView(imagepet5);
		viewpet5.setFitHeight(200);
		viewpet5.setFitWidth(200);
		
		hboxpet5.getChildren().add(viewpet5);
		
		mypane5.add(new Label("Name: "), 1, 1);
		mypane5.add(new Label(pet5.name), 2, 1);

		mypane5.add(new Label ("Age: "), 1, 2);
		mypane5.add(new Label(pet5.age), 2, 2);
		
		mypane5.add(new Label("Sex: "),1,3);
		mypane5.add(new Label(pet5.sex), 2, 3);
		
		mypane5.add(new Label ("Colours: "), 1,4);
		mypane5.add(new Label(pet5.colour), 2, 4);
	
		mypane5.add(new Label ("Pickup: "), 1,5);
		mypane5.add(new Label(pet5.pickup), 2, 5);
		
		mypane5.add(new Label ("Description: "), 1, 6);
		mypane5.add(new Label(pet5.Description()), 2, 6);
	
		Button butclosep5 = new Button ("Close");
  		mypane5.add(butclosep5,1,7);
  		Button butadoptp5 = new Button ("Adopt");
  		mypane5.add(butadoptp5, 2, 7);
	
		FlowPane fpanepet5 = new FlowPane();
		fpanepet5.getChildren().addAll(viewpet5,mypane5);
		fpanepet5.setAlignment(Pos.CENTER);
		fpanepet5.setHgap(50);
		
		Rectangle r5 = new Rectangle(900, 500);
	  	r5.setStroke(Color.BLACK);
	  	r5.setFill(Color.BEIGE);
	    
	  	spanepet5.getChildren().addAll(r5,fpanepet5);

	 	Scene scenepet5 = new Scene(spanepet5, 1000,600);
  	    
//SIXTH PET
	   	GridPane mypane6 = new GridPane();
		StackPane spanepet6 = new StackPane();
		mypane6.setAlignment(Pos.CENTER);
  		mypane6.setHgap(15);
  		mypane6.setVgap(15);

  		HBox hboxpet6 = new HBox(5);
  		
  		Image imagepet6 = new Image ("https://i2.wp.com/www.diamondpet.com/wp-content/uploads/2016/09/20160927-PlayKitty_1200x630.jpg?w=1200&ssl=1");
  		ImageView viewpet6 = new ImageView(imagepet6);
  		viewpet6.setFitHeight(200);
  		viewpet6.setFitWidth(300);
  		
  		hboxpet6.getChildren().add(viewpet6);
  		
		mypane6.add(new Label("Name: "), 1, 1);
  		mypane6.add(new Label(pet6.name), 2, 1);

  		mypane6.add(new Label ("Age: "), 1, 2);
  		mypane6.add(new Label(pet6.age), 2, 2);
  		
  		mypane6.add(new Label("Sex: "),1,3);
  		mypane6.add(new Label(pet6.sex), 2, 3);
  		
  		mypane6.add(new Label ("Colours: "), 1,4);
  		mypane6.add(new Label(pet6.colour), 2, 4);
  	
  		mypane6.add(new Label ("Pickup: "), 1,5);
  		mypane6.add(new Label(pet6.pickup), 2, 5);
  		
  		mypane6.add(new Label ("Description: "), 1, 6);
  		mypane6.add(new Label(pet6.Description()), 2, 6);
  	
  		Button butclosep6 = new Button ("Close");
  		mypane6.add(butclosep6,1,7);
  		Button butadoptp6 = new Button ("Adopt");
  		mypane6.add(butadoptp6, 2, 7);
	
  		FlowPane fpanepet6 = new FlowPane();
  		fpanepet6.getChildren().addAll(viewpet6,mypane6);
  		fpanepet6.setAlignment(Pos.CENTER);
  		fpanepet6.setHgap(50);
  		
  		Rectangle r6 = new Rectangle(900, 500);
  	 	r6.setStroke(Color.BLACK);
  	   	r6.setFill(Color.BEIGE);
  	    
  	   	spanepet6.getChildren().addAll(r6,fpanepet6);

  	  	Scene scenepet6 = new Scene(spanepet6, 1000,600);
		
//ACtion
		Stage primaryStage = new Stage();

		butdetails.setOnAction(e ->primaryStage.setScene(scenepet));
		butdetails2.setOnAction(e ->primaryStage.setScene(scenepet2));
		butdetails3.setOnAction(e ->primaryStage.setScene(scenepet3));
		butdetails4.setOnAction(e ->primaryStage.setScene(scenepet4));
		butdetails5.setOnAction(e ->primaryStage.setScene(scenepet5));
		butdetails6.setOnAction(e ->primaryStage.setScene(scenepet6));


		dashboardLaydonate.setStyle("-fx-background-color: BEIGE;"); 
		Scene myscene = new Scene(dashboardLaydonate, 1000, 600);

		regTest adopt = new regTest();
		Donate donatefx = new Donate();

		butadoptp.setOnAction(e -> adopt.adoption());
		butadoptp2.setOnAction(e -> adopt.adoption());
		butadoptp3.setOnAction(e -> adopt.adoption());
		butadoptp4.setOnAction(e -> adopt.adoption());
		butadoptp5.setOnAction(e -> adopt.adoption());
		butadoptp6.setOnAction(e -> adopt.adoption());

		donate.setOnAction(e -> donatefx.donation());

		butclosep.setOnAction(e ->primaryStage.setScene(myscene));
		butclosep2.setOnAction(e ->primaryStage.setScene(myscene));
		butclosep3.setOnAction(e ->primaryStage.setScene(myscene));
		butclosep4.setOnAction(e ->primaryStage.setScene(myscene));
		butclosep5.setOnAction(e ->primaryStage.setScene(myscene));
		butclosep6.setOnAction(e ->primaryStage.setScene(myscene));

		primaryStage.setTitle("PETS");
		primaryStage.setScene(myscene);	
		primaryStage.show();

		return primaryStage;
	}
}




















