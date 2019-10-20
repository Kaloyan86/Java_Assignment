package store.entities;

public abstract class Card {

    private double turnover;
    private double purchaseValue;

    protected Card(double turnover, double purchaseValue) {
        this.setTurnover(turnover);
        this.setPurchaseValue(purchaseValue);
    }

    public double getTurnover() {
        return turnover;
    }

    private void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    private void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public abstract double discountRate();


}
