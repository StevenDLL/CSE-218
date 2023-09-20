package Homeworks.HW_06.p1.JavaFX;

import Homeworks.HW_06.p1.DataHandler;
import Homeworks.HW_06.p1.Student;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.util.LinkedList;

public class Main extends Application {

    BorderPane MAIN_PANE = doSceneSetup();
    Stage MAIN_STAGE;
    DataHandler dataHandler = new DataHandler();

    @Override
    public void start(Stage primaryStage) throws Exception {
        MAIN_STAGE = primaryStage;
        primaryStage.setTitle("Steven Acosta - p1 - Searching And Sorting");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(new Scene(MAIN_PANE, 600, 400));
        displayAllStudents(MAIN_PANE);
        primaryStage.show();
    }

    private void displayAllStudents(Pane main) {
        Pane temp = (Pane) main.getChildren().get(1);
        TextArea textArea = (TextArea) temp.getChildren().get(10);
        Student[] tempList = dataHandler.getListOfStudents();
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : tempList) {
            stringBuilder.append(student.getStudentInfo()).append("\n");
        }
        textArea.appendText(stringBuilder.toString());
    }

    private BorderPane doSceneSetup() {

        BorderPane borderPane = new BorderPane();
        Pane pane = new Pane();
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        FileChooser fileChooser = new FileChooser();

        //Labels
        Label fNameLabel = new Label("Firstname");
        Label lNameLabel = new Label("Lastname");
        Label gpaLabel = new Label("GPA");
        Label rLabel = new Label("Result(s):");
        Label allLabel = new Label("All Students:");

        //Buttons
        Button searchButton = new Button("Search");
        Button exportResults = new Button("Export Result(s)");

        //TextFields
        TextField fNameTextField = new TextField();
        TextField lNameTextField = new TextField();
        TextField gpaTextField = new TextField();

        //TextAreas
        TextArea resultsTextArea = new TextArea();
        TextArea allTextArea = new TextArea();

        setSceneDetails(borderPane, pane, menuBar, menu, exitItem, fileChooser, fNameLabel, lNameLabel, gpaLabel, rLabel, allLabel, searchButton, exportResults,
                fNameTextField, lNameTextField, gpaTextField, resultsTextArea, allTextArea);
        setActionable(fNameTextField, lNameTextField, gpaTextField, searchButton, exportResults, resultsTextArea, fileChooser, exitItem);

        return borderPane;
    }

    private void setSceneDetails(BorderPane borderPane, Pane pane, MenuBar menuBar, Menu menu, MenuItem exitItem, FileChooser fileChooser, Label fNameLabel, Label lNameLabel,
                                 Label gpaLabel, Label rLabel, Label allLabel, Button searchButton, Button exportResults, TextField fNameTextField, TextField lNameTextField,
                                 TextField gpaTextField, TextArea resultsTextArea, TextArea allTextArea) {
        menuBar.setPrefWidth(600);
        menuBar.setPrefHeight(25);
        menu.getItems().add(exitItem);
        menuBar.getMenus().add(menu);
        borderPane.setTop(menuBar);
        borderPane.setCenter(pane);
        pane.getChildren().addAll(fNameLabel, fNameTextField, lNameLabel, lNameTextField, gpaLabel, gpaTextField, searchButton, rLabel,
                allLabel, resultsTextArea, allTextArea, exportResults);

        fNameLabel.setFont(new Font(18));
        fNameLabel.setLayoutX(15);
        fNameLabel.setLayoutY(7);
        fNameTextField.setLayoutX(98);
        fNameTextField.setLayoutY(7);
        fNameTextField.setPrefSize(118, 25);
        fNameTextField.setPromptText("John");

        lNameLabel.setFont(new Font(18));
        lNameLabel.setLayoutX(225);
        lNameLabel.setLayoutY(7);
        lNameTextField.setLayoutX(312);
        lNameTextField.setLayoutY(7);
        lNameTextField.setPrefSize(118, 25);
        lNameTextField.setPromptText("Doe");

        gpaLabel.setFont(new Font(18));
        gpaLabel.setLayoutX(435);
        gpaLabel.setLayoutY(7);
        gpaTextField.setLayoutX(475);
        gpaTextField.setLayoutY(7);
        gpaTextField.setPrefSize(48, 25);
        gpaTextField.setPromptText("3.5");

        searchButton.setLayoutX(528);
        searchButton.setLayoutY(6);
        searchButton.setPrefSize(60, 20);

        rLabel.setFont(new Font(18));
        rLabel.setLayoutX(14);
        rLabel.setLayoutY(42);
        resultsTextArea.setLayoutX(15);
        resultsTextArea.setLayoutY(68);
        resultsTextArea.setPrefSize(280, 270);
        resultsTextArea.setWrapText(true);
        resultsTextArea.setEditable(false);

        allLabel.setFont(new Font(18));
        allLabel.setLayoutX(304);
        allLabel.setLayoutY(42);
        allTextArea.setLayoutX(305);
        allTextArea.setLayoutY(68);
        allTextArea.setPrefSize(280, 270);
        allTextArea.setWrapText(true);
        allTextArea.setEditable(false);

        exportResults.setLayoutX(14);
        exportResults.setLayoutY(342);
        exportResults.setPrefSize(280, 25);

        fileChooser.setTitle("Files");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
    }

    private void setActionable(TextField fNameTextField, TextField lNameTextField, TextField gpaTextField, Button searchButton, Button exportResults,
                               TextArea resultsTextArea, FileChooser fileChooser, MenuItem exitItem) {
        searchButton.setOnAction(event -> {
            if (fNameTextField.getText().isEmpty() && lNameTextField.getText().isEmpty() && !(gpaTextField.getText().isEmpty())) {
                resultsTextArea.setText("");
                try {
                    double gpa = Double.parseDouble(gpaTextField.getText());
                    LinkedList<Student> result = dataHandler.searchByGpa(gpa);
                    for (int i = 0; i < result.size(); i++) {
                        resultsTextArea.appendText(result.get(i).getStudentInfo() + "\n");
                    }
                    if (result.size() == 0) {
                        resultsTextArea.setText("NO STUDENT WAS FOUND USING THE VALUES YOU ENTERED");
                    }
                } catch (NumberFormatException exception) {
                    resultsTextArea.setText("GPA VALUE IS NOT ACCEPTABLE!");
                }
            } else if (!fNameTextField.getText().isEmpty() && !lNameTextField.getText().isEmpty()) {
                resultsTextArea.setText("");
                String together = fNameTextField.getText() + " " + lNameTextField.getText();
                LinkedList<Student> result = dataHandler.searchByFullName(together);
                for (int i = 0; i < result.size(); i++) {
                    resultsTextArea.appendText(result.get(i).getStudentInfo() + "\n");
                }
                if (result.size() == 0) {
                    resultsTextArea.setText("NO STUDENT WAS FOUND USING THE VALUES YOU ENTERED");
                }
            } else {
                resultsTextArea.setText("CHECK YOUR INPUTS TO MAKE SURE THAT THEY ARE ACCEPTABLE VALUES.");
            }
        });

        exportResults.setOnAction(event -> {
            File file = fileChooser.showSaveDialog(MAIN_STAGE);
            if (file != null) {
                String content = resultsTextArea.getText();
                this.dataHandler.saveData(content, file);
            }
        });

        exitItem.setOnAction(event -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
