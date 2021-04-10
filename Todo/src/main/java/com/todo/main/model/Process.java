package com.todo.main.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pId;
    private String toDo;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public Process(Integer pId, String toDo) {
        this.pId = pId;
        this.toDo = toDo;
    }
}
