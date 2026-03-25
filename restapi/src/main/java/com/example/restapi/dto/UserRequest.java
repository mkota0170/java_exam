package com.example.restapi.dto;

import java.time.LocalDateTime;

public class UserRequest {
  private String name;
  private String email;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public UserRequest() {
  }
  public UserRequest(String name, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
    this.name = name;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
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
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public String toString() {
    return "UserRequest [name=" + name + ", email=" + email + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
        + "]";
  } 
}
