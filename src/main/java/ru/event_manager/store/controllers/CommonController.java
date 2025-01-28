package ru.event_manager.store.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
    @GetMapping("/")
    public String index() {
        return "index"; // Страница с виджетом
    }

    @RequestMapping("/auth")
    public String auth(@RequestParam("id") String id,
                       @RequestParam("first_name") String firstName,
                       @RequestParam("last_name") String lastName,
                       @RequestParam("username") String username,
                       @RequestParam("photo_url") String photoUrl,
                       @RequestParam("auth_date") String authDate,
                       @RequestParam("hash") String hash) {
        // Здесь вы можете проверить хэш и аутентифицировать пользователя
        // Например, проверка на наличие пользователя в базе данных

        // Если аутентификация успешна, перенаправляем на другую страницу
        return "redirect:/home"; // Переход на страницу после успешной авторизации
    }

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal Authentication authentication) {
        return "home"; // Ваша страница после авторизации
    }
}
