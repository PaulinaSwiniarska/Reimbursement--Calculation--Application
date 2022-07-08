public abstract class Receipt {
    float fullCostOfReceipt;

    public Receipt(float fullCostOfReceipt) {
        this.fullCostOfReceipt = fullCostOfReceipt;
    }

    public float getFullCostOfReceipt() {
        return fullCostOfReceipt;
    }
}
