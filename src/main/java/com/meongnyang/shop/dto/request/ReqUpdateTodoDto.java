package com.meongnyang.shop.dto.request;

import com.meongnyang.shop.entity.Todo;
import lombok.Data;

@Data
public class ReqUpdateTodoDto {
    private int todoId;
    private String title;
    private String content;

    public Todo toEntity() {
        return Todo.builder()
                .todoId(todoId)
                .title(title)
                .content(content)
                .build();
    }
}
