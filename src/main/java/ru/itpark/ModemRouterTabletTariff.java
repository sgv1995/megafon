package ru.itpark;

public class ModemRouterTabletTariff extends Tariff {

    public ModemRouterTabletTariff(int id, String name, String description, String amountInternet, int price) {
        super(id, name, description, amountInternet, price);
    }

    @Override
    public String toString() {
        return "ModemRouterTabletTariff{" + super.toString() + "}";
    }
}
