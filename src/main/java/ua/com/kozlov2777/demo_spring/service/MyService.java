package ua.com.kozlov2777.demo_spring.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public String calc(int mark){
        return switch (mark){
            case 1, 2, 3 ->"Достаточный";
            case 4, 5, 6 ->"Начальный";
            case 7, 8, 9 ->"Хорошист";
            case 10, 11, 12 ->"Отличник";
            default -> "Error";
        };
    }
}
