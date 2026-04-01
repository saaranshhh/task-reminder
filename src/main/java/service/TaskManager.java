package com.example.taskreminder.service;

import com.example.taskreminder.model.TaskModel;
import com.example.taskreminder.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskManager {

    private final TaskRepository repository;

    public TaskManager(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(TaskModel taskModel){
        repository.addTask(taskModel);
    }

    public List<TaskModel> getTasks(){
        return repository.getTasks();
    }

    public void updateTask(Long id, TaskModel taskModel){
        repository.updateTask(id, taskModel);
    }

    public void deleteTask(Long id){
        repository.deleteTask(id);
    }
}