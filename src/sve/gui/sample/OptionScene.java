package sve.gui.sample;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OptionScene implements environmentConstants{
    private Scene scene;

    public OptionScene(){
        super();
    }

    public void OptionSceneCreator(Stage stage,FirstScene firstScene){
        TextField mapWidthText = new TextField();
        mapWidthText.setPromptText("Map Width");

        TextField mapHeightText = new TextField();
        mapHeightText.setPromptText("Map Height");

        Label label = new Label("Options");
        label.setId("options");
        label.setTranslateY(-30);

        Button save = new Button("Save");
        save.setTranslateY(30);
        save.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int mapW = Integer.parseInt(mapWidthText.getText());
                int mapH = Integer.parseInt(mapHeightText.getText());
                SecondScene secondScene = new SecondScene(mapW,mapH);
                secondScene.secondSceneCreator();

                firstScene.setSecondScene(secondScene);
            }
        });

        Button back = new Button("Back to Menu");
        back.setAlignment(Pos.TOP_LEFT);
        back.setOnAction(e -> stage.setScene(firstScene.getScene()));

        VBox vbox = new VBox(label,mapWidthText,mapHeightText,save);
        vbox.setAlignment(Pos.CENTER);

        HBox hbox = new HBox(vbox);
        hbox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(hbox);
        borderPane.setTop(back);

        this.scene = new Scene(borderPane,MAIN_WIDTH,MAIN_HEIGHT);
        this.scene.getStylesheets().add("file:src/sve/gui/sample/GameDisplay.css");
    }

    public Scene getScene(){ return scene; }
}
