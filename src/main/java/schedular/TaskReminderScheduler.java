package com.example.taskreminder.scheduler;

import com.example.taskreminder.model.TaskModel;
import com.example.taskreminder.service.TaskManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class TaskReminderScheduler {

    private final TaskManager taskManager;

    public TaskReminderScheduler(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    // Runs every 1 minute
    @Scheduled(fixedRate = 60000)
    public void checkTasks(){

        List<TaskModel> tasks = taskManager.getTasks();

        for (TaskModel task : tasks) {

            if (task.getStatus() != null &&
                    task.getStatus().equalsIgnoreCase("pending") &&
                    task.getDueDate().isBefore(LocalDateTime.now())) {

                System.out.println("⚠️ Reminder: Task '" + task.getTitle() + "' is overdue!");
            }
        }
    }
}