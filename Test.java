import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Test extends Application {
    private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthPayment = new TextField();
    private TextField tfTotalPayment = new TextField(); 
	private Button btCalculate = new Button("Calculate");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create UI
		GridPane gridPane = new GridPane();
		gridPane.setVgap(5);
		gridPane.setHgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 1, 0);
		gridPane.add(new Label("Number Of Years:"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("Monthly Payment:"), 0, 3);
		gridPane.add(tfMonthPayment, 1, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);

		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
		gridPane.setHalignment(btCalculate, HPos.RIGHT);
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		// Process events
		btCalculate.setOnAction(e -> CalculateLoanPayment());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane,400,250);
		primaryStage.setTitle("LoanCalculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

    private void CalculateLoanPayment(){
        double interrest =  Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interrest,year,loanAmount);
        tfMonthPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
