package in.greenbarn.greenbarnadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.greenbarn.greenbarnadmin.model.GreenbarnExecutive;

@Repository
public interface GreenbarnExecutiveRepository extends JpaRepository<GreenbarnExecutive, String> {

}
