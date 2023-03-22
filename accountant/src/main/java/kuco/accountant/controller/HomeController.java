package kuco.accountant.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/hello")
    public String Hello(Model model) {
        return "Hello, World!";
    }

    @GetMapping("/api/db")
    @ResponseBody
    public String Db() {
        return "Hello, this is DB side!";
    }
}
