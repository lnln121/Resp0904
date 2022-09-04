package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有产品
     * @param
     * @return
     */
    public List<Product> getAllProducts();

    boolean deleteProduct(String pid);

    int addProduct(Product product);

    void deleteProductById(int pid);

    void deleteByEntity(Product product);
}
