package com.chixing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
@Data
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cust_id", type = IdType.AUTO)
    private Integer custId;

    private String custName;

    private Integer custTelno;

    private String custEmail;
}
