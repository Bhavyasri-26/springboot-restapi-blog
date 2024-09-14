package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "name shouldn't be null/empty")
    private String name;

    @NotEmpty(message = "email shouldn't be null/empty")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "comment must have atleast 10 characters")
    private String body;
}
