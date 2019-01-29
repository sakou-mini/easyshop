package cn.yiyun.easyshop.web.controller;

import cn.yiyun.easyshop.domain.Employee;
import cn.yiyun.easyshop.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * copyright(c) 2018-2026 yiyun.com
 *
 * @version: V1.0
 * @author: 叶天翼
 * @className: LoginController.java
 * @description: 这是注册控制器
 * @data: 2019/1/26
 **/
@RestController
public class LoginController {

    /**
     * RequestBody注解：
     * 将前台restful请求中的json参数直接封装成domian对象
     * 前提是json的属性名称和domain的属性名称匹配
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setMessage("登陆成功").setSuccess(true);
        }
        return AjaxResult.me().setSuccess(false).setSuccess(false).setMessage("用户名或者密码错误");
    }
}
