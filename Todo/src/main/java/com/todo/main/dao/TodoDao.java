package com.todo.main.dao;

import com.todo.main.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TodoDao extends JpaRepository<Todo, Integer> {

    @Transactional
    @Modifying
    @Query("Update  Todo t set t.pId=:pId where t.id=:id")
    Integer updateTodo(@Param("pId") Integer pId, @Param("id") Integer id);

    @Query("select t from Todo t where t.id=:id")
    Todo findByIdTodo(@Param("id") Integer id);

    @Query("Update Todo t set t.pId=:pId where t.id=:id")
    void moveData(@Param("id") Integer pId);
}
