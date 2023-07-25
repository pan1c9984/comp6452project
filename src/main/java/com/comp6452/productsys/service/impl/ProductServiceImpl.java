package com.comp6452.productsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comp6452.productsys.entity.Product;
import com.comp6452.productsys.mapper.ProductMapper;
import com.comp6452.productsys.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Weizhe Pan
 * @date 2023/7/25
 */

@Service
public class ProductServiceImpl  extends ServiceImpl<ProductMapper, Product> implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProductById(Integer productId) {
        Product product=this.getById(productId);
        List<Product> productList=new ArrayList<Product>();
        productList.add(product);
        return productList;
    }

    @Override
    public boolean addProduct(String name, String location, String method, Date date) {
        Product product=new Product();
        product.setName(name);
        product.setFarmLocation(location);
        product.setPlantingMethod(method);
        product.setHarvestDate(date);
        return save(product);
    }
}
