package ru.event_manager.store.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CommonController {

    private static final Logger logger = LoggerFactory.getLogger(CommonController.class); // Логгер

    @GetMapping("/")
    public String index() {
        return "index"; // Страница с виджетом
    }

    @RequestMapping("/auth")
    public String auth(@RequestParam Map<String, String> params,
                       Model model) {
        params.forEach((s, s2) -> logger.debug("key {} value {}", s, s2));
        // Здесь вы можете проверить хэш и аутентифицировать пользователя
        // Например, проверка на наличие пользователя в базе данных

        // Если аутентификация успешна, перенаправляем на другую страницу
        return "home"; // Переход на страницу после успешной авторизации
    }
}
