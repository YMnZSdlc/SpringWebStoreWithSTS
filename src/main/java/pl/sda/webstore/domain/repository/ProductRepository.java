package pl.sda.webstore.domain.repository;

import pl.sda.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

}
