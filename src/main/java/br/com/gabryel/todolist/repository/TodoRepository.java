package br.com.gabryel.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabryel.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
