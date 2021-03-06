# Project Name
> Reimbursement Calculation Application

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)



## General Information
The application gives us:
-Possibility to create new reimbursement claim
-Possibility to add 5 receipts from dropdown list to claim refund (e.g. taxi,
hotel, air ticket, train)
-Possibility to add days or periods for which the user gets daily allowance
(with 15$/day rate)
- Possibility to add personal car mileage (with 0.3 $/km rate)
- Possibility to calculate total amount of the reimbursement


## Technologies Used
- Java 11
- Java FX 


## Features
List the ready features here:
-Possibility to create new reimbursement claim
-Possibility to add 5 receipts from dropdown list to claim refund (e.g. taxi,
hotel, air ticket, train)
-Possibility to add days or periods for which the user gets daily allowance
(with 15$/day rate)
- Possibility to add personal car mileage (with 0.3 $/km rate)
- Possibility to calculate total amount of the reimbursement
- Possibility to change rates for daily allowance and mileage (for administrator)
- Possibility to edit the list of available receipts types (for administrator)
- Possibility to define reimbursement limits (per receipt type, total 
reimbursement or number of KM) (for administrator)

## Setup
-Application backend use only plain JAVA 11. Do not use any framework
-Application have at 3 functional test to check logic of application



## Usage
To start the application, we need to run the program (preferably Intelij IDEA)
1.We have created lists in the application, thanks to which we can choose which type of account we want to choose:

ListView list = new ListView();
        list.setPrefSize(150, 50);
        list.getItems().add("Bilet lotniczy");
        list.getItems().add("Rachunek za hotel");
        list.getItems().add("Taksówka");
        list.getItems().add("Bilet na pociąg");
        list.getItems().add("Inny rechunek");
2.We have created a for loop so we can see which account type has been selected:

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
3.We have set up setters that tell us what to enter in a given place:

 dailyAllowanceTextField.setPromptText("Wpisz liczbę dni");
        personalCarMileageTextField.setPromptText("Wpisz liczbę km");
        receiptTextField.setPromptText("Wpisz wartość rachunku");

## Room for Improvement
I should improve code duplication and improve my skills to make the code more readable and more advanced

To do:
- Willingness to participate in an internship that improves my programming skills
- Create more projects

