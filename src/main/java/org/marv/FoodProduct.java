package org.marv;

public class FoodProduct extends Product {

    private double  discountPercentaje;

    //creamos el constructor con nombre, precio y el descuento

    public FoodProduct(String name, double price, double discountPercentaje) {
        super(name, price); //aca llamamos al constructor de la clase base que es product
        this.discountPercentaje = discountPercentaje;
    }

    //aca implementamos el metodo para calcular el precio con descuento
    @Override
    public double getDiscountPrice() {
        return getPrice() * discountPercentaje;
    }
}

