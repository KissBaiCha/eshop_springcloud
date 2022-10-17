package com.chixing.service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
@SuppressWarnings("all")
public interface IMyorderService {
    String getById(Integer orderId);
    boolean save(Integer cusId,Integer proId);
}
