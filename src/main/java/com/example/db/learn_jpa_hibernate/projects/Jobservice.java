package com.example.db.learn_jpa_hibernate.projects;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class Jobservice {
	private JobRepositary repositary;
	
	public Jobservice(JobRepositary repositary) {
	    this.repositary = repositary;	
	}
	
	public Minijobportal addjob(Minijobportal job) {
		return repositary.save(job);
	}
	public List<Minijobportal> getAlljobs(){
		return repositary.findAll();
	}
		public Optional<Minijobportal> getjobId(int id){
			return repositary.findById(id);
		
	}
	public void deletejob(int id) {
		repositary.deleteById(id);
	}
	public Minijobportal updateJob(int id, Minijobportal job) {

	    Optional<Minijobportal> existingJob = repositary.findById(id);

	    if (existingJob.isPresent()) {

	        Minijobportal oldJob = existingJob.get();

	        oldJob.setCompany(job.getCompany());
	        oldJob.setLocation(job.getLocation());
	        oldJob.setSalary(job.getSalary());

	        return repositary.save(oldJob);
	    }

	    return null;
	}
	

}
