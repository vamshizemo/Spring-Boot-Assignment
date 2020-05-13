package com.vamshi.springboot.mytodolist.service;

import com.vamshi.springboot.mytodolist.entity.TodoList;
import com.vamshi.springboot.mytodolist.repository.TodoListDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TodoListServiceImpl implements TodoListService {

    private TodoListDetailsRepository theTodoListDetailsRepository;

    @Autowired
    public TodoListServiceImpl(TodoListDetailsRepository theTodoListDetailsRepository) {
        this.theTodoListDetailsRepository = theTodoListDetailsRepository;
    }

    @Override
    public List<TodoList> findAll() {
        return theTodoListDetailsRepository.findAll();
    }

    @Override
    public TodoList findById(int theId) {
        Optional<TodoList> result = theTodoListDetailsRepository.findById(theId);
        TodoList theTodoList = null;

        if (result.isPresent()) {
            theTodoList = result.get();
        } else {
            throw new NullEmployeeException("Did not find list item id - " + theId);
        }
        return theTodoList;
    }

    @Override
    public void save(TodoList theTodoList) {
        theTodoListDetailsRepository.save(theTodoList);

    }

    @Override
    public void deleteById(int theId) {
        theTodoListDetailsRepository.deleteById(theId);
    }
}

class NullEmployeeException extends RuntimeException {
    NullEmployeeException(String s) {
        super(s);
    }
}

