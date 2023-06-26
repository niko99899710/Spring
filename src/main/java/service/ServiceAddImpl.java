package service;

import com.example.springspring.Basket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceAddImpl implements ServiceAdd {
    private final Basket basket;
    public ServiceAddImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public void addProducts(List<Integer> productIds) {
        basket.addProducts(productIds);

    }

    @Override
    public List<Integer> getProducts() {
        return basket.getProducts();
    }
}
