package com.comp6452.productsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comp6452.productsys.entity.Product;
import com.github.yulichang.base.MPJBaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Weizhe Pan
 * @date 2023/7/25
 */
@Repository
public interface ProductMapper extends BaseMapper<Product>, MPJBaseMapper<Product> {
}
