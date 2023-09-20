package Homeworks.HW_04.JavaFX;

import Homeworks.HW_04.Custom.DataHandler;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends Application {

    BorderPane MAIN_PANE = doSceneSetup();
    Stage MAIN_STAGE;

    @Override
    public void start(Stage primaryStage) throws Exception {
        MAIN_STAGE = primaryStage;
        //Parent root = FXMLLoader.load(getClass().getResource("appTheme.fxml"));
        primaryStage.setTitle("Steven Acosta - HW4 - A Machine Learning Project Using Linked Lists");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(new Scene(MAIN_PANE, 600, 400));
        primaryStage.show();
    }

    private BorderPane doSceneSetup() {

        //CREATE ALL SCENE ITEMS
        //AnchorPane anchorPane = new AnchorPane();
        BorderPane borderPane = new BorderPane();
        Pane pane = new Pane();
        MenuBar menuBar = new MenuBar();
        Menu menuOption = new Menu("File");
        MenuItem menuItem = new MenuItem("Select File");
        FileChooser fileChooser = new FileChooser();
        Label startingWordLabel = new Label("Starting Word:");
        Label lengthLabel = new Label("Length:");
        TextField startingTextField = new TextField();
        TextField lengthTextField = new TextField();
        Button generateButton = new Button("Generate");
        Label outputLabel = new Label("Output");
        TextArea outputTextField = new TextArea();

        setSceneDetails(borderPane, pane, menuBar, menuOption, menuItem, fileChooser, startingWordLabel, lengthLabel, startingTextField, lengthTextField, generateButton, outputLabel, outputTextField);
        setActionable(menuOption, fileChooser, startingTextField, lengthTextField, outputTextField, generateButton);

        return borderPane;
    }

    private void setSceneDetails(BorderPane borderPane, Pane pane, MenuBar menuBar,
                                 Menu menuOption, MenuItem menuItem, FileChooser fileChooser, Label startingWordLabel, Label lengthLabel, TextField startingTextField,
                                 TextField lengthTextField, Button generateButton, Label outputLabel, TextArea outputTextField) {
        menuBar.setPrefWidth(600);
        menuBar.setPrefHeight(25);

        pane.setPrefSize(600, 600);
        pane.setStyle("-fx-background-color:  #141f27");

        startingWordLabel.setFont(new Font(18));
        startingWordLabel.setTextFill(Color.WHITE);
        startingWordLabel.setLayoutX(15);
        startingWordLabel.setLayoutY(15);

        startingTextField.setPromptText("The, Man, Roads, etc...");
        startingTextField.setFont(new Font(18));
        startingTextField.setPrefSize(220, 40);
        startingTextField.setLayoutX(145);
        startingTextField.setLayoutY(10);

        lengthLabel.setFont(new Font(18));
        lengthLabel.setTextFill(Color.WHITE);
        lengthLabel.setLayoutX(375);
        lengthLabel.setLayoutY(15);

        lengthTextField.setPromptText("1, 2, 3, 4, etc...");
        lengthTextField.setFont(new Font(18));
        lengthTextField.setPrefSize(140, 40);
        lengthTextField.setLayoutX(450);
        lengthTextField.setLayoutY(10);

        generateButton.setFont(new Font(36));
        generateButton.setStyle("-fx-background-color:  #57cc59");
        generateButton.setCursor(Cursor.HAND);
        generateButton.setTextFill(Color.WHITE);
        generateButton.setPrefSize(575, 75);
        generateButton.setLayoutX(15);
        generateButton.setLayoutY(55);

        outputLabel.setFont(new Font(18));
        outputLabel.setTextFill(Color.WHITE);
        outputLabel.setLayoutX(15);
        outputLabel.setLayoutY(133);

        outputTextField.setPromptText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
                "commodo consequat.");
        outputTextField.setEditable(false);
        outputTextField.setFont(new Font(18));
        outputTextField.setPrefSize(575, 200);
        outputTextField.setLayoutX(15);
        outputTextField.setLayoutY(160);
        outputTextField.setWrapText(true);
//        outputTextField.setStyle("-fx-wrap-text: true");

        //anchorPane.getChildren().add(borderPane);
        //borderPane.getChildren().add(pane);
        borderPane.setTop(menuBar);
        borderPane.setCenter(pane);
        pane.getChildren().addAll(startingWordLabel, startingTextField, lengthLabel, lengthTextField, generateButton, outputLabel, outputTextField);
        menuOption.getItems().add(menuItem);
        menuBar.getMenus().add(menuOption);
        fileChooser.setTitle("Select Custom File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
    }

    private void setActionable(Menu menuOption, FileChooser fileChooser, TextField startingTextField, TextField lengthTextField, TextArea outputTextField, Button generateButton) {
        menuOption.setOnAction(event -> {
            // TODO: 10/12/2021 LATER ON MAKE IT SO THE SELECTED ITEM IS USED
            try {
                File file = fileChooser.showOpenDialog(MAIN_STAGE);
                System.out.println(file.getAbsolutePath());
            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage());
            }
        });

        generateButton.setOnAction(event -> {
            DataHandler dh = new DataHandler();
            dh.generateList();
            if (!startingTextField.getText().isEmpty() && !lengthTextField.getText().isEmpty()) {
                String text = dh.generateCustomSentenceFromList(startingTextField.getText().toLowerCase(), Integer.parseInt(lengthTextField.getText()));
                saveData(text);
                outputTextField.setText(text);
            } else {
                outputTextField.setText("Check the above fields and make sure you entered acceptable variables.");
            }
        });
    }

    private void saveData(String text) {

        try {
            File file = new File("./src/Homeworks.HW_04/Output/output.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, false);
            //System.out.println("reached 2");
            fileWriter.write(text);
            //System.out.println(file.getAbsolutePath());
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
