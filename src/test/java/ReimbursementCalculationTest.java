import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReimbursementCalculationTest {

    ReimbursementClaim reimbursementClaim = new ReimbursementClaim();
    ReimbursementCalculation reimbursementCalculation = new ReimbursementCalculation();


    @Test
    void shouldReturnFullCostWithAllArraysNotNull() {
        //given
        int numberOfDaysForDailyAllowance = 0;
        int personalCarMileage = 0;
        List<AirPlaneReceipt> airPlaneReceiptList
                = new ArrayList<>(Arrays.asList(new AirPlaneReceipt(10)));
        List<HotelReceipt> hotelReceiptList
                = new ArrayList<>(Arrays.asList(new HotelReceipt (10)));
        List<TaxiReceipt> taxiReceiptList
                = new ArrayList<>(Arrays.asList(new TaxiReceipt(10)));
        List<TrainReceipt> trainReceiptList
                = new ArrayList<>(Arrays.asList(new TrainReceipt(10)));
        List<OtherReceipt> otherReceiptList
                = new ArrayList<>(Arrays.asList(new OtherReceipt(10)));
        //when
        reimbursementClaim.setNumberOfDaysForDailyAllowance(numberOfDaysForDailyAllowance);
        reimbursementClaim.setPersonalCarMileage(personalCarMileage);
        reimbursementClaim.setAirPlaneReceiptList(airPlaneReceiptList);
        reimbursementClaim.setHotelReceiptList(hotelReceiptList);
        reimbursementClaim.setTaxiReceiptList(taxiReceiptList);
        reimbursementClaim.setTrainReceiptList(trainReceiptList);
        reimbursementClaim.setOtherReceiptList(otherReceiptList);
        float totalReimbursement = reimbursementCalculation.getTotalReimbursement(reimbursementClaim);

        //then
        assertEquals(50, totalReimbursement);
    }

    @Test
    void shouldReturnFullCostWithTaxiArrayAsNull() {
        //given
        int numberOfDaysForDailyAllowance = 0;
        int personalCarMileage = 0;
        List<AirPlaneReceipt> airPlaneReceiptList
                = new ArrayList<>(Arrays.asList(new AirPlaneReceipt(10)));
        List<HotelReceipt> hotelReceiptList
                = new ArrayList<>(Arrays.asList(new HotelReceipt (10)));
        List<TaxiReceipt> taxiReceiptList = new ArrayList<>();
        List<TrainReceipt> trainReceiptList
                = new ArrayList<>(Arrays.asList(new TrainReceipt(10)));
        List<OtherReceipt> otherReceiptList
                = new ArrayList<>(Arrays.asList(new OtherReceipt(10)));
        //when
        reimbursementClaim.setNumberOfDaysForDailyAllowance(numberOfDaysForDailyAllowance);
        reimbursementClaim.setPersonalCarMileage(personalCarMileage);
        reimbursementClaim.setAirPlaneReceiptList(airPlaneReceiptList);
        reimbursementClaim.setHotelReceiptList(hotelReceiptList);
        reimbursementClaim.setTaxiReceiptList(taxiReceiptList);
        reimbursementClaim.setTrainReceiptList(trainReceiptList);
        reimbursementClaim.setOtherReceiptList(otherReceiptList);
        float totalReimbursement = reimbursementCalculation.getTotalReimbursement(reimbursementClaim);

        //then
        assertEquals(40, totalReimbursement);
    }

    @Test
    void shouldReturnFullCostOfDailyAllowanceAndPersonalCarMileage() {
        //given
        int numberOfDaysForDailyAllowance = 10;
        int personalCarMileage = 10;
        List<AirPlaneReceipt> airPlaneReceiptList = new ArrayList<>();
        List<HotelReceipt> hotelReceiptList = new ArrayList<>();
        List<TaxiReceipt> taxiReceiptList = new ArrayList<>();
        List<TrainReceipt> trainReceiptList = new ArrayList<>();
        List<OtherReceipt> otherReceiptList = new ArrayList<>();
        //when
        reimbursementClaim.setNumberOfDaysForDailyAllowance(numberOfDaysForDailyAllowance);
        reimbursementClaim.setPersonalCarMileage(personalCarMileage);
        reimbursementClaim.setAirPlaneReceiptList(airPlaneReceiptList);
        reimbursementClaim.setHotelReceiptList(hotelReceiptList);
        reimbursementClaim.setTaxiReceiptList(taxiReceiptList);
        reimbursementClaim.setTrainReceiptList(trainReceiptList);
        reimbursementClaim.setOtherReceiptList(otherReceiptList);
        float totalReimbursement = reimbursementCalculation.getTotalReimbursement(reimbursementClaim);

        //then
        assertEquals(153, totalReimbursement);
    }


}
