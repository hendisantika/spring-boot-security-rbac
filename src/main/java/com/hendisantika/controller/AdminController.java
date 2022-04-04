package com.hendisantika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-rbac
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/04/22
 * Time: 07.43
 */
@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }
}
