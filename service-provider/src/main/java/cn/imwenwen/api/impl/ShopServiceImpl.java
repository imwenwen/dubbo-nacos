package cn.imwenwen.api.impl;

import cn.imwenwen.api.RpcShopService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Imwenwen
 * @create 2021/12/13 16:13
 */
@Service
public class ShopServiceImpl implements RpcShopService {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        System.out.println(serverPort);
        return name+"调用提供者serverPort端口:"+serverPort+serviceName;
    }
}
