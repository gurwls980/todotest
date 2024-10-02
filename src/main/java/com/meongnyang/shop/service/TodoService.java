package com.meongnyang.shop.service;

import com.meongnyang.shop.dto.request.ReqRegisterTodoDto;
import com.meongnyang.shop.dto.request.ReqUpdateTodoDto;
import com.meongnyang.shop.dto.response.RespGetTodoDto;

public interface TodoService {
    int registerTodo(ReqRegisterTodoDto reqDto);
    RespGetTodoDto getTodo(int todoId);
    int updateTodo(ReqUpdateTodoDto reqDto); // 수정
    int deleteTodo(int todoId); // 삭제
}
