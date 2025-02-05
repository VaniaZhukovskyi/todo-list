package com.example.ToDoListApp.Model;

public class Task {
    private String title;
    private String description;
    private String deadline;
    private String priority;

    //Конструктор за замовчуванням (потрібен для Thymeleaf)
    public Task() {}

    //Конструктор з параметрами
    public Task(String title, String description, String deadline, String priority) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    // Гетери та сетери
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
}