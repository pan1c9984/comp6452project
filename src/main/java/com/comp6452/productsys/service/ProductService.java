package com.comp6452.productsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.comp6452.productsys.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Weizhe Pan
 * @date 2023/7/25
 */
@Service
public interface ProductService extends IService<Product> {
    /**
    * @Description:
    * @Param: []
    * @return: com.comp6452.productsys.entity.Product
    * @Author: Weizhe Pan
    * @Date: 2023/7/25
    */
    Product getProductById(Integer productId);

    /**
    * @Description:
    * @Param: [name, location, method, date]
    * @return: boolean
    * @Author: Weizhe Pan
    * @Date: 2023/7/25
    */
    boolean addProduct(String name, String location, String method, Date date);
}
