package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class NotebookApplication extends Application {
    public void start(Stage stage) {

        Notebook notebook = new Notebook();
        notebook.clearNote();

        BorderPane pane = new BorderPane();
        Button btn = new Button("Clear");

        TextArea notebookTextArea = new TextArea();
        notebookTextArea.setWrapText(true);

        TextField searchTextField = new TextField();
        searchTextField.setOnKeyTyped(event -> {
            System.out.println(event.getCharacter());
            if(event.getCharacter().equals("\r")) {
                ArrayList<Note> notes = notebook.searchNotes(searchTextField.getText());
                for(Note n : notes) {
                    notebookTextArea.setText(notebookTextArea.getText() + "\n\n-----\n\n" +
                            n.getContent());
                }
            }
        });

        HBox topHBox = new HBox();
        topHBox.getChildren().add(btn);
        topHBox.getChildren().add(searchTextField);

        btn.setOnAction(event -> {
            notebook.getCurrentNote().setContent(notebookTextArea.getText());
            notebook.clearNote();
            notebookTextArea.clear();
        });

        pane.setTop(topHBox);
        pane.setCenter(notebookTextArea);

        Scene scene = new Scene(pane, 500, 500);

        stage.setScene(scene);
        stage.setTitle("Notebook");
        stage.show();
    }
}
