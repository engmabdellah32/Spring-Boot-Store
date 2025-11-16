package com.engmabdellah32.store.carts;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target="totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);
    Cart toEntity(CartDto cartDto);

    @Mapping(target="totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
