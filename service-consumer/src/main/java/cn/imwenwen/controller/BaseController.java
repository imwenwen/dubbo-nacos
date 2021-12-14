package cn.imwenwen.controller;

import cn.imwenwen.api.RpcShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Imwenwen
 * @create 2021/12/13 17:37
 */
@RestController
public class BaseController{
    @Reference
    RpcShopService shopService;
    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping( "/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        System.out.println(serviceName);
        return shopService.sayHello(name);
    }
}
