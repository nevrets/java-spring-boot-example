package com.example.demo.controller;

import com.example.demo.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User", description = "사용자 관리 API")
public class UserController {
    
    private List<User> users = new ArrayList<>();

    public UserController() {
        // 샘플 데이터 추가
        users.add(new User(1L, "홍길동", "hong@example.com"));
        users.add(new User(2L, "김철수", "kim@example.com"));
    }

    @Operation(summary = "전체 사용자 조회", description = "모든 사용자 정보를 조회합니다.")
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @Operation(summary = "특정 사용자 조회", description = "ID로 특정 사용자를 조회합니다.")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Operation(summary = "사용자 생성", description = "새로운 사용자를 생성합니다.")
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
} 