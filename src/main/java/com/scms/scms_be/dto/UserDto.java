package com.scms.scms_be.dto;

import java.util.List;

import com.scms.scms_be.entity.User;

import lombok.Data;

@Data
public class UserDto {
    
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;

    private Long employeeId;
    private String username;
    private String email;
    private String password;
    private String role;
    private String status;
    private String otp;
    
    private User ourUsers;
    private List<User> ourUsersList;
  



}
