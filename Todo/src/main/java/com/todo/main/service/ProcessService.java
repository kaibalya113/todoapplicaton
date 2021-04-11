package com.todo.main.service;

import com.todo.main.dao.ProcessDao;
import com.todo.main.model.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProcessService {
    @Autowired
    private ProcessDao processDao;

    public List<Process> getAllProcess(){
        List<Process> processes =  processDao.findAll();
        return processes;
    }
}
