package store.entities;

public class BronzeCard extends Card {

    public BronzeCard(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double discountRate() {
        if (this.getTurnover() < 100) {
            return 0;
        } else if (this.getTurnover() <= 300) {
            return 0.01;
        } else {
            return 0.025;
        }
    }

}
