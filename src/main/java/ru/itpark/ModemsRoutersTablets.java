package ru.itpark;

public class ModemsRoutersTablets extends Tariff {

    public ModemsRoutersTablets(int id, String name, String description, String amountInternet, int price) {
        super(id, name, description, amountInternet, price);
    }

    @Override
    public String toString() {
        return "ModemsRoutersTablets{" + super.toString() + "}";
    }
}
