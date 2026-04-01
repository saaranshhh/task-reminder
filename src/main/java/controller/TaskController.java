package com.example.taskreminder.controller;

import com.example.taskreminder.model.TaskModel;
import com.example.taskreminder.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/add")
    public String addTask(@RequestParam String title,
                          @RequestParam String description,
                          @RequestParam String status) {

        TaskModel task = new TaskModel();
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(status);

        taskRepository.addTask(task);

        return "Task added";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskRepository.deleteTask(id);
        return "Task deleted";
    }

    @PostMapping("/update")
    public String updateTask(@ModelAttribute TaskModel task) {
        taskRepository.updateTask(task.getId(), task);
        return "Task updated";
    }
}