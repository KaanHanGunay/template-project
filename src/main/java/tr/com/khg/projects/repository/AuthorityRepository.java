package tr.com.khg.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.khg.projects.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
