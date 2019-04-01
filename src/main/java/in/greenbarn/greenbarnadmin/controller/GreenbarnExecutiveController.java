package in.greenbarn.greenbarnadmin.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.greenbarn.greenbarnadmin.model.GreenbarnExecutive;
import in.greenbarn.greenbarnadmin.service.GreenbarnExecutiveService;

@RestController
@CrossOrigin
public class GreenbarnExecutiveController {

	@Autowired
	private GreenbarnExecutiveService greenbarnExecutiveService;
	
	@PostMapping("/createExecutive")
	public boolean createExecutive(@RequestBody GreenbarnExecutive greenbarnExecutive) {
		return greenbarnExecutiveService.createExecutive(greenbarnExecutive);
	}
	
	@GetMapping("/getExecutives")
	public ArrayList<GreenbarnExecutive> getExecutives() {
		return greenbarnExecutiveService.getExecutives();
	}
	
}
