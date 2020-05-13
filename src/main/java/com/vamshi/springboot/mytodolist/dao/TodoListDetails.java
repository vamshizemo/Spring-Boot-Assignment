package com.vamshi.springboot.mytodolist.dao;

import com.vamshi.springboot.mytodolist.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListDetails extends JpaRepository<TodoList,Integer> {

}
