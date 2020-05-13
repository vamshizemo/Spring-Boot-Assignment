package com.vamshi.springboot.mytodolist.service;

import com.vamshi.springboot.mytodolist.dao.TodoListDetails;
import com.vamshi.springboot.mytodolist.entity.TodoList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TodoListServiceImpl implements TodoListService {

    public TodoListDetails theTodoListDetails;

    @Autowired
    public TodoListServiceImpl(TodoListDetails theTodoListDetails) {
        this.theTodoListDetails = theTodoListDetails;
    }

    @Override
    public List<TodoList> findAll() {
        //log.info("entered in findall function");
        return theTodoListDetails.findAll();
    }

    @Override
    public TodoList findById(int theId) {
        Optional<TodoList> result = theTodoListDetails.findById(theId);

        TodoList theTodoList = null;

        if (result.isPresent()) {
            theTodoList = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find list item id - " + theId);
        }
        return theTodoList;
    }

    @Override
    public void save(TodoList theTodoList) {
        theTodoListDetails.save(theTodoList);

    }

    @Override
    public void deleteById(int theId) {
        theTodoListDetails.deleteById(theId);
    }

}

