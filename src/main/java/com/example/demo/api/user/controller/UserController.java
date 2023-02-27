package com.example.demo.api.user.controller;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;
import com.example.demo.api.user.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  @PostMapping("/signup")
  public UserSignupRes signup(@RequestBody UserSignupReq userSignupReq) {
    return userService.signup(userSignupReq);
  }

}
