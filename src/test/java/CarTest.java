import org.junit.jupiter.api.Test;
import org.marv.Cart;
import org.marv.FoodProduct;
import org.marv.FreeProduct;
import org.marv.Product;

import java.util.List;

import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

public class CarTest {
    @Test
    void canAddProduct() {
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza", 10);

        //añadimos los productos

        cart.addProduct(foodProduct);
        cart.addProduct(foodProduct);
        //then ver que el producto
        List<Product> products = cart.getProducts();
        assert.Equals(1,size)());


    }
    @Test
    void canRemoveProduct() {
        //given ->escenario
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza", 10);
        FreeProduct freeProduct = new FreeProduct("perejil");



    }

    @Test
    void canGetProduct() {
        Cart cart = new Cart();
        FoodProduct foodProduct = new FoodProduct("pizza", 10);
        FreeProduct freeProduct = new FreeProduct("aaaaa", 40);
        pizza.app
        cart.addProduct(pizza);
        cart.addProduct(aaaaa);
        //
    }
}
