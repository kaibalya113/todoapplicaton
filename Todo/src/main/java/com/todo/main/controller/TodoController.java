package com.todo.main.controller;

import com.todo.main.model.Todo;
import com.todo.main.service.TodoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/todo")
@CrossOrigin
public class TodoController {
    private static final Logger log = LogManager.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String index(){
        return "Loding...";
    }

    @PostMapping("/save")
    public Todo createToDo(@RequestBody Todo todo1){
        Todo todo = todoService.saveTodo(todo1);
        return todo;
    }
    // modify todo
    @PostMapping("/update/{pId}/{id}")
    public String updateTodo(@PathVariable("pId") Integer pId, @PathVariable(value = "id") Integer id){
        Todo updateToDo = todoService.updateTodo(pId, id);
        return "sucess...";
    }

    // get list of todos
    @GetMapping("/findall")
    public List<Todo> getAll(){
        List<Todo> list = todoService.getall();
        log.info("GETTING: ::::"+list);
        return list;
    }
    // delete todo by id

    //get data by id
    @PostMapping("/getdata/{id}")
    public Todo getData(@PathVariable("id") Integer id){
        Todo todo = todoService.getData(id);
        return todo;
    }
}
