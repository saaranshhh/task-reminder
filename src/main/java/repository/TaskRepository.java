package com.example.taskreminder.repository;

import com.example.taskreminder.model.TaskModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final JdbcTemplate jdbcTemplate;

    // Constructor Injection
    public TaskRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Add Task
    public void addTask(TaskModel taskModel){
        String sql = "INSERT INTO tasks (id, title, description, due_date, completed) VALUES (?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                taskModel.getId(),
                taskModel.getTitle(),
                taskModel.getDescription(),
                taskModel.getDueDate(),
                taskModel.getStatus()
        );
    }

    // Get All Tasks
    public List<TaskModel> getTasks(){

        String sql = "SELECT * FROM tasks";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            TaskModel task = new TaskModel();

            task.setId(rs.getLong("id"));
            task.setTitle(rs.getString("title"));
            task.setDescription(rs.getString("description"));
            task.setDueDate(rs.getTimestamp("due_date").toLocalDateTime());
            task.setStatus(rs.getString("status"));

            return task;
        });
    }

    // Update Task
    public void updateTask(Long id, TaskModel taskModel){

        String sql = "UPDATE tasks SET title=?, description=?, due_date=?, status=? WHERE id=?";

        jdbcTemplate.update(sql,
                taskModel.getTitle(),
                taskModel.getDescription(),
                taskModel.getDueDate(),
                taskModel.getStatus(),
                id
        );
    }

    // Delete Task
    public void deleteTask(Long id){

        String sql = "DELETE FROM tasks WHERE id=?";

        jdbcTemplate.update(sql, id);
    }
}