package com.example.ToDoListApp.controller;

import com.example.ToDoListApp.Model.Task;
import com.example.ToDoListApp.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller//означає цей клас як MVC контролер
public class TaskController {
    private final TaskService taskService;
    private final Logger logger = LoggerFactory.getLogger(TaskController.class);

    // Конструктор з ін'єкцією залежностей
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Головна сторінка
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        logger.info("Home page displayed");
        return "index";
    }

    // Форма додавання завдання
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("task", new Task());
        logger.info("The task add form is displayed.");
        return "task_form";
    }

    // Збереження завдання
    @PostMapping("/save")
    public String saveTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        logger.info("New task added: {}", task.getTitle());
        return "redirect:/";
    }

    // Видалення завдання
    @GetMapping("/delete/{index}")
    public String deleteTask(@PathVariable int index) {
        taskService.deleteTask(index);
        logger.info("Index task deleted {}", index);
        return "redirect:/";
    }
}