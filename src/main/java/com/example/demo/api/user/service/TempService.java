package com.example.demo.api.user.service;

import com.example.demo.api.user.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TempService {

    private final UserRepository userRepository;

}
