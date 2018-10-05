package pl.sda.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import pl.sda.webstore.domain.Product;
import pl.sda.webstore.domain.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private List<Product> listOfProducts = new ArrayList<>();

    public InMemoryProductRepository() {
        Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s, smartfon z 4-calowym ekranem o rozdzielczości 640x1136 i " +
                "8-megapikselowym aparatem");
        iphone.setCategory("Smartfon");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(100);

        Product laptop_dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
        laptop_dell.setDescription("Dell Inspiron, 14-calowy laptop (czarny) z procesorem Intel Core 3. generacji");
        laptop_dell.setCategory("Laptop");
        laptop_dell.setManufacturer("Dell");
        laptop_dell.setUnitsInStock(100);

        Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
        tablet_Nexus.setDescription("Google Nexus 7 jest najlżejszym 7-calowym tabletem z 4-rdzeniowym procesorem " +
                "Qualcomm Snapdragon™ S4 Pro");
        tablet_Nexus.setCategory("Tablet");
        tablet_Nexus.setManufacturer("Google");
        tablet_Nexus.setUnitsInStock(100);

        Product xiaomiBetter = new Product("X1234", "Redmi 4Pro", new BigDecimal(500));
        xiaomiBetter.setDescription("Xiaomi Redmi 4Pro. Ekran 5 cali FULLHD. Patrzę na Was, biednych, przerażonych, " +
                "przyciskającyck telefony do ładowarki. Xiaomi lepszy.");
        xiaomiBetter.setCategory("Smartfon");
        xiaomiBetter.setManufacturer("Xiaomi");
        xiaomiBetter.setUnitsInStock(100);

        Product xiaomiRedmi5 = new Product("X1235", "Redmi 5", new BigDecimal(400));
        xiaomiRedmi5.setDescription("Xiaomi Redmi 5. Ekran 5,5 cali 1440x720. Patrzę na Was, biednych, przerażonych, " +
                "przyciskającyck telefony do ładowarki. Xiaomi lepszy.");
        xiaomiRedmi5.setCategory("Smartfon");
        xiaomiRedmi5.setManufacturer("Xiaomi");
        xiaomiRedmi5.setUnitsInStock(200);

        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(tablet_Nexus);
        listOfProducts.add(xiaomiBetter);
        listOfProducts.add(xiaomiRedmi5);
    }


    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> productsByCategory = new ArrayList<>();

        for (Product product : listOfProducts) {
            if (category.equalsIgnoreCase(product.getCategory())) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    @Override
    public Set<Product> getProductByFilter(Map<String, List<String>> filterParams) {
        Set<Product> productsByBrand = new HashSet<>();
        Set<Product> productsByCategory = new HashSet<>();
        Set<String> criterias = filterParams.keySet();
        if (criterias.contains("brand")) {
            for (String brandName : filterParams.get("brand")) {
                for (Product product : listOfProducts) {
                    if (brandName.equalsIgnoreCase(product.getManufacturer())) {
                        productsByBrand.add(product);
                    }

                }
            }
        }

        if (criterias.contains("category")) {
            for (String category : filterParams.get("category")) {
                productsByCategory.addAll(this.getProductsByCategory(category));
            }
        }

        productsByCategory.retainAll(productsByBrand);
        return productsByCategory;
    }


    @Override
    public Product getProductById(String productId) {
        Product productById = null;
        for (Product product : listOfProducts) {
            if (product != null
                    && product.getProductId() != null
                    && product.getProductId().equalsIgnoreCase(productId)) {
                productById = product;
                break;
            }
        }
        if (productById == null) {
            throw new IllegalArgumentException("Brak produktu o wskazanym id: " + productId);
        }
        return productById;
    }
}
