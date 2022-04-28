import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class main extends Application{
    @Override
    public void start(Stage primaryStage){
        Label lblMonthlyPayment = new Label("Monthly Payment");
        Label lblInterestRate = new Label("Interest Rate");

        Button btnCalculate = new Button("Calculate");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(11.5,12.5,13.5,14.5);
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        lblInterestRateFormat.setTextFill(Color.RED);
        gridPane.add(lblInterestRate,1,2);
        gridPane.setHalignment(lblinterestRate,HPos,RIGHT);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        gridPane.add(actionBtnContainer,1,4);
    }
}
