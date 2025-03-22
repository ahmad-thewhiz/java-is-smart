package com.ahmad.SpringEcom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ahmad.SpringEcom.Model.Product;
import com.ahmad.SpringEcom.Repo.ProductRepo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product(-1));
    }


    public Product addProduct(Product product, MultipartFile image) throws IOException {
        // Re-fetch the product if updating an existing one, or create a new one
        if (product.getId() > 0) {
            Product existingProduct = productRepo.findById(product.getId()).orElse(null);
            if (existingProduct == null) {
                // Product not found, return a 404 response
                throw new RuntimeException("Product not found for update with ID: " + product.getId());
            }

            // Update product details with the latest data
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setBrand(product.getBrand());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setReleaseDate(product.getReleaseDate());
            existingProduct.setAvailability(product.isAvailability());
            existingProduct.setQuantity(product.getQuantity());

            // Set image data
            existingProduct.setImageName(image.getOriginalFilename());
            existingProduct.setImageType(image.getContentType());
            existingProduct.setImageData(image.getBytes());

            return productRepo.save(existingProduct); // Save the updated product
        } else {
//            // For new products, set image and save
            product.setImageName(image.getOriginalFilename());
            product.setImageType(image.getContentType());
            product.setImageData(image.getBytes());
            return productRepo.save(product);
        }
    }

    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return productRepo.save(product);
    }


    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }


    public List<Product> searchProducts(String keyword) {
        return productRepo.searchProducts(keyword);
    }

}
