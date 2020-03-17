package com.lp.springcloud.alibaba.service.impl;

import com.lp.springcloud.alibaba.dao.StorageDao;
import com.lp.springcloud.alibaba.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lp
 * @date 2020/3/17 20:04
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId,count);
    }
}
