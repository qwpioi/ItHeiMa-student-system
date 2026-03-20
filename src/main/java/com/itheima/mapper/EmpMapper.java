package com.itheima.mapper;

import com.itheima.entity.Emp;
import com.itheima.entity.EmpQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    /*@Select("select count(*) from emp")
    Long count();
    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id limit #{start}, #{pageSize};")
    List<Emp> page(Integer start, Integer pageSize);*/

    /**
     * 列表查询，分页查询
     * @return
     */
    List<Emp> list(EmpQueryParam param);
}
