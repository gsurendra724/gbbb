
package in.greenbarn.greenbarnadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.greenbarn.greenbarnadmin.model.Admin;
import in.greenbarn.greenbarnadmin.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	AdminService adminService;

	@PostMapping("/login")
	public boolean login(@RequestBody Admin admin) {
		return adminService.login(admin);
	}

	@PostMapping("/getAdmin")
	public Admin getAdmin(@RequestBody Admin admin) {
		return adminService.getAdminByUsername(admin);
	}

	@GetMapping("/getAdmins")
	public List<Admin> getAdmin() {
		return adminService.getAdmin();
	}

	@PostMapping("/createAdmin")
	public void createAdmin(@RequestBody Admin admin) {
		System.out.println("c");
		adminService.createAdmin(admin);
	}
}
