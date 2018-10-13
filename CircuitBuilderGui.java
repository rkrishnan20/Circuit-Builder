//Developed by Rahul Krishnan
//October 4, 2018

package model;


import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;


@SuppressWarnings("restriction")

public class CircuitBuilderGui extends Application
{	
	@Override
	public void start(Stage stage)
	{
		int sceneWidth = 1000, sceneHeight = 1000;
		
		FlowPane fieldsPane =  new FlowPane();
		BorderPane borderPane = new BorderPane();
		
		
		Button wireButton = new Button("Wire");
		Button resistorButton = new Button("Resistor");
		Button capacitorButton = new Button("Capacitor");
		
		/*find out if possible to iterate through package for class names
		String[] buttonTypes = {"wire", "resistor", "capacitor"*/
		
		//rest of implementation
		
		Scene scene = new Scene(borderPane, sceneWidth, sceneHeight);
		stage.setTitle("Rahul Krishnan's Circuit Builder");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
