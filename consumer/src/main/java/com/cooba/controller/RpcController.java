package com.cooba.controller;

import com.cooba.object.User;
import com.cooba.rpc.HelloDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpcController {
    @DubboReference
    private HelloDubboService helloDubboService;

    @PostMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestBody User user){
       return ResponseEntity.ok(helloDubboService.sayHello(user));
    }
}
