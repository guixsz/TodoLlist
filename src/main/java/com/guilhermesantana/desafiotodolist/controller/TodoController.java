package com.guilhermesantana.desafiotodolist.controller;

import com.guilhermesantana.desafiotodolist.entity.Todo;
import com.guilhermesantana.desafiotodolist.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    @PostMapping
    ResponseEntity<List<Todo>> create(@Validated @RequestBody Todo todo){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.create(todo));
    }

    @GetMapping
    List<Todo> list(Todo todo){
        return todoService.list();
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }
}
