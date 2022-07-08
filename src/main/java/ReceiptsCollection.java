import java.util.ArrayList;
import java.util.List;

public class ReceiptsCollection {

    List<AirPlaneReceipt> airPlaneReceiptList = new ArrayList<>();
    List<HotelReceipt> hotelReceiptList = new ArrayList<>();
    List<OtherReceipt> otherReceiptList = new ArrayList<>();
    List<TaxiReceipt> taxiReceiptList = new ArrayList<>();
    List<TrainReceipt> trainReceiptList = new ArrayList<>();

    public void addReceiptToList(AirPlaneReceipt receipt){
        airPlaneReceiptList.add(receipt);
    }

    public void addReceiptToList(HotelReceipt receipt){
        hotelReceiptList.add(receipt);
    }

    public void addReceiptToList(OtherReceipt receipt){
        otherReceiptList.add(receipt);
    }

    public void addReceiptToList(TaxiReceipt receipt){
        taxiReceiptList.add(receipt);
    }

    public void addReceiptToList(TrainReceipt receipt){
        trainReceiptList.add(receipt);
    }

    public List<AirPlaneReceipt> getAirPlaneReceiptList(){
        return airPlaneReceiptList;
    }

    public List<HotelReceipt> getHotelReceiptList(){
        return hotelReceiptList;
    }

    public List<OtherReceipt> getOtherReceiptList(){
        return otherReceiptList;
    }

    public List<TaxiReceipt> getTaxiReceiptList(){
        return taxiReceiptList;
    }

    public List<TrainReceipt> getTrainReceiptList(){
        return trainReceiptList;
    }

}
