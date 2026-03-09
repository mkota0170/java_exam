package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@Validated
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable @Min(1) Integer id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(new UserResponse(user.getId(), user.getName(), user.getEmail()));
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
            @RequestParam @NotBlank(message = "必須だよ") String name,
            @RequestParam @NotBlank(message = "必須だよ") @Email(message = "メアド書いてね") String email) {
        User user = new User(name, email);
        List<User> list = userService.searchUsers(user);
        List<UserResponse> responses = new ArrayList<>();
        for (User ruser : list) {
            responses.add(new UserResponse(ruser.getId(), ruser.getName(), ruser.getEmail()));
        }
        return ResponseEntity.ok(responses);
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping("")
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest request) {
        User user = new User(request.getName(), request.getEmail());
        User cuser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserResponse(cuser.getId(), cuser.getName(), cuser.getEmail()));
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Integer id, @Valid @RequestBody UserRequest request) {
        User existing = userService.findById(id);

        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        String name = request.getName();
        String email = request.getEmail();
        User updateUser = new User(name, email);
        User updated = userService.updateUser(id, updateUser);

        return ResponseEntity.ok(new UserResponse(updated.getId(), updated.getName(), updated.getEmail()));
    }
}
