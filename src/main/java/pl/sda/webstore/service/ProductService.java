package pl.sda.webstore.service;

import pl.sda.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductsByFilter (Map<String, List<String>> filterParams);

    Product getProductById(String productId);

    List<Product>getProductByManufacturer(String manufacturer);

}
