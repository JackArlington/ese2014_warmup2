package org.sample.controller;

import org.sample.model.Team;
import org.sample.model.User;
import org.sample.model.dao.TeamDao;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfilController {
	
    @Autowired
    private TeamDao teamRepository;
    @Autowired
    private UserDao userRepository;
	
//	Searchmachine Friendly approach
//    @RequestMapping("/profile/{userId}")
//    public ModelAndView findUser(@PathVariable("userId") Long userId, Model model) {
//        System.out.println("test");
//        User user = userRepository.findOne(userId);
//        model.addAttribute("id", userId);
//        model.addAttribute("firstName", user.getFirstName());
//        model.addAttribute("lastName", user.getLastName());
//        model.addAttribute("address", user.getAddress().getStreet());
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("team", user.getTeam().getTeamName());
//        
//        return new ModelAndView("profile");
//    }
    
//	Parameter approach
    @RequestMapping("profile")
    public ModelAndView findUser(@RequestParam String userId, Model model) {
	      User user = userRepository.findOne(new Long(userId));
	      if(user != null){
		      model.addAttribute("id", userId);
		      model.addAttribute("firstName", user.getFirstName());
		      model.addAttribute("lastName", user.getLastName());
		      model.addAttribute("address", user.getAddress().getStreet());
		      model.addAttribute("email", user.getEmail());
		      model.addAttribute("team", user.getTeam().getTeamName());
	      }
	      
	      return new ModelAndView("profile");
    }
}
