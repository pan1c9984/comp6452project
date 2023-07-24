package com.comp6452.productsys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Weizhe Pan
 * @date 2023/7/25
 */
@Data
@TableName("Product")
public class Product implements Serializable {
    @TableId(type = IdType.AUTO)

    private Integer id;
    private String name;
    private String farmLocation;
    private String plantingMethod;
    private Date harvestDate;
}
