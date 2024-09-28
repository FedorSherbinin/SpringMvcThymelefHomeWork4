package ru.geekbrains.domain;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    // Конструктор
    public User() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Геттер для firstName
    public String getFirstName() {
        return firstName;
    }

    // Сеттер для firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Геттер для lastName
    public String getLastName() {
        return lastName;
    }

    // Сеттер для lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттер для email
    public String getEmail() {
        return email;
    }

    // Сеттер для email
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
    }
}

