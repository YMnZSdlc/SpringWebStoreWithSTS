package pl.sda.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import pl.sda.webstore.domain.Product;
import pl.sda.webstore.domain.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private List<Product> listOfProducts = new ArrayList<Product>();

    public InMemoryProductRepository() {
        Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s, smartfon z 4-calowym ekranem o rozdzielczości 640x1136 i " +
                "8-megapikselowym aparatem");
        iphone.setCategory("Smartfon");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);

        Product laptop_dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
        laptop_dell.setDescription("Dell Inspiron, 14-calowy laptop (czarny) z procesorem Intel Core 3. generacji");
        laptop_dell.setCategory("Laptop");
        laptop_dell.setManufacturer("Dell");
        laptop_dell.setUnitsInStock(1000);

        Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
        tablet_Nexus.setDescription("Google Nexus 7 jest najlżejszym 7-calowym tabletem z 4-rdzeniowym procesorem " +
                "Qualcomm Snapdragon™ S4 Pro");
        tablet_Nexus.setCategory("Tablet");
        tablet_Nexus.setManufacturer("Google");
        tablet_Nexus.setUnitsInStock(1000);

        Product xiaomiBetter = new Product("X1234", "Redmi 4Pro", new BigDecimal(500));
        xiaomiBetter.setDescription("Xiaomi Redmi 4Pro. Ekran 5 cali FULLHD. Patrzę na Was, biednych, przerażonych, " +
                "przyciskającyck telefony do ładowarki. Xiaomi lepszy.");
        xiaomiBetter.setCategory("Smartfon");
        xiaomiBetter.setManufacturer("Xiaomi");
        xiaomiBetter.setUnitsInStock(667);

        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(tablet_Nexus);
        listOfProducts.add(xiaomiBetter);
    }


    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }
}
