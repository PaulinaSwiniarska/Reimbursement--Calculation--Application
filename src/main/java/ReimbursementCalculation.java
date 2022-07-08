

public class ReimbursementCalculation {

    ReimbursementClaimRate reimbursementClaimRate = ReimbursementClaimRate
            .getInstanceOfReimbursementClaimRate(15.0F, 0.3F);

    public float getTotalReimbursement(ReimbursementClaim reimbursementClaim) {
        return getFullReimbursementForAirPlane(reimbursementClaim) +
                getFullReimbursementForDailyAllowance(reimbursementClaim) +
                getFullReimbursementForHotel(reimbursementClaim) +
                getFullReimbursementForPersonalCarMileage(reimbursementClaim) +
                getFullReimbursementForTaxi(reimbursementClaim) +
                getFullReimbursementForTrain(reimbursementClaim) +
                getFullReimbursementForOther(reimbursementClaim);
    }

    private float getFullReimbursementForDailyAllowance(ReimbursementClaim reimbursementClaim) {
        return reimbursementClaim.getNumberOfDaysForDailyAllowance() * reimbursementClaimRate.getRateForDailyAllowance();
    }

    private float getFullReimbursementForPersonalCarMileage(ReimbursementClaim reimbursementClaim) {
        return reimbursementClaim.getPersonalCarMileage() * reimbursementClaimRate.getRateForPersonalCarMileage();
    }

    private float getFullReimbursementForAirPlane(ReimbursementClaim reimbursementClaim) {
        try {
            float fullCost = 0;
            for (AirPlaneReceipt receipt : reimbursementClaim.getAirPlaneReceiptList()) {
                fullCost += receipt.getFullCostOfReceipt();
            }
            return fullCost;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    private float getFullReimbursementForHotel(ReimbursementClaim reimbursementClaim) {
        try {
            float fullCost = 0;
            for (HotelReceipt receipt : reimbursementClaim.getHotelReceiptList()) {
                fullCost += receipt.getFullCostOfReceipt();
            }
            return fullCost;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    private float getFullReimbursementForTaxi(ReimbursementClaim reimbursementClaim) {
        try {
            float fullCost = 0;
            for (TaxiReceipt receipt : reimbursementClaim.getTaxiReceiptList()) {
                fullCost += receipt.getFullCostOfReceipt();
            }
            return fullCost;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    private float getFullReimbursementForTrain(ReimbursementClaim reimbursementClaim) {
        try {
            float fullCost = 0;
            for (TrainReceipt receipt : reimbursementClaim.getTrainReceiptList()) {
                fullCost += receipt.getFullCostOfReceipt();
            }
            return fullCost;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    private float getFullReimbursementForOther(ReimbursementClaim reimbursementClaim) {
        try {
            float fullCost = 0;
            for (OtherReceipt receipt : reimbursementClaim.getOtherReceiptList()) {
                fullCost += receipt.getFullCostOfReceipt();
            }
            return fullCost;
        } catch (NullPointerException e) {
            return 0;
        }
    }
}
