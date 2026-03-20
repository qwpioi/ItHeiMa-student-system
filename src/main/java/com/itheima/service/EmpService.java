package com.itheima.service;

import com.itheima.entity.EmpQueryParam;
import com.itheima.entity.PageBean;

public interface EmpService {
    /**
     * 分页条件查找
     * @param param
     * @return
     */
    PageBean page(EmpQueryParam param);
}
