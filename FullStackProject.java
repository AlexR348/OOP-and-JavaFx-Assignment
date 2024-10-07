package com.example.javafxassignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FullStackProject extends Application {

    @Override
    public void start(Stage primaryStage) {
        // MenuBar with Menu and MenuItem
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu themeMenu = new Menu("Theme");
        Menu helpMenu = new Menu("Help");

        menuBar.getMenus().addAll(fileMenu, editMenu, themeMenu, helpMenu);

        // Image of a person on the left
        Image image = new Image(getClass().getResource("download1.png").toExternalForm());  // Replace with your image file
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);  // Set the desired width
        imageView.setFitHeight(100); // Set the desired height
        imageView.setPreserveRatio(true);

        // TableView setup
        TableView tableView = new TableView();
        TableColumn<String, String> colID = new TableColumn<>("ID");
        TableColumn<String, String> colFirstName = new TableColumn<>("First Name");
        TableColumn<String, String> colLastName = new TableColumn<>("Last Name");
        TableColumn<String, String> colDepartment = new TableColumn<>("Department");
        TableColumn<String, String> colMajor = new TableColumn<>("Major");
        TableColumn<String, String> colEmail = new TableColumn<>("Email");

        tableView.getColumns().addAll(colID, colFirstName, colLastName, colDepartment, colMajor, colEmail);

        // Form inputs
        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Last Name");

        TextField departmentField = new TextField();
        departmentField.setPromptText("Department");

        TextField majorField = new TextField();
        majorField.setPromptText("Major");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField imageURLField = new TextField();
        imageURLField.setPromptText("imageURL");

        // Buttons
        Button clearButton = new Button("Clear");
        Button addButton = new Button("Add");
        Button deleteButton = new Button("Delete");
        Button editButton = new Button("Edit");

        VBox formBox = new VBox(10, lastNameField, departmentField, majorField, emailField, imageURLField, clearButton, addButton, deleteButton, editButton);
        formBox.setStyle("-fx-background-color: #90EE90;");  // Example green color

        // Main layout with Image, TableView, and Form
        VBox leftBox = new VBox(imageView, tableView);  // Add image and TableView together

        HBox mainLayout = new HBox(10, leftBox, formBox);  // Organize left (image + table) and right (form)

        VBox root = new VBox(menuBar, mainLayout);

        // Create Scene and load CSS
        Scene scene = new Scene(root, 800, 600);

        // Add this line to link the CSS file
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Full Stack Project");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
