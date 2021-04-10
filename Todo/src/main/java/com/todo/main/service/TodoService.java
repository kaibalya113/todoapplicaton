package com.todo.main.service;

import com.todo.main.controller.TodoController;
import com.todo.main.dao.TodoDao;
import com.todo.main.model.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private static final Logger log = LogManager.getLogger(TodoService.class);

    @Autowired
    private TodoDao todoDao;

    public Todo saveTodo(Todo todo){
       Todo to =  todoDao.save(todo);
        return to;
    }

    public Todo updateTodo(Integer pId, Integer id){
        Todo to =  todoDao.updateTodo(pId, id);
        return to;
    }

    public List<Todo> getall(){
        return todoDao.findAll();
    }

    public Todo getData(Integer id){
        return todoDao.findByIdTodo(id);
    }

}
