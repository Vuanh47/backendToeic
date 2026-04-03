package org.example.backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.request.CreateUserRequest;
import org.example.backend.dto.response.ApiResponse;
import org.example.backend.dto.response.UserResponse;
import org.example.backend.enums.SuccessCode;
import org.example.backend.service.UserService;
import org.example.backend.util.ApiResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@RequestBody CreateUserRequest request) {
        return ApiResponseUtil.success(userService.createUser(request), SuccessCode.USER_CREATED);
    }
}

