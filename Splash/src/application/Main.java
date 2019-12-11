package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 
 * @author Javier Muñoz
 * @see Control
 */
public class Main extends Application {
	Stage stage;

	@FXML
	Label logoLabel;
/**
 * Inicia la aplicación y llama al metodo MainWindow
 */
	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;

		MainWindow();

	}
/**
 * Inicia el splash, y es donde se cogen las fuentes para las letras que se van a utilizar
 */
	public void MainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"Splash.fxml"));
			AnchorPane pane = loader.load();
			// Controller myc=loader.getController();
			// myc.main(stage,this);

			Scene scene = new Scene(pane);

			// adding Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Mansalva");
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Satisfy");

			// adding Custom fonts
			Font.loadFont(
					getClass().getResourceAsStream(
							"fuentes/Mansalva-Regular.ttf"), 20);

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
