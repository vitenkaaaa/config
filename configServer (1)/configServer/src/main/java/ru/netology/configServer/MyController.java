package ru.netology.configServer;

@RefreshScope
@RestController
public class MyController {

    @Value("${myapp.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
