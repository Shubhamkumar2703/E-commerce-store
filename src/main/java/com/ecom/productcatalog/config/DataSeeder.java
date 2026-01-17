package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        //Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, home, clothing));

        //Create Products
        Product phone = new Product();
        phone.setName("smartPhone");
        phone.setDescription("Latest model smartphone with amazing features ");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(999.99);
        phone.setCategory(electronics);


        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Latest model laptop ,high performance for work and play ");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(9999.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("warm and cool stylish jacket for winter causal and party wear ");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(24.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High-speed blender for smoothies and more masaalas grinding. ");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(299.99);
        blender.setCategory(home);


        productRepository.saveAll(Arrays.asList(phone,laptop,jacket,blender));



    }
}
