package com.nik.marafon2016.util;

import com.nik.marafon2016.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class General {



    public static Stage menuStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMenuStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene screen = new Scene(fxmlLoader.load(),600, 400);
            stage.setScene((screen));
            stage.setTitle(title);
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaxWidth(620);
            stage.setMaxHeight(450);
            stage.setMaximized(false);
            menuStage=stage;

            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showregberScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showloginScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showRegScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showEndRegScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showRunMenuScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight());
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showVznosScene(String fxmlFileName, String title){
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            menuStage.setScene((scene));
            menuStage.setTitle(title);
            menuStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}