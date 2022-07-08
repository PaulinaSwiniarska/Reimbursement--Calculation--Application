// wniosek o zwrot kosztów

// Functional requirements:
// For end user:
//
//o Possibility to create new reimbursement claim
//o Possibility to add 5 receipts from dropdown list to claim refund (e.g. taxi,
//hotel, air ticket, train)
//o Possibility to add days or periods for which the user gets daily allowance
//(with 15$/day rate)
//o Possibility to add personal car mileage (with 0.3 $/km rate)
//o Possibility to calculate total amount of the reimbursement
//
// For administrator:
//
//o Possibility to change rates for daily allowance and mileage
//o Possibility to edit the list of available receipts types
//o Possibility to define reimbursement limits (per receipt type, total
//reimbursement or number of KM)

//Nonfunctional requirements:
//
// Application backend must use only plain JAVA 11. Do not use any framework (Spring,
//Hibernate etc.)
// Application must have at least 1 functional test to check logic of application (jUnit)
// Application must have Read Me file with step by step instruction how to build and test
//your application on Windows System
// Application does not need to have a database
// Creation of basic UI with simple fields to test is sufficient.
// Frontend technology is up you candidate. Must run in newest Chrome/Firefox version


import java.util.List;

//* Bonus - theoretical task (not mandatory):
// Propose a solution on how to integrate into your Java application the possibility to add
//some calculation rules (e.g. limits, total amount of reimbursement based on different
//conditions) using JS scripts.
public class ReimbursementClaim {

private int numberOfDaysForDailyAllowance;
private int personalCarMileage;
private List<AirPlaneReceipt> airPlaneReceiptList;
private List<HotelReceipt> hotelReceiptList;
private List<TaxiReceipt> taxiReceiptList;
private List<TrainReceipt> trainReceiptList;
private List<OtherReceipt> otherReceiptList;

    public ReimbursementClaim() {
    }



    public ReimbursementClaim(int numberOfDaysForDailyAllowance, int personalCarMileage,
                              List<AirPlaneReceipt> airPlaneReceiptList, List<HotelReceipt> hotelReceiptList,
                              List<TaxiReceipt> taxiReceiptList, List<TrainReceipt> trainReceiptList,
                              List<OtherReceipt> otherReceiptList) {
        this.numberOfDaysForDailyAllowance = numberOfDaysForDailyAllowance;
        this.personalCarMileage = personalCarMileage;
        this.airPlaneReceiptList = airPlaneReceiptList;
        this.hotelReceiptList = hotelReceiptList;
        this.taxiReceiptList = taxiReceiptList;
        this.trainReceiptList = trainReceiptList;
        this.otherReceiptList = otherReceiptList;
    }

    public int getNumberOfDaysForDailyAllowance() {
        return numberOfDaysForDailyAllowance;
    }

    public int getPersonalCarMileage() {
        return personalCarMileage;
    }

    public List<AirPlaneReceipt> getAirPlaneReceiptList() {
        return airPlaneReceiptList;
    }

    public List<HotelReceipt> getHotelReceiptList() {
        return hotelReceiptList;
    }

    public List<TaxiReceipt> getTaxiReceiptList() {
        return taxiReceiptList;
    }

    public List<TrainReceipt> getTrainReceiptList() {
        return trainReceiptList;
    }

    public List<OtherReceipt> getOtherReceiptList() {
        return otherReceiptList;
    }

    public void setNumberOfDaysForDailyAllowance(int numberOfDaysForDailyAllowance) {
        this.numberOfDaysForDailyAllowance = numberOfDaysForDailyAllowance;
    }

    public void setPersonalCarMileage(int personalCarMileage) {
        this.personalCarMileage = personalCarMileage;
    }

    public void setAirPlaneReceiptList(List<AirPlaneReceipt> airPlaneReceiptList) {
        this.airPlaneReceiptList = airPlaneReceiptList;
    }

    public void setHotelReceiptList(List<HotelReceipt> hotelReceiptList) {
        this.hotelReceiptList = hotelReceiptList;
    }

    public void setTaxiReceiptList(List<TaxiReceipt> taxiReceiptList) {
        this.taxiReceiptList = taxiReceiptList;
    }

    public void setTrainReceiptList(List<TrainReceipt> trainReceiptList) {
        this.trainReceiptList = trainReceiptList;
    }

    public void setOtherReceiptList(List<OtherReceipt> otherReceiptList) {
        this.otherReceiptList = otherReceiptList;
    }


    @Override
    public String toString() {
        return "ReimbursementClaim{" +
                "numberOfDaysForDailyAllowance=" + numberOfDaysForDailyAllowance +
                ", personalCarMileage=" + personalCarMileage +
                ", airPlaneReceiptList=" + airPlaneReceiptList +
                ", hotelReceiptList=" + hotelReceiptList +
                ", taxiReceiptList=" + taxiReceiptList +
                ", trainReceiptList=" + trainReceiptList +
                ", otherReceiptList=" + otherReceiptList +
                '}';
    }
}
