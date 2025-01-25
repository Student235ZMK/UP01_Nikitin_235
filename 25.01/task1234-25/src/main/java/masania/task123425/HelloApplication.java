package masania.task123425;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static javax.swing.JOptionPane.*;


public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scane1;
    private Scene scane2;
    private Scene scane3;
    private Scene scane4;
    private Scene scane5;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scane1 = createScene1();
        scane2 = createScene2();
        scane3 = createScene3();
        scane4 = createScene4();
        scane5 = createScene5();
        primaryStage.setTitle("Практическая работа 6");
        primaryStage.setScene(scane1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Найти среднее геометрическое");
        Label resultLabel = new Label();

        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                int s = 4 / a;
                resultLabel.setText("res = " + Math.sqrt(a * b));
            } catch (ArithmeticException e) {
                resultLabel.setText("Данные некорекны " );
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scane4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scane5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 700, 700);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField Textx1 = new TextField();
        TextField Textx2 = new TextField();
        TextField Textx3 = new TextField();
        TextField Texty1 = new TextField();
        TextField Texty2 = new TextField();
        TextField Texty3 = new TextField();
        Button calcButton = new Button("Найти площадь и периметр ");
        Label resultPerimetr = new Label();
        Label resultPloshad = new Label();
        calcButton.setOnAction(event -> {
            try {

                double x1 = Double.parseDouble(Textx1.getText());
                double x2 = Double.parseDouble(Textx2.getText());
                double x3 = Double.parseDouble(Textx3.getText());
                double y1 = Double.parseDouble(Texty1.getText());
                double y2 = Double.parseDouble(Texty2.getText());
                double y3 = Double.parseDouble(Texty3.getText());
                double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
                double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
                double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                resultPerimetr.setText("Периметр " + (a+b+c));
                double p = (a + b + c) / 2f;
                resultPloshad.setText("Площадь = " + Math.sqrt(p * (p-a) * (p-b) * (c-p)));
            } catch (NumberFormatException e) {
                resultPerimetr.setText("Error ");
                resultPloshad.setText("Error ");
            }

        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scane4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scane5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x1="), Textx1, new Label("x2="), Textx2, new Label("x3 = "), Textx3);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("y1="), Texty1, new Label("y2="), Texty2, new Label("y3 = "), Texty3);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resultPerimetr, resultPloshad, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 700, 700);

    }

    public static void main(String[] args) {
        launch();
    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideTFieldA = new TextField();
        Button calcButton = new Button("Найти ");
        Label resultLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                double pi = 3.14;
                double degrees = 0;
                int a = Integer.parseInt(sideTFieldA.getText());
                if (a >= 0 && a < 2 * pi) {
                    degrees = (a * 180) / pi;
                    resultLabel.setText("a = " + degrees);
                } else { resultLabel.setText("Error");}
            } catch (NumberFormatException e) {
                resultLabel.setText("Error");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scane4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scane5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideTFieldA);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(10, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 700, 700);
    }
    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Найти ");
        Label resultLabel = new Label();

        calcButton.setOnAction(www -> {
            try {
                double J = Double.parseDouble(sideAField.getText());
                double λ = Double.parseDouble(sideBField.getText());
                double L = 1 + 24.86 * Math.pow(10, -2);
                double Jλ = J * λ;
                double D = (L + Math.sin(Jλ) / 2 + Math.cos(Math.pow(λ, 2)) + λ - Math.pow(10, λ));
                resultLabel.setText("D = " + D);
            } catch (ArithmeticException e) {
                resultLabel.setText("Данные некорекны " );
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scane4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scane5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 700, 700);
    }
    private Scene createScene5() {
        Label titleLabel = new Label("Задание 5");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField TextA1 = new TextField();
        TextField TextA2 = new TextField();
        TextField TextB1 = new TextField();
        TextField TextB2 = new TextField();
        TextField TextC1 = new TextField();
        TextField TextC2 = new TextField();
        Button calcButton = new Button("Найти ");
        Label resultx = new Label();
        Label resulty = new Label();
        calcButton.setOnAction(event -> {
            try {

                double A1 = Double.parseDouble(TextA1.getText());
                double A2 = Double.parseDouble(TextA2.getText());
                double B1 = Double.parseDouble(TextB1.getText());
                double B2 = Double.parseDouble(TextB2.getText());
                double C1 = Double.parseDouble(TextC1.getText());
                double C2 = Double.parseDouble(TextC2.getText());
                double d = A1 * B2 - A2 * B1;
                double x = (C1 * B2 - C2 * B1) / d;
                double y = (A1 * C2 - A2 * C1) / d;
                if (d != 0) {
                    resultx.setText("" + x);
                    resulty.setText("" + y);
                } else  {resultx.setText("нет решения ");
                    resulty.setText("нет решения ");}
            } catch (NumberFormatException e) {
                resultx.setText("Error ");
                resulty.setText("Error ");
            }

        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scane4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scane5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("A1="), TextA1, new Label("A2="), TextA2, new Label("B1 = "), TextB1);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("B2="), TextB2, new Label("C1="), TextC1, new Label("C2 = "), TextC2);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resultx, resulty, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 700, 700);

    }
}