
package com.mayank.springbootcartservice.services;


import com.mayank.springbootcartservice.modals.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllProducts();

    Cart getCart(long id);

    List<Cart> inDateRange(String start, String end);

    List<Cart> userCart(long userId);


    void addNewCart(Cart cart);

    void updateProduct(Cart cart);

    void deleteCart(long id);
}
