package com.meongnyang.shop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespGetTodoDto {
    private int todoId;
    private String title;
    private String content;
}
