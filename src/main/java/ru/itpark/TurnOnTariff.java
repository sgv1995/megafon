package ru.itpark;

public class TurnOnTariff extends Tariff {
    private int amountMinutes;
    private int amountSMS;
    private int cashback;

    public TurnOnTariff(int id, String name, String description, String amountInternet, int price, int amountMinutes, int amountSMS, int cashback) {
        super(id, name, description, amountInternet, price);
        this.amountMinutes = amountMinutes;
        this.amountSMS = amountSMS;
        this.cashback = cashback;
    }

    @Override
    public String toString() {
        return "TurnOnTariff{" + super.toString() +
                "amountMinutes=" + amountMinutes +
                ", amountSMS=" + amountSMS +
                ", cashback=" + cashback +
                '}';
    }
}
