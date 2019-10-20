package store.entities;

public class GoldCard extends Card {


    public GoldCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double discountRate() {

        double initialDiscountRate = 0.02;
        if (this.getTurnover() >= 100 && this.getTurnover() <= 800) {
            return (this.getTurnover() / 10000) + initialDiscountRate;
        } else if (this.getTurnover() > 800) {
            return 0.1;
        } else {
            return initialDiscountRate;
        }
    }
}
