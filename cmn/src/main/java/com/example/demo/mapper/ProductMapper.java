package com.example.demo.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value="productMapper")
public interface ProductMapper {
    public List<Product> selectAllProducts();

    int deleteProduct(String pid);

    int addProduct(@Param("product") Product product);

    void deleteProductById(int id);

    void deleteByEntity(@Param("product") Product product);
}
