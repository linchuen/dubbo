package com.cooba.rpc;

import com.cooba.object.User;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloDubboServiceImpl implements HelloDubboService {

    @Override
    public String sayHello(User user) {
        return "Hello," + user.getName() + "!";
    }
}
