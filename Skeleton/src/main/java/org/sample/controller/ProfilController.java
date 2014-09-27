package org.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfilController {
	
    @RequestMapping("/profile/{userId}")
    public void findPet(@PathVariable String userId, Model model) {
        System.out.println("test");
    }

}
