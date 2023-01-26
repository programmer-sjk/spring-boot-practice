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

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable Long userId) {
        return "put " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        return "delete " + userId;
    }
}
