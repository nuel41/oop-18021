package id.ac.stmi.siio.oop.lab8118021.auth18021.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.ac.stmi.siio.oop.lab8118021.auth18021.model.User;

@Repository
public interface UserRepository18021 extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}