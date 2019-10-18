package ru.itpark;

public class OtherTariffs extends Tariff {
    private String amountMinutes;

    public OtherTariffs(int id, String name, String description, String amountInternet, int price, String amountMinutes) {
        super(id, name, description, amountInternet, price);
        this.amountMinutes = amountMinutes;
    }

    @Override
    public String toString() {
        return "OtherTariffs{" + super.toString() +
                "amountMinutes='" + amountMinutes + '\'' +
                '}';
    }
}
