package com.engmabdellah32.store.carts;

public class CartNotFoundException extends RuntimeException {

    public CartNotFoundException() {
        super("Cart not found.");
    }

}
