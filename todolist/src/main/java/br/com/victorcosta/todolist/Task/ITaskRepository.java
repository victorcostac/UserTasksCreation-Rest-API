package br.com.victorcosta.todolist.Task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ITaskRepository extends JpaRepository<TaskModel, UUID>{
    
}
