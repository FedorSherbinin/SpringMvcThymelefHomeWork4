package ru.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.models.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final List<User> users = new ArrayList<>();

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", users);
        return "users"; // Шаблон для отображения списка пользователей
    }

    @GetMapping("/add")
    public String showAddUserForm() {
        return "addUser"; // Убедитесь, что ваш шаблон называется "addUser.html"
    }

    @PostMapping("/add")
    public String addUser(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
        // Проверка входных данных
        if (name == null || name.isEmpty() || age <= 0) {
            model.addAttribute("error", "Пожалуйста, введите корректные данные.");
            return "addUser"; // Вернуть на форму добавления с ошибкой
        }

        users.add(new User(name, age));
        return "redirect:/users"; // Перенаправление на список пользователей
    }


    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(Exception.class)
        public String handleException(Exception e, Model model) {
            model.addAttribute("error", "Произошла ошибка: " + e.getMessage());
            return "error"; // Создайте отдельный шаблон error.html для отображения ошибки
        }
    }

}
