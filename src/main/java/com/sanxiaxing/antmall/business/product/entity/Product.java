package com.sanxiaxing.antmall.business.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.sanxiaxing.antmall.common.entity.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_product")
public class Product extends CommonEntity {

    /**
     * 商品名字
     */
    private String name;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品单价
     */
    private BigDecimal unitPrice;

    /**
     * 库存数量
     */
    private Integer stockQuanitity;



}