package pl.sda.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.webstore.service.ProductService;

@Controller
@RequestMapping("/prod")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("productsList", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model){
        model.addAttribute("productsList", productService.getAllProducts() );
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory (Model model, @PathVariable("category") String productCategory){
        model.addAttribute("productsList", productService.getProductsByCategory(productCategory));
        return "products";
    }


}
