package com.itheima.service;

import com.itheima.entity.Dept;

import java.util.List;

public interface DeptService {

    /**
     * 查询部门列表
     * @return
     */
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 添加部门
     * @param dept
     */
    void save(Dept dept);

    /**
     * 回显
     * @param id
     * @return
     */
    Dept getByid(Integer id);

    /**
     * 更新部门
     * @param dept
     */
    void update(Dept dept);
}
