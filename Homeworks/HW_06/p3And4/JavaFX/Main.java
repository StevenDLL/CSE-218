package Homeworks.HW_06.p3And4.JavaFX;

import Homeworks.HW_06.p3And4.CheckSpelling;
import Homeworks.HW_06.p3And4.DataHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application {

    BorderPane MAIN_PANE = doSceneSetup();
    Stage MAIN_STAGE;
    DataHandler dataHandler = new DataHandler();

    @Override
    public void start(Stage primaryStage) throws Exception {
        MAIN_STAGE = primaryStage;
        primaryStage.setTitle("Steven Acosta - Searching And Sorting Part 3&4");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(new Scene(MAIN_PANE, 600, 400));
        primaryStage.show();
    }

    private BorderPane doSceneSetup() {

        //CREATE ALL SCENE ITEMS
        BorderPane borderPane = new BorderPane();
        Pane pane = new Pane();
        TextArea inputTextArea = new TextArea();
        TextArea outputTextArea = new TextArea();
        MenuBar menuBar = new MenuBar();
        Menu menuOption = new Menu("File");
        MenuItem selectFile = new MenuItem("Select File");
        MenuItem saveFile = new MenuItem("Save File");
        FileChooser fileChooser = new FileChooser();

        setSceneDetails(borderPane, pane, inputTextArea, outputTextArea, menuBar, menuOption, selectFile, saveFile, fileChooser);
        setActionable(inputTextArea, outputTextArea, selectFile, saveFile, fileChooser);

        return borderPane;
    }

    private void setSceneDetails(BorderPane borderPane, Pane pane, TextArea inputTextArea, TextArea outputTextArea, MenuBar menuBar, Menu menuOption, MenuItem selectFile, MenuItem saveFile, FileChooser fileChooser) {
        pane.getChildren().addAll(inputTextArea, outputTextArea);
        borderPane.getChildren().add(pane);

        menuBar.setPrefWidth(600);
        menuBar.setPrefHeight(25);
        inputTextArea.setPrefSize(280, 360);
        inputTextArea.setLayoutX(15);
        inputTextArea.setLayoutY(30);
        inputTextArea.setPromptText("ENTER WORDS HERE");
        inputTextArea.setWrapText(true);

        outputTextArea.setPrefSize(280, 360);
        outputTextArea.setLayoutX(305);
        outputTextArea.setLayoutY(30);
        outputTextArea.setEditable(false);
        outputTextArea.setWrapText(true);

        borderPane.setTop(menuBar);
        menuOption.getItems().addAll(selectFile, saveFile);
        menuBar.getMenus().add(menuOption);
        fileChooser.setTitle("Files");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
    }

    private void setActionable(TextArea inputTextArea, TextArea outputTextArea, MenuItem selectFile, MenuItem saveFile, FileChooser fileChooser) {
        inputTextArea.setOnKeyTyped(event -> {
            if (event.getCharacter().equals(" ")) {
                outputTextArea.setText(CheckSpelling.checkSpelling(inputTextArea.getText(), this.dataHandler));
            }
        });

        selectFile.setOnAction(event -> {
            try {
                File file = fileChooser.showOpenDialog(MAIN_STAGE);
                StringBuilder fileContent = new StringBuilder();
                if (file != null) {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        fileContent.append(scanner.nextLine()).append(" ");
                    }
                    inputTextArea.setText(fileContent.toString());
                }
                outputTextArea.setText(CheckSpelling.checkSpelling(inputTextArea.getText(), this.dataHandler));
            } catch (NullPointerException | FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
        });

        saveFile.setOnAction(event -> {
            File file = fileChooser.showSaveDialog(MAIN_STAGE);
            if (file != null) {
                String content = inputTextArea.getText();
                this.dataHandler.saveData(content, file);
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
