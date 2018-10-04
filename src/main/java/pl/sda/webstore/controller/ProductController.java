package pl.sda.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.webstore.domain.Product;

@Controller
public class ProductController {

    @RequestMapping("/prod")
    public String list(Model model) {
        Product xiaomiBetter = new Product("X1234", "Redmi 4Pro", new BigDecimal(500));
        xiaomiBetter.setDescription("Xiaomi Redmi 4Pro. Ekran 5 cali FULLHD. i takie tam. Xiaomi lepszy.");
        xiaomiBetter.setCategory("Smart Phone");
        xiaomiBetter.setManufacturer("Xiaomi");
        xiaomiBetter.setUnitsInStock(667);
        model.addAttribute("product", xiaomiBetter);
        return "products";
    }


}
