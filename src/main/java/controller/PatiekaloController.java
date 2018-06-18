package controller;

import javax.validation.Valid;

import model.Patiekalas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MeniuService;


@Controller
@RequestMapping("/")
public class PatiekaloController {
	
		@Autowired
		public MeniuService meniuService;

		@RequestMapping(value= "/", method = RequestMethod.GET)
		public String getAllMeniu(Model model){
			model.addAttribute("patiekalai", meniuService.getAll());
			return "index";
		}

		@PostMapping("/addDish")
		public String addToMeniu(@Valid Patiekalas pat, BindingResult br, Model model){
			if(!br.hasErrors()){
				model.addAttribute("noErrors", true);
				meniuService.insert(pat);
			}
			return "createDish";
		}
		
		@GetMapping("/addDish")
		public String createPlate(Model model){
			model.addAttribute("patiekalas", new Patiekalas());
			return "createDish";
		}
		
		@GetMapping("/update/{id}")
		public String update(@PathVariable("id")int id, Model model) {
			model.addAttribute("film", meniuService.getById(id));
			return "editDish";
		}
		
		@PostMapping("/update/{id}") 
		public String updateUser(@PathVariable("id")int id, @Valid Patiekalas pat, BindingResult bindingResult, Model model) {
			if(!bindingResult.hasErrors()) {
				model.addAttribute("noErrors", true);
				
			}meniuService.update(pat, id);
			return "editDish";
		}
		
		@GetMapping("/delete/{id}")
		public String delete(@PathVariable("id")int id) {
			meniuService.delete(id);
			return "redirect:/";
	}
	
}
