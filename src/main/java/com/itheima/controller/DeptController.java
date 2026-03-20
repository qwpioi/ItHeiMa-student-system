package com.itheima.controller;

import com.itheima.entity.Dept;
import com.itheima.entity.Result;
import com.itheima.service.DeptService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping()
    public Result list(){
        List<Dept> depts = deptService.list();
        return Result.success(depts);
    }

    //删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        //System.out.println("deptID = " + id);
        log.info("deptID = {}",id);
        //调用Server的删除方法
        deptService.delete(id);
        return Result.success();
    }

    //添加部门
    @PostMapping()
    //@RequestBody必须添加该注解来标识JSON参数接收
    public Result save(@RequestBody Dept dept){
        //System.out.println("Dept = " + dept);
        log.info("Dept = {}",dept);
        deptService.save(dept);
        return Result.success();
    }

    //回显
    @GetMapping("/{id}")
    public Result getByid(@PathVariable Integer id){
        //System.out.println("ID = " + id);
        log.info("ID = {}",id);
        Dept dept = deptService.getByid(id);
        return Result.success(dept);
    }

    //更新部门
    @PutMapping()
    public Result update(@RequestBody Dept dept){
        //System.out.println("Dept = " + dept);
        log.info("Dept = {}",dept);
        deptService.update(dept);
        return Result.success();
    }

}
