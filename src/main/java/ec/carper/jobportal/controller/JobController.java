package ec.carper.jobportal.controller;

import ec.carper.jobportal.model.Job;
import ec.carper.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {
	@Autowired
	private JobService jobService;

	 // Create a new job, Allowed user: ADMIN
    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return ResponseEntity.ok(jobService.createJob(job));
    }
    
    // Get all jobs
    @GetMapping("/jobs/all")
    public ResponseEntity<List<Job>> getAllJobs() {
        return ResponseEntity.ok(jobService.getAllJobs());
    }
}









