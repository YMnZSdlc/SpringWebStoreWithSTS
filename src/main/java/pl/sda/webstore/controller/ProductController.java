package pl.sda.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.webstore.service.ProductService;

import java.util.List;
import java.util.Map;

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
    public String allProducts(Model model) {
        model.addAttribute("productsList", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model,
                                        @PathVariable("category") String productCategory) {
        model.addAttribute("productsList", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/filter/{ByCriteria}")
    public String getProductByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams,
                                     Model model) {
        model.addAttribute("productsList", productService.getProductsByFilter(filterParams));
        return "products";
    }


}
