package com.infosys;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@Autowired
	EmpRepo repo;
	
	
	@RequestMapping("/home")
	public String getHome(Model m) {
		
		
		return "Home";
	}
	@RequestMapping("/nextpage")
	public String getnextpage(@RequestParam("action") String action,Model m) {
		if(action.equals("Add")) {
			
			return "Add";
		}
		else if(action.equals("Search")) {
			return "Search";
		}
		else if(action.equals("Modify")) {
			return "Modify";
		}
		else if(action.equals("Delete")) {
			return "Delete";
		}
		else if(action.equals("ViewAll")) {
			List<Employee> empList = repo.findAll();
			m.addAttribute("empList", empList);
			return "ViewAll";
		}
		return "Nextpage";
	}
	
	@RequestMapping("/addmsg")
	public String getaddmsg(@ModelAttribute("ma") Employee e) {
		repo.save(e);
		return "AddMsg";
	}
	
	@RequestMapping("/searchmsg")
	public String getsearchmsg(@RequestParam("eid") int eid, Model m) {
		Optional<Employee> o = repo.findById(eid);
		Employee e = o.get();
		m.addAttribute("search", e);
		return "SearchMsg";
	}

	@RequestMapping("/modifyid")
	public String getmodifyid(@RequestParam("eid") int eid, Model m) {
		Optional<Employee> o = repo.findById(eid);
		Employee e = o.get();
		m.addAttribute("search", e);
		return "ModifyId";
	}
	
	@RequestMapping("/modifyidmsg")
	public String getmodifyidmsg(@ModelAttribute("mam") Employee emp) {
		repo.save(emp);
		return "ModifyIdMsg";
	}
	
	@RequestMapping("/deletemsg")
	public String getdeletemsg(@RequestParam("eid") int eid) {
		repo.deleteById(eid);
		return "DeleteMsg";
	}
}
