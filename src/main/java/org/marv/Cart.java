package org.marv;

import java.util.ArrayList;
import java.util.List;

// Clase Cart para gestionar los productos en el carrito
public class Cart {
    private List<Product> products;

    // Constructor que inicializa la lista de productos
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Metodo para añadir un producto al carrito (sin duplicados)
    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                // No añadir el producto si ya está en el carrito
                return;
            }
        }
        products.add(product);
    }

    // Metodo para eliminar un producto del carrito por su nombre
    public void removeProduct(String productName) {
        products.removeIf(p -> p.getName().equals(productName));
    }

    // Metodo para obtener la lista de productos en el carrito
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    // Metodo para obtener el coste total del carrito (sumando los precios con descuento)
    public double getTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getDiscountPrice();
        }
        return total;
    }
}
