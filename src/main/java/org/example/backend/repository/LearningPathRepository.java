package org.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.backend.entity.LearningPath;
public interface LearningPathRepository extends JpaRepository<LearningPath, Long> {
}
