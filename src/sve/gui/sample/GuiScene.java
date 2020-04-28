package sve.gui.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiScene extends Application implements EventHandler<ActionEvent> {
    StackPane layout;
    Stage window;
    Scene scene1;

    private static final Integer MAIN_WIDTH = 1280;
    private static final Integer MAIN_HEIGHT = 960;

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;

        firstSceneCreator();
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public void firstSceneCreator() {
        layout = new StackPane();
        scene1 = new Scene(layout, MAIN_WIDTH, MAIN_HEIGHT);
    }


    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



