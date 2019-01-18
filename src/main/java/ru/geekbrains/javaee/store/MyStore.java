package ru.geekbrains.javaee.store;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyStore {
    private Map<String, MyProduct> products = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new MyProduct(1,"Name1", 111));
        merge(new MyProduct(2,"Name2", 222));
        merge(new MyProduct(3,"Name3", 333));
        merge(new MyProduct(4,"Name4", 444));
        merge(new MyProduct(5,"Name5", 555));
        merge(new MyProduct(6,"Name6", 666));
        merge(new MyProduct(7,"Name7", 777));
        merge(new MyProduct(8,"Name8", 888));
        merge(new MyProduct(9,"Name9", 999));
    }

    public void merge(MyProduct product){
        if (product == null) return;
    }

    public Collection<MyProduct> getProjects() {
        return products.values();
    }
}
