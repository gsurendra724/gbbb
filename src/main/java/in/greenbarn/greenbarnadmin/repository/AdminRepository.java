package in.greenbarn.greenbarnadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.greenbarn.greenbarnadmin.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
