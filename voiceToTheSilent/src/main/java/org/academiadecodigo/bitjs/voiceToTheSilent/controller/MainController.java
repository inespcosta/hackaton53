package org.academiadecodigo.bitjs.voiceToTheSilent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    /**
     * Renders the home page view
     *
     * @return the view
     */
    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String home() {
        return "voicets/home";
    }
}

