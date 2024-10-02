package com.meongnyang.shop.repository;

import com.meongnyang.shop.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    int save (Todo todo);
    Todo findByTodoId(int todoId);
    int delete (int todoId);
    int update (Todo todo);
}
