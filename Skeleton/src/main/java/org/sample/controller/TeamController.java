package org.sample.controller;

import org.sample.controller.pojos.CreateTeamForm;
import org.sample.controller.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeamController {

    @Autowired
    SampleService sampleService;
	
//	@RequestMapping(value = "/new-team", method = RequestMethod.POST)
//	public String createTeam(@ModelAttribute CreateTeamForm createTeamForm, Model model){
//		model.addAttribute("createTeamForm", new CreateTeamForm());
//		
//		System.out.println("Test");
//		return "new-team";
//	}
//	
//	@RequestMapping(value = "/new-team", method = RequestMethod.GET)
//	public String createTeam(Model model){
//		model.addAttribute("createTeamForm", new CreateTeamForm());
//		return "new-team";
//	}
//	
}



