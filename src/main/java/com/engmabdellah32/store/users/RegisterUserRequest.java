package com.engmabdellah32.store.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {

    @NotBlank(message = "name is required")
    @Size(max = 255, message = "Name must be less than 255 characters long.")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "It must be a valid email")
    @Lowercase(message = "Email must be in lowercase")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 25)
    private String password;

}
