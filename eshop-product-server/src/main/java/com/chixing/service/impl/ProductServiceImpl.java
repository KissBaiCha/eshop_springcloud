package com.chixing.service.impl;

import com.chixing.entity.Product;
import com.chixing.mapper.ProductMapper;
import com.chixing.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
@Service
public class ProductServiceImpl implements IProductService {
    private ProductMapper productMapper;
    @Autowired
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product getById(Integer proId) {
        return productMapper.selectById(proId);
    }

    @Override
    public List<Product> getByList() {
        return productMapper.selectList(null);
    }
}
