package com.example.demo.api.user.service;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;
import com.example.demo.api.user.entity.UserMapper;
import com.example.demo.api.user.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  private final UserMapper userMapper;

  public UserSignupRes signup(UserSignupReq userSignupReq) {
    // TODO: 비밀번호 암호화
    return userMapper.toUserSignupRes(userRepository.save(userMapper.toUserEntity(userSignupReq)));
  }

}
