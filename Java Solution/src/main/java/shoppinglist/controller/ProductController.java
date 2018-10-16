package shoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shoppinglist.bindingModel.ProductBindingModel;
import shoppinglist.entity.Product;
import shoppinglist.repository.ProductRepository;

import java.util.List;

@Controller
public class ProductController {

	private final ProductRepository productRepository;

	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String index(Model model) {
	 List <Product> products = productRepository.findAll();
         
         model.addAttribute("products", products);
         model.addAttribute("view", "product/index");

        return "base-layout";
	}

	@GetMapping("/create")
	public String create(Model model) {
         model.addAttribute("view", "product/create");
            return "base-layout";
	}

	@PostMapping("/create")
	public String createProcess(Model model, ProductBindingModel productBindingModel) {
		if (productBindingModel ==  null){
            return "redirect:/";
        }
        
        
        
        Product products = new Product(productBindingModel.getPriority(),
                productBindingModel.getName()
                ,productBindingModel.getQuantity()
                ,productBindingModel.getStatus());
        
        if (products.getName().equals("") ){
            return "redirect:/";
        }
        
        productRepository.saveAndFlush(products);

        return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
            Product product = productRepository.findOne(id);
            if (product == null){
            return "redirect:/";
            }
            model.addAttribute("view", "product/edit");
            model.addAttribute("product", product);
            
		return "base-layout";
                
	}

	@PostMapping("/edit/{id}")
	public String editProcess(Model model, @PathVariable int id, ProductBindingModel productBindingModel) {
           Product product = productRepository.findOne(id);
           
           if (product == null){
               
           }
          
            
            
            productRepository.saveAndFlush(product);
            
		return "base-layout";
	}
}
