package in.greenbarn.greenbarnadmin.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AddresController {

	@RequestMapping("/")
	public String print() {
		return "Hi";
	}

}
