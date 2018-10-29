package pl.sda.webstore.domain.repository;

import pl.sda.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductByFilter (Map<String, List<String>> filterParams);

    Product getProductById(String productId);

    List<Product> getProductByManufacturer (String manufacturer);

    Set<Product> getProductByPrice (Map<String, List<String>> priceParams);

    void addProduct(Product product);

}
