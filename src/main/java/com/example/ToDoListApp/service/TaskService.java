package com.example.ToDoListApp.service;

import com.example.ToDoListApp.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {//Сервіс для управління завданнями
    private final List<Task> tasks = new ArrayList<>();


    public List<Task> getAllTasks() {
        return tasks;//Отримати всі завдання
    }


    public void addTask(Task task) {
        tasks.add(task);//Додати нове завдання
    }


    public void deleteTask(int index) {
        tasks.remove(index);//Видалити завдання за індексом
    }
}