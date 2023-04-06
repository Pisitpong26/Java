import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.stage.Stage;

public class Lab12_Pro1 extends Application {
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthPayment = new TextField();
    private TextField tfTotalPayment = new TextField(); 
	private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btLoad = new Button("Load");
    private Button btSave = new Button("Save");

	@Override 
	public void start(Stage primaryStage) {

		GridPane gridPane = new GridPane();
		gridPane.setVgap(5);
		gridPane.setHgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 3, 0);
		gridPane.add(new Label("Number Of Years:"), 0, 1);
		gridPane.add(tfNumberOfYears, 3, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
		gridPane.add(tfLoanAmount, 3, 2);
		gridPane.add(new Label("Monthly Payment:"), 0, 3);
		gridPane.add(tfMonthPayment, 3, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 3, 4);
		gridPane.add(btCalculate, 3, 5);
		gridPane.add(btClear, 3, 5);
		gridPane.add(btLoad, 0, 5);
		gridPane.add(btSave, 0, 5);


		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		GridPane.setHalignment(btClear, HPos.LEFT);
		GridPane.setHalignment(btLoad, HPos.RIGHT);
		GridPane.setHalignment(btSave, HPos.LEFT);

		btCalculate.setOnAction(e -> CalculateLoanPayment());
		btClear.setOnAction(e -> Clear());
		btLoad.setOnAction(e -> {
            try {
                Load();
            } catch (ClassNotFoundException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
		btSave.setOnAction(e -> {
            try {
                Save();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

		Scene scene = new Scene(gridPane,400,250);
		primaryStage.setTitle("LoanCalculator"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

    private void CalculateLoanPayment(){
        double interrest =  Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interrest,year,loanAmount);
        tfMonthPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    private void Clear(){
        tfAnnualInterestRate.clear();
        tfLoanAmount.clear();
        tfMonthPayment.clear();
        tfNumberOfYears.clear();
        tfTotalPayment.clear();
    }

    private void Load() throws IOException, ClassNotFoundException{
        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Loan.dat")));)
        {
            while(true){
                Loan loan = (Loan)input.readObject();
                tfAnnualInterestRate.setText(String.format("%.0f",loan.getAnnualInterestRate()));
                tfNumberOfYears.setText(String.format("%d", loan.getNumberOfYears()));
                tfLoanAmount.setText(String.format("%.0f", loan.getLoanAmount()));
            }
            } catch (Exception e) {

        }

    }

    private void Save() throws IOException{
        double interrest =  Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interrest, year, loanAmount); 

        try( ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("loan.dat")));){
            output.writeObject(loan);
        }
        catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
