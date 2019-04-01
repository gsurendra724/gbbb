package in.greenbarn.greenbarnadmin.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import in.greenbarn.greenbarnadmin.model.Admin;
import in.greenbarn.greenbarnadmin.service.AdminService;

@RunWith(SpringRunner.class)
//@WebMvcTest(AdminController.class)
public class AdminControllerTest {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private AdminService adminService;

	@Test
	public void contextLoads() {
	}

//	@Before
//	 public void setUp() throws Exception {
//	  mockMvc = MockMvcBuilders.standaloneSetup(new AdminController()).build();
//	 }
//	@Test
//	public void getAdmin() throws Exception {
//		Date date = new Date();
//		Admin admin = new Admin("surendrakg", "Mr.", "Surendra", "Kumar", "Godara", "Male", date,
//				"7275683405", "gsurendra724@gmail.com", "ghghgh");
//
//		List<Admin> admins = Arrays.asList(admin);
//
//		given((adminService.getAdmin())).willReturn(admins);
//
//		this.mockMvc.perform(get("/getAdmin")).andExpect(status().isOk()).andExpect(content().json(
//				"[{ 'userName': 'surendrakg','title': 'Mr.','firstName': 'Surendra','middleName': 'Kumar','lastName': 'Godara','gender': 'Male','dateOfBirth': '1997-10-01','mobileNo': '7275683405','email': 'gsurendra724@gmail.com','password': 'ghghgh',}]"));
//	}

}
