package ua.pp.lazin.phraseholder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ruslan Lazin
 */

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String getAllPhrases() {
        return "redirect:phrases";
    }
}
