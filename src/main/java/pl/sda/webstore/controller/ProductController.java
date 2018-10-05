package pl.sda.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.webstore.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/prod")
    public String list(Model model) {
        model.addAttribute("productsList", productService.getAllProducts());
        return "products";
    }


}
