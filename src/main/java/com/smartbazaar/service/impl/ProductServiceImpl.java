package com.smartbazaar.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartbazaar.entity.Product;
import com.smartbazaar.exception.ResourceNotFoundException;
import com.smartbazaar.repository.ProductRepository;
import com.smartbazaar.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) { this.repo = repo; }

    @Override
    public Product create(Product p) { return repo.save(p); }

    @Override
    public Product update(Long id, Product p) {
        Product ex = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));
        ex.setName(p.getName()); ex.setCategory(p.getCategory()); ex.setPrice(p.getPrice());
        return repo.save(ex);
    }

    @Override
    public void delete(Long id) { repo.deleteById(id); }

    @Override
    public Product getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found: " + id));
    }

    @Override
    public List<Product> listAll() { return repo.findAll(); }

    @Override
    public List<Product> findByCategory(String category) { return repo.findByCategoryIgnoreCase(category); }
}
