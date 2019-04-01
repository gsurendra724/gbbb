package in.greenbarn.greenbarnadmin.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.greenbarn.greenbarnadmin.model.Admin;
import in.greenbarn.greenbarnadmin.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private EntityManager entityManager;

	public boolean login(Admin admin) {
		return !entityManager.createQuery(
				"from Admin where user_name ='" + admin.getUserName() + "' and password = '" + admin.getPassword() + "'")
				.getResultList().isEmpty();

	}

	public void createAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	public List<Admin> getAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}
	
	public Admin getAdminByUsername(Admin admin) {
		return (Admin) entityManager.createQuery(
				"from Admin where user_name ='" + admin.getUserName() + "'")
				.getSingleResult();
	}
}
