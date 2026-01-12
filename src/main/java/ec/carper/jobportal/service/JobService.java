package ec.carper.jobportal.service;

import ec.carper.jobportal.model.Job;
import ec.carper.jobportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

	@Autowired
    private JobRepository jobRepository;

    //Create a new Job
    public Job createJob(Job job) {
        return jobRepository.save(job); // save(T) method from JPARepository
    }
    
    // Get all jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();// findAll() method from JPARepository
    }
}
