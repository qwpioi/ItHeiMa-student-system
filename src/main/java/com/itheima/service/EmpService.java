package com.itheima.service;

import com.itheima.entity.PageBean;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize);
}
