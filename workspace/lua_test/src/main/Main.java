package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private static Parent root;
	private static Scene scene;
	private static Stage stage;
	
	public static Parent getRoot() {
		return root;
	}
	
	public static Scene getScene() {
		return scene;
	}
	
	public static Stage getPrimaryStage() {
		return stage;
	}
	
	public static void main(String[] args) {	
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
		scene = new Scene(root);
		stage = primaryStage;
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
