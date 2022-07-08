public class ReimbursementLimit {
    private static ReimbursementLimit reimbursementLimit;
    private float reimbursementLimitForHotelReceipts;
    private float reimbursementLimitForAirPlaneReceipts;
    private float reimbursementLimitForTaxiReceipt;
    private float reimbursementLimitForTrainReceipt;
    private float reimbursementLimitForOtherReceipt;

    public ReimbursementLimit(float reimbursementLimitForHotelReceipts, float reimbursementLimitForAirPlaneReceipts,
                              float reimbursementLimitForTaxiReceipt, float reimbursementLimitForTrainReceipt,
                              float reimbursementLimitForOtherReceipt) {
        this.reimbursementLimitForHotelReceipts = reimbursementLimitForHotelReceipts;
        this.reimbursementLimitForAirPlaneReceipts = reimbursementLimitForAirPlaneReceipts;
        this.reimbursementLimitForTaxiReceipt = reimbursementLimitForTaxiReceipt;
        this.reimbursementLimitForTrainReceipt = reimbursementLimitForTrainReceipt;
        this.reimbursementLimitForOtherReceipt = reimbursementLimitForOtherReceipt;
    }

    public static ReimbursementLimit getInstanceOfReimbursementLimit(float reimbursementLimitForHotelReceipts,
                                                                     float reimbursementLimitForAirPlaneReceipts,
                                                                     float reimbursementLimitForTaxiReceipt,
                                                                     float reimbursementLimitForTrainReceipt,
                                                                     float reimbursementLimitForOtherReceipt) {
        if (reimbursementLimit == null) {
            reimbursementLimit = new ReimbursementLimit(reimbursementLimitForHotelReceipts,
                    reimbursementLimitForAirPlaneReceipts, reimbursementLimitForTaxiReceipt,
                    reimbursementLimitForTrainReceipt, reimbursementLimitForOtherReceipt);
        }
        return  reimbursementLimit;
    }
}
