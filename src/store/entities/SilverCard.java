package store.entities;

public class SilverCard extends Card {

    public SilverCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
 public    double discountRate() {
        if (this.getTurnover() > 300) {
            return 0.035;
        } else {
            return 0.02;
        }
    }
}
