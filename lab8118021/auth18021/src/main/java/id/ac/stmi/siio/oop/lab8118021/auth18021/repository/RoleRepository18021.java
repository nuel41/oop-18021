package id.ac.stmi.siio.oop.lab8118021.auth18021.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.ac.stmi.siio.oop.lab8118021.auth18021.model.ERole;
import id.ac.stmi.siio.oop.lab8118021.auth18021.model.Role;

@Repository
public interface RoleRepository18021 extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}