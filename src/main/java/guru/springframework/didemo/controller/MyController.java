package guru.springframework.didemo.controller;

import org.springframework.stereotype.Controller;

/* BTuladhar created on 1/20/2020 */
@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello!");
        return "foo";
    }
}
