package com.hyc.user.api.service;

import com.hyc.user.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hhh-provider-user")
public interface UserService {

    @GetMapping(value = "/api/user/{id}")
    User findById(@PathVariable("id") String id);
}
