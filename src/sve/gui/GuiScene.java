package sve.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import sve.core.SVEModule;

public class GuiScene extends Application implements EventHandler<ActionEvent>,environmentConstants,SVEModule {
    private FirstScene firstScene = new FirstScene(new Stage());

    @Override
    public void start(Stage primaryStage) {
        primaryStage = firstScene.getStage();

        firstScene.firstSceneCreator();

        primaryStage.setScene(firstScene.getScene());
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void init(){
        launch();
    }

    @Override
    public void update() {

    }

    @Override
    public void finish() {

    }
}




