package com.example.demo.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{userId}")
    public String getUser(@PathVariable Long userId) {
        return "get";
    }

    @PostMapping
    public String addUser() {
        return "post";
    }

    @PutMapping
    public String updateUser() {
        return "put";
    }

    @DeleteMapping
    public String deleteUser() {
        return "string";
    }
}
