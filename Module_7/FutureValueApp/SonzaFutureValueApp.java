import javafx.application.Application;
import javafx.geometry.*;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.Pane; 
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class SonzaFutureValueApp extends Application{
    public static void main(String[] args){
        launch(args);
    }

    //@Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Sonza Future Value App");

        Label lblMonthlyPayment = new Label("Monthly Payment:");
        Label lblInterestRate = new Label("Interest Rate:");
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        Label lblYears = new Label("Years:");

        TextField txtMonthlyPayment = new TextField();
        TextField txtInterestRate = new TextField();

        ComboBox<Integer> myComboBox = new ComboBox<Integer>();
        myComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
        myComboBox.setEditable(true);        

        Button btnCalculate = new Button("Calculate");
        Button btnClear = new Button("Clear");

        TextArea textArea = new TextArea();

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(lblMonthlyPayment,0,0);
        gridPane.add(txtMonthlyPayment,1,0);
        gridPane.add(lblInterestRate,0,1);
        gridPane.add(txtInterestRate,1,1);
        lblInterestRateFormat.setTextFill(Color.RED);
        gridPane.add(lblYears,0,3);
        gridPane.add(lblInterestRateFormat,1,2);
        gridPane.setHalignment(lblInterestRateFormat,HPos.RIGHT);
        gridPane.add(myComboBox,1,3);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        final Pane spacer = new Pane();
        spacer.setMinSize(20, 1);
        actionBtnContainer.getChildren().addAll(spacer,btnClear,btnCalculate);
        //actionBtnContainer.getChildren().add(btnCalculate);
        gridPane.add(actionBtnContainer,1,4);
        gridPane.add(textArea,0,5,3,5);

        primaryStage.setScene(new Scene(gridPane, 325, 375));
        primaryStage.show();
    }
}
