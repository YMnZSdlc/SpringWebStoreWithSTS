package pl.sda.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.webstore.domain.Product;
import pl.sda.webstore.domain.repository.ProductRepository;
import pl.sda.webstore.service.ProductService;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductByFilter(filterParams);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public List<Product> getProductByManufacturer(String manufacturer) {
        return productRepository.getProductByManufacturer(manufacturer);
    }

    @Override
    public Set<Product> getProductsByPrise(Map<String, List<String>> priceParams) {
        return productRepository.getProductByPrice(priceParams);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
