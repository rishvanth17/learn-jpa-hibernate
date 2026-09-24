package com.example.db.learn_jpa_hibernate.projects;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class jobcontroller {
	
	private Jobservice service;
	
	public jobcontroller( Jobservice service) {
		this.service = service;
	}
	@PostMapping("/jobs")
	public Minijobportal addjob(@RequestBody Minijobportal job) {
		return service.addjob(job);
	}
	@GetMapping("/jobs")
	public List<Minijobportal> getAlljobs(){
		return service.getAlljobs();
	}
	@GetMapping("/jobs{id}")
	public Optional<Minijobportal> getjobId(@PathVariable("id") int id){
		return service.getjobId(id);
	}
	@DeleteMapping("/jobs{id}")
	public void deletejob(@PathVariable("id") int id ) {
		service.deletejob(id);  
	}
	@PutMapping ("/jobs{id}")
	public Minijobportal updateJob(@PathVariable("id") int id ,@RequestBody Minijobportal job) {
		return service.updateJob(id, job);
	}
	

}
