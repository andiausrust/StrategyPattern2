package com.andi;

import com.andi.controller.CreditCardAlgorithm;
import com.andi.controller.PaypalAlgorithm;
import com.andi.controller.ShoppingCart;
import com.andi.model.Product;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product("234", 23);
        Product shirt = new Product("123", 33);
        Product trousers = new Product("534", 44);
        Product shoes = new Product("634", 55);

        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);
        shoppingCart.addProduct(trousers);
        shoppingCart.addProduct(shoes);

        shoppingCart.pay(new CreditCardAlgorithm("amayer80@gmail.com", "andi"));
        shoppingCart.pay(new PaypalAlgorithm("familie.mayer@aon.at", "mayer"));
    }
}
