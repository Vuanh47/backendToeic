package org.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.backend.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByEmail(String email);

	java.util.Optional<User> findByEmail(String email);
}
