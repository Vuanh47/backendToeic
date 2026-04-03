package org.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.backend.entity.UserPracticeAttempt;
public interface UserPracticeAttemptRepository extends JpaRepository<UserPracticeAttempt, Long> {
}
