package in.greenbarn.greenbarnadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.greenbarn.greenbarnadmin.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
