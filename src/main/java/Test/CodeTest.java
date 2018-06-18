package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import service.MeniuService;
import controller.PatiekaloController;

public class CodeTest {
	
	@Autowired
	MeniuService meniuService;
	
	PatiekaloController pc = new PatiekaloController();
	Model model;
	//String returned;
	
	
	@Test
	public void testMessage(){
		pc.getAllMeniu(model.addAttribute("patiekalai", meniuService.getAll()));
		assertEquals("spejimas", "index");
	}

}
