import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Engine extends Application {
	private Stage stage;
	
	@Override
	public void start(Stage s) throws Exception {
		stage = s;
        stage.setOnCloseRequest(e -> System.exit(0));
        stage.setTitle("File Copier");
        Scene scene = null;
        try {
            Parent p = (Parent) FXMLLoader.load(Engine.class.getClassLoader().getResource("ui.fxml"));
            scene = new Scene(p);
            stage.setScene(scene);
        } catch (IOException e) {
            System.out.println("Could not open ui window. " + e.getCause());
            System.exit(1);
        }
        if (scene != null) {
            stage.show();
        }

	}
	
	public static void main(String[] args) {
		Application.launch(Engine.class, args);
	}


}
