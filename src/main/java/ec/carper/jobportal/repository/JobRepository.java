package ec.carper.jobportal.repository;

import ec.carper.jobportal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long>{

	
}
