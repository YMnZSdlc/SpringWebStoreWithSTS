package pl.sda.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.webstore.domain.repository.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/prod")
    public String list(Model model) {
        model.addAttribute("productsList", productRepository.getAllProducts());
        return "products";
    }


}
