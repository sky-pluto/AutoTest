package com.sinosoft.rent.controller;

import com.sinosoft.rent.entity.User;
import com.sinosoft.rent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false)
    private UserService userService; /**
     * 查询全部
     * @return */
    @GetMapping("/list")
    public Object list(){
        System.out.println("查询成功");
        return userService.list();
    } /**
     * 根据id删除
     * @param id
     * @return */
    @GetMapping("/delete")
    public boolean delete(Integer id){
        System.out.println("删除成功");
        return userService.removeById(id);
    } /**
     *  根据id查询
     * @param id
     * @return */
    @GetMapping("/byid")
    public Object byid(Integer id){
        System.out.println("查询成功");
        return userService.getById(id);
    } /**
     *  修改
     * @param user
     * @return */
    @PostMapping("/update")
    public boolean update(@RequestBody User user){
        System.out.println("修改成功"); return userService.updateById(user);
    } /**
     * 添加
     * @param user
     * @return */
    @PostMapping("/add")
    public boolean add(@RequestBody User user){
        System.out.println("添加成功"); return userService.save(user);
    }
}
