package ua.com.kozlov2777.demo_spring.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.kozlov2777.demo_spring.service.MyService;


@Controller
@AllArgsConstructor
public class MyController {

    MyService myService;

    @PostMapping("hello")
    public String sayHello(@RequestParam(value = "username") String name,@RequestParam int mark, Model model){
        model.addAttribute("name", name);
        String textMark = myService.calc(mark);
        model.addAttribute("mark", textMark);
        return "hello";
    }
}
