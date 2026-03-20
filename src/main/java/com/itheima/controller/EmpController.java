package com.itheima.controller;

import com.github.pagehelper.PageHelper;
import com.itheima.entity.EmpQueryParam;
import com.itheima.entity.PageBean;
import com.itheima.entity.Result;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public Result page(EmpQueryParam param){
        log.info("分页查询：{}, {}, {}, {}, {}, {}",param.getName(),param.getGender(),param.getBegin(),param.getEnd(),param.getPage(),param.getPageSize());
        PageBean pageBean = empService.page(param);
        return Result.success(pageBean);
    }
}
