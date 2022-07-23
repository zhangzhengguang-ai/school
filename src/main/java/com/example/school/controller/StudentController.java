package com.example.school.controller;

import com.example.school.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangzhengguang
 * @date 2022/7/23 10:33 上午
 * @description
 */
@Api(value = "学生管理", tags = "学生管理")
@RestController
@RequestMapping("/student")
public class StudentController {

    /**
     * 新增学生
     *
     * @return
     */
    @ApiOperation(value = "新增学生")
    @PostMapping("/add")
    public R addStudent() {
        return R.ok();
    }

    /**
     * 更新学生信息
     *
     * @return
     */
    @ApiOperation(value = "更新学生信息")
    @PutMapping("/update")
    public R updateStudent() {
        return R.ok();
    }

    /**
     * 查询所有学生
     *
     * @return
     */
    @ApiOperation(value = "查询所有班级")
    @GetMapping("/list")
    public R listStudent() {
        return R.ok();
    }

    /**
     * 根据id查询某个学生
     *
     * @return
     */
    @ApiOperation(value = "根据id查询某个学生")
    @GetMapping("/{id}")
    public R findStudent(@PathVariable Long id) {
        return R.ok();
    }

    /**
     * 删除学生
     *
     * @return
     */
    @ApiOperation(value = "删除学生")
    @DeleteMapping("/{id}")
    public R delClass(@PathVariable Long id) {
        return R.ok();
    }

}
