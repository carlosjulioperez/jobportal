package ec.carper.jobportal.repository;

import ec.carper.jobportal.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long>{

}
