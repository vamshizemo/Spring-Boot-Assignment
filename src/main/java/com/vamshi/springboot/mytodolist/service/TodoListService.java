package com.vamshi.springboot.mytodolist.service;

import com.vamshi.springboot.mytodolist.entity.TodoList;

import java.util.List;

public interface TodoListService {
    public List<TodoList> findAll();
    public TodoList findById(int theId);
    public void save(TodoList theTodoList);
    public void deleteById(int theId);
}
