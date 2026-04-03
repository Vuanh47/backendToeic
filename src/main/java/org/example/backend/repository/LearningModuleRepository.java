package org.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.backend.entity.LearningModule;
public interface LearningModuleRepository extends JpaRepository<LearningModule, Long> {
}
