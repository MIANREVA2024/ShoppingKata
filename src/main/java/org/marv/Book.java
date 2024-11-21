package org.marv;

// Subclase Book que hereda de Product
public  class Book extends Product {

    private String author;
    private String description;
    private double discountPercentage;

    // Constructor con nombre, precio, autor, descripción y descuento
    public Book(String name, double price, String author, String description, double discountPercentage) {
        super(name, price); // Llamada al constructor de la clase base
        this.author = author;
        this.description = description;
        this.discountPercentage = Math.min(discountPercentage, 10); // Limita el descuento a un máximo de 10%
    }

    // Implementación del metodo abstracto para calcular el precio con descuento
    @Override
    public double getDiscountPrice() {
        return getPrice() * (1 - discountPercentage / 100);
    }

    // Getters para obtener los datos específicos del libro
    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
