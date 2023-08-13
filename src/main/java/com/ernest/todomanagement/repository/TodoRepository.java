package com.ernest.todomanagement.repository;

import com.ernest.todomanagement.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
