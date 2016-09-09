package org.springboot.sample.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.entity.Student;
import org.springboot.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
@Api(value = "Student", description = "获取学生数据信息")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public List<Student> getStus(){
        logger.info("从数据库读取Student集合");
        return studentService.getList();
    }

    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path",name="name",dataType="String",required=true,value="用户的姓名",defaultValue="zhaojigang")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value="/likeName/{name}",method= RequestMethod.GET)
    public List<Student> likeName(@PathVariable String name){
        return studentService.likeName(name);
    }


}
