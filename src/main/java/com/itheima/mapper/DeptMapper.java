package com.itheima.mapper;

import com.itheima.entity.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询部门列表
     * @return
     */
    @Select("select * from dept")
    public List<Dept> list();

    /**
     * 根据id删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    /**
     * 添加部门
     * @param dept
     */
    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void inseret(Dept dept);

    /**
     * 回显
     * @param id
     * @return
     */
    @Select("select * from dept where id = #{id}")
    Dept getByid(Integer id);

    /**
     * 更新部门
     * @param dept
     */
    /*@Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")*/
    void update(Dept dept);
}
