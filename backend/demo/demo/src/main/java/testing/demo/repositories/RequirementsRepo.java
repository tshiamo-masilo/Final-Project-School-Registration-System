package testing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.demo.entities.Requirements;

import java.util.Optional;

public interface RequirementsRepo extends JpaRepository<Requirements, Long> {
    Optional<Requirements> findById(Long id);

}