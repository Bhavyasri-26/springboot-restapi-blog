package com.springboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;

    //title!=null/empty, title>=2 chars
    @NotEmpty
    @Size(min = 2, message = "post title should have atleast 2 characters")
    private String title;

    // desc!=null/empty, desc >=10 ch
    @NotEmpty
    @Size(min = 10, message = "post description should have atleast 10 characters")
    private String description;

    //content!=null/empty
    @NotEmpty
    private  String content;
    private Set<CommentDto> comments;

    private Long categoryId;
}
