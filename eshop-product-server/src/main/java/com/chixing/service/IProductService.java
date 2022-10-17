package com.chixing.service;

import com.chixing.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
@SuppressWarnings("all")
public interface IProductService{
    Product getById(Integer proId);
    List<Product> getByList();
}
