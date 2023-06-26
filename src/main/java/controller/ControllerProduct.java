package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceAdd;

import java.util.List;

@RestController
@RequestMapping ("/order")
public class ControllerProduct {
    private final ServiceAdd serviceAdd;
    public ControllerProduct(ServiceAdd serviceAdd) {
        this.serviceAdd = serviceAdd;
    }

    @GetMapping ("/add")
    public void addProducts(@RequestParam List <Integer> productIds) {
        serviceAdd.addProducts(productIds);
    }

    @GetMapping ("/get")
    List <Integer> getProducts() {
      return serviceAdd.getProducts();
    }




}
