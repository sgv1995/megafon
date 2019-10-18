package ru.itpark;

public class Tariff {
    private int id;
    private String name;
    private String description;
    private String amountInternet;
    private int price;

    public Tariff(int id, String name, String description, String amountInternet, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amountInternet = amountInternet;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amountInternet='" + amountInternet + '\'' +
                ", price=" + price + ", ";
    }
}
