package rocket.app.view;

import java.text.DecimalFormat;

import com.sun.xml.ws.org.objectweb.asm.Label;

import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	@FXML TextField txtCreditScore;
	@FXML TextField txtMortgageAmt;
	@FXML TextField txtIncome;
	@FXML TextField txtExpenses;
	@FXML TextField txtHouseCost;
	@FXML ComboBox<Integer> cmbTerm;
	@FXML Label lblCreditScore;
	@FXML Label lblMortgageAmt;
	@FXML Label lblIncome;
	@FXML Label lblExpenses;
	@FXML Label lblHouseCost;
	@FXML Label lblTerm;






	private TextField txtNew;

	private MainApp mainApp;


	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}


	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Here...");
		alert.setHeaderText("Look, an Information Dialog");
		alert.setContentText(txtNew.getText());
		alert.showAndWait().ifPresent(rs -> {
		    if (rs == ButtonType.OK) {
		        System.out.println("Pressed OK.");
		    }
		});
	}

	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		double p = lRequest.getIncome() * 0.28;
		double a = lRequest.getIncome() - lRequest.getExpenses() * 0.36;
		if (p > a) {
			String newP = new DecimalFormat("%.2f").format(p);
			txtMortgageAmt.setText("Mortgage amount is : ");

		}
		else {
			txtMortgageAmt.setText("House cost too high");
		}

	}
}
