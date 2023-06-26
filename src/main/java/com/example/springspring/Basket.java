package com.example.springspring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private  final List <Integer> products = new ArrayList<>();

    public void addProducts (List <Integer> productIds) {
        products.addAll(productIds);
    }

    public  List <Integer> getProducts(){
        return Collections.unmodifiableList(products);
    }
}
