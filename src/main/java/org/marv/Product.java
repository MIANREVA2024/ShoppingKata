package org.marv;

public abstract class Product {
    //atributos
    private String name;
    private Double price;
//aca pondremos un constructor para iniciar los atributos

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //ponemos getters para acceder a los atributos

    public String getName() {
        return name;
    }
    public  double getPrice() {
        return price;
    }
    public abstract double getDiscountPrice();

}
