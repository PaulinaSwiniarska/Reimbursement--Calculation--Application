public class ReimbursementClaimRate {
    private static ReimbursementClaimRate reimbursementClaimRate;
    float rateForDailyAllowance;
    float rateForPersonalCarMileage;

    public ReimbursementClaimRate(float rateForDailyAllowance, float rateForPersonalCarMileage) {
        this.rateForDailyAllowance = rateForDailyAllowance;
        this.rateForPersonalCarMileage = rateForPersonalCarMileage;
    }

    public static ReimbursementClaimRate getInstanceOfReimbursementClaimRate(float rateForDailyAllowance, float rateForPersonalCarMileage){
        if (reimbursementClaimRate == null) {
            reimbursementClaimRate = new ReimbursementClaimRate(rateForDailyAllowance, rateForPersonalCarMileage);
        }

        return reimbursementClaimRate;
    }

    public float getRateForDailyAllowance() {
        return rateForDailyAllowance;
    }

    public void setRateForDailyAllowance(float rateForDailyAllowance) {
        this.rateForDailyAllowance = rateForDailyAllowance;
    }

    public float getRateForPersonalCarMileage() {
        return rateForPersonalCarMileage;
    }

    public void setRateForPersonalCarMileage(float rateForPersonalCarMileage) {
        this.rateForPersonalCarMileage = rateForPersonalCarMileage;
    }
}
