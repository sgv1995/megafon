package ru.itpark;

public class OtherTariff extends Tariff {
    private String amountMinutes;

    public OtherTariff(int id, String name, String description, String amountInternet, int price, String amountMinutes) {
        super(id, name, description, amountInternet, price);
        this.amountMinutes = amountMinutes;
    }

    @Override
    public String toString() {
        return "OtherTariff{" + super.toString() +
                "amountMinutes='" + amountMinutes + '\'' +
                '}';
    }
}
