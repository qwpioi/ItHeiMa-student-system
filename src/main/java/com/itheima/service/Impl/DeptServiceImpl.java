package com.itheima.service.Impl;

import com.itheima.entity.Dept;
import com.itheima.mapper.DeptMapper;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //接收数据层对象
    @Autowired
    private DeptMapper deptMapper;
    //调用方法获得数据

    /**
     * 查询部门列表
     * @return
     */
    public List<Dept> list(){
        return deptMapper.list();
    }

    /**
     * 根据id删除部门
     * @param id
     */
    @Override
    public void delete(Integer id) {
        deptMapper.delete(id);

    }

    /**
     * 添加部门
     * @param dept
     */
    @Override
    public void save(Dept dept) {
        //1.补充基础属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        //2.调用mapper的新增方法
        deptMapper.inseret(dept);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @Override
    public Dept getByid(Integer id) {
        Dept dept = deptMapper.getByid(id);
        return dept;
    }

    /**
     * 更新部门
     * @param dept
     */
    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}
