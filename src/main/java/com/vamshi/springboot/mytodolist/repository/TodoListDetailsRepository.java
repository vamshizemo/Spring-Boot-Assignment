package com.vamshi.springboot.mytodolist.repository;

import com.vamshi.springboot.mytodolist.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListDetailsRepository extends JpaRepository<TodoList,Integer> {

}
