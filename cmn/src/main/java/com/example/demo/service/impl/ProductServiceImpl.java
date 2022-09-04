package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProducts() {
        return productMapper.selectAllProducts();
    }

    @Override
    public boolean deleteProduct(String pid) {
        int i = productMapper.deleteProduct(pid);
        return i > 0 ? true : false;
    }



    public int addProduct(Product product){
        return  productMapper.addProduct(product);
    }

    public void deleteProductById(int pid){
        productMapper.deleteProductById(pid);
    }

    @Override
    public void deleteByEntity(Product product) {
        productMapper.deleteByEntity(product);
    }


}
