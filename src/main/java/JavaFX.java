import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX extends Application {
    final Pane stac = new Pane();


    public void start(Stage stage) {
        Scene scene = new Scene(new StackPane(), 1200, 800);
        stage.setScene(scene);
        stage.setTitle("RCApplication - Paulina Świniarska");
        stage.getIcons().add(new Image("C:\\Users\\pauli\\Downloads\\Reimbursement Calculation Application\\images\\dolar.png"));
        stage.show();

        ReimbursementClaim reimbursementClaim = new ReimbursementClaim();
        ReceiptsCollection receiptsCollection = new ReceiptsCollection();
        ReimbursementCalculation reimbursementCalculation = new ReimbursementCalculation();

        Button reimbursementClaimButton = new Button();
        Button dailyAllowanceButton = new Button();
        Button personalCarMileageButton = new Button();
        Button receiptButton = new Button();
        dailyAllowanceButton.setText("Ustaw liczbę dni do diety");
        personalCarMileageButton.setText("Ustaw liczbę przejechanych kilometrów");
        reimbursementClaimButton.setText("Stwórz roszczenie o zwrot kosztów");
        receiptButton.setText("Dodaj rachunek");

        Rectangle r1 = new Rectangle(0, 0, 3000, 3000);
        LinearGradient lg1 = new LinearGradient(
                0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE,
                new Stop(0, Color.web("#afafaf")),
                new Stop(1, Color.web("#090909"))
        );
        r1.setFill(lg1);

        TextField dailyAllowanceTextField = new TextField();
        TextField personalCarMileageTextField = new TextField();
        TextField receiptTextField = new TextField();
        Text text = new Text();


        dailyAllowanceTextField.setPromptText("Wpisz liczbę dni");
        personalCarMileageTextField.setPromptText("Wpisz liczbę km");
        receiptTextField.setPromptText("Wpisz wartość rachunku");

        ListView list = new ListView();
        list.setPrefSize(150, 50);
        list.getItems().add("Bilet lotniczy");
        list.getItems().add("Rachunek za hotel");
        list.getItems().add("Taksówka");
        list.getItems().add("Bilet na pociąg");
        list.getItems().add("Inny rechunek");

        dailyAllowanceButton.setOnAction(event -> {
            Dialog dialog1 = new Alert(Alert.AlertType.INFORMATION, dailyAllowanceTextField.getText());
            int numberOfDays = Integer.parseInt(dialog1.getContentText());
            reimbursementClaim.setNumberOfDaysForDailyAllowance(numberOfDays);
            System.out.println(numberOfDays);
        });

        personalCarMileageButton.setOnAction(event -> {
            Dialog dialog1 = new Alert(Alert.AlertType.INFORMATION, personalCarMileageTextField.getText());
            int carMileage = Integer.parseInt(dialog1.getContentText());
            reimbursementClaim.setPersonalCarMileage(carMileage);
            System.out.println(carMileage);
        });

        reimbursementClaimButton.setOnAction(event -> {
            reimbursementClaim.setAirPlaneReceiptList(receiptsCollection.getAirPlaneReceiptList());
            reimbursementClaim.setHotelReceiptList(receiptsCollection.getHotelReceiptList());
            reimbursementClaim.setTaxiReceiptList(receiptsCollection.getTaxiReceiptList());
            reimbursementClaim.setTrainReceiptList(receiptsCollection.getTrainReceiptList());
            reimbursementClaim.setOtherReceiptList(receiptsCollection.getOtherReceiptList());
            text.setText("Całkowity zwrot wynosi: " + reimbursementCalculation
                    .getTotalReimbursement(reimbursementClaim) + " PLN");
            text.setLayoutX(10);
            text.setLayoutY(230);
        });


        receiptButton.setOnAction(event -> {
            Dialog dialog1 = new Alert(Alert.AlertType.INFORMATION, receiptTextField.getText());
            ObservableList selectedIndices = list.getSelectionModel().getSelectedIndices();
            for (Object o : selectedIndices) {
                System.out.println("Wybrano rachunek typu: " + o);
                int i = (Integer) o;
                float cost = Float.parseFloat(dialog1.getContentText());
                if (i == 0) {
                    AirPlaneReceipt receipt = new AirPlaneReceipt(cost);
                    receiptsCollection.addReceiptToList(receipt);
                } else if (i == 1) {
                    HotelReceipt receipt = new HotelReceipt(cost);
                    receiptsCollection.addReceiptToList(receipt);
                } else if (i == 2) {
                    TaxiReceipt receipt = new TaxiReceipt(cost);
                    receiptsCollection.addReceiptToList(receipt);
                } else if (i == 3) {
                    TrainReceipt receipt = new TrainReceipt(cost);
                    receiptsCollection.addReceiptToList(receipt);
                } else if (i == 4) {
                    OtherReceipt receipt = new OtherReceipt(cost);
                    receiptsCollection.addReceiptToList(receipt);
                }
            }
        });

        list.setLayoutX(10);
        list.setLayoutY(70);
        receiptButton.setLayoutX(180);
        receiptButton.setLayoutY(85);
        receiptTextField.setLayoutX(10);
        receiptTextField.setLayoutY(130);
        reimbursementClaimButton.setLayoutX(10);
        reimbursementClaimButton.setLayoutY(190);
        dailyAllowanceButton.setLayoutX(180);
        dailyAllowanceButton.setLayoutY(10);
        dailyAllowanceTextField.setLayoutX(10);
        dailyAllowanceTextField.setLayoutY(10);
        personalCarMileageButton.setLayoutX(180);
        personalCarMileageButton.setLayoutY(40);
        personalCarMileageTextField.setLayoutX(10);
        personalCarMileageTextField.setLayoutY(40);


        stac.getChildren().addAll(r1);
        stac.getChildren().addAll(list);
        stac.getChildren().addAll(text);
        stac.getChildren().addAll(dailyAllowanceTextField);
        stac.getChildren().addAll(personalCarMileageTextField);
        stac.getChildren().addAll(receiptTextField);
        stac.getChildren().addAll(receiptButton);
        stac.getChildren().addAll(reimbursementClaimButton);
        stac.getChildren().addAll(dailyAllowanceButton);
        stac.getChildren().addAll(personalCarMileageButton);
        stage.setScene(new Scene(stac, 700, 300));
        stage.show();

    }
}