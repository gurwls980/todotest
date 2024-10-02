package com.meongnyang.shop.service;

import com.meongnyang.shop.dto.request.ReqRegisterTodoDto;
import com.meongnyang.shop.dto.request.ReqUpdateTodoDto;
import com.meongnyang.shop.dto.response.RespGetTodoDto;
import com.meongnyang.shop.entity.Todo;
import com.meongnyang.shop.repository.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    public int registerTodo(ReqRegisterTodoDto reqDto) {
        Todo todo = Todo.builder()
                .title(reqDto.getContent())
                .content(reqDto.getContent())
                .build();
        return todoMapper.save(todo);
    };

    @Override
    public RespGetTodoDto getTodo(int todoId) {
        Todo todo = todoMapper.findByTodoId(todoId);
        return RespGetTodoDto.builder()
                .todoId(todo.getTodoId())
                .content(todo.getContent())
                .build();
    }

    public int updateTodo(ReqUpdateTodoDto reqDto) {
        return todoMapper.update(reqDto.toEntity());
    }

    public int deleteTodo(int todoId) {
        return todoMapper.delete(todoId);
    }
}
