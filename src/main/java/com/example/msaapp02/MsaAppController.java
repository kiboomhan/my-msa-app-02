package com.example.msaapp02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app02")
public class MsaAppController {

    @GetMapping("/welcome")
    public String welcome() {
        return "App02 : Hello World";
    }
}
