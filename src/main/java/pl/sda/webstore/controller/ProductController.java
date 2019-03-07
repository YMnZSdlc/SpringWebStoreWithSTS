package pl.sda.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import pl.sda.webstore.domain.Product;
import pl.sda.webstore.service.ProductService;

import java.util.*;

@Controller
@RequestMapping("/products")
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

    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") String productId, Model model) {
        model.addAttribute("product", productService.getProductById(productId));
        return "product";
    }

    @RequestMapping("/{category}/{ByPrice}")
    public String filterProducts(Model model, @PathVariable("category") String category,
                                 @MatrixVariable(pathVar = "ByPrice") Map<String, List<String>> priceLimit,
                                 @RequestParam("manufacturer") String manufacturer) {

        List<Product> productsList = new ArrayList<>();
        productsList.addAll(productService.getProductsByCategory(category));
        productsList.addAll(productService.getProductByManufacturer(manufacturer));
        productsList.addAll(productService.getProductsByPrise(priceLimit));

        model.addAttribute("productsList", productsList);
        return "products";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Product newProduct = new Product();
        model.addAttribute("newProduct", newProduct);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct") Product productToBeAdded){
        productService.addProduct(productToBeAdded);
        return "redirect:/products";
    }




}
