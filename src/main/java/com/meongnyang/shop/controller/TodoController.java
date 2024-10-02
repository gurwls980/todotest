package com.meongnyang.shop.controller;

import com.meongnyang.shop.dto.request.ReqRegisterTodoDto;
import com.meongnyang.shop.dto.request.ReqUpdateTodoDto;
import com.meongnyang.shop.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo")
    public ResponseEntity<?> registerTodo(@RequestBody ReqRegisterTodoDto reqDto) {
        return ResponseEntity.ok().body(todoService.registerTodo(reqDto));
    }

    @GetMapping("/todolist")
    public ResponseEntity<?> getTodolist(@RequestParam(required = false) int todoId) {
        return ResponseEntity.ok().body(todoService.getTodo(todoId));
    }

    @DeleteMapping("/todo/{todoId}")
    public ResponseEntity<?> deleteApi(@PathVariable int todoId) {
        return ResponseEntity.ok().body(todoService.deleteTodo(todoId));
    }

    @PutMapping("/todo/{todoId}")
    public ResponseEntity<?> updateApi(@RequestBody ReqUpdateTodoDto reqDto) {
        return ResponseEntity.ok().body(todoService.updateTodo(reqDto));
    }
}
