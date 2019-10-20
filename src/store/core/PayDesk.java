package store.core;

import store.entities.BronzeCard;
import store.entities.Card;
import store.entities.GoldCard;
import store.entities.SilverCard;

import java.util.Scanner;

public class PayDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert card");
        String cardType = scanner.nextLine();

        System.out.println("Enter turnover:");
        double turnover = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter purchase Value:");
        double purchaseValue = Double.parseDouble(scanner.nextLine());

        double discountRate = 0.0;
        double discount = 0.0;
        double total = 0.0;
        Card card;
        switch (cardType) {
            case "Bronze":
                card = new BronzeCard(turnover, purchaseValue);
                discountRate = card.discountRate();
                discount = discount(card.getPurchaseValue(), card.discountRate());
                total = total(discount, card.getPurchaseValue());
                break;
            case "Silver":
                card = new SilverCard(turnover, purchaseValue);
                discountRate = card.discountRate();
                discount = discount(card.getPurchaseValue(), card.discountRate());
                total = total(discount, card.getPurchaseValue());
                break;
            case "Gold":
                card = new GoldCard(turnover, purchaseValue);
                discountRate = card.discountRate();
                discount = discount(card.getPurchaseValue(), card.discountRate());
                total = total(discount, card.getPurchaseValue());
                break;
        }
        System.out.printf("Purchase value: $%.2f\n" +
                "\n" +
                "Discount rate: %.1f%%\n" +
                "\n" +
                "Discount: $%.2f\n" +
                "\n" +
                "Total: $%.2f", purchaseValue, discountRate * 100, discount, total);
    }

    private static double total(double discount, double purchaseValue) {
        return purchaseValue - discount;
    }

    private static double discount(double valueOfPurchase, double discountRate) {
        return valueOfPurchase * discountRate;
    }
}
