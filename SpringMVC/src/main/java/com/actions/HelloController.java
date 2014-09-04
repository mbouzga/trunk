package com.actions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(final ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World ! ");
        model.addAttribute("title", "Title model hello world");
        System.out.println("Test SVN commit");
        return "hello";

    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String printWelcome2(final ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World 222");
        model.addAttribute("title", "Title model hello world");
        return "hello";

    }
}
