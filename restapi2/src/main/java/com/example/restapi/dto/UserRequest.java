package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {
  @NotBlank(message = "必須だよ")
  private String name;
  @NotBlank(message = "必須だよ")
  @Email(message = "メアドじゃないよ、それ")
  private String email;

  public UserRequest() {
  }

  public UserRequest(@NotBlank(message = "必須だよ") String name,
      @NotBlank(message = "必須だよ") @Email(message = "メアドじゃないよ、それ") String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return "UserRequest [name=" + name + ", email=" + email + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
