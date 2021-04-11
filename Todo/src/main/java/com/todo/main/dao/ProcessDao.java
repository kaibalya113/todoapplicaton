package com.todo.main.dao;

import com.todo.main.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProcessDao extends JpaRepository<Process, Integer> {

}
