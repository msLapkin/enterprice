package ru.geekbrains.javaee.store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyProduct {
    private int id;
    private String name;
    private int price;

    public MyProduct(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
