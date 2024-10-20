package org.chandima.jobapp.service;

import org.chandima.jobapp.model.JobPost;
import org.chandima.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getPost(int postId) {
        return jobRepo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java  Dev","Must have 1",2, Collections.singletonList("Java")),
            new JobPost(2,"spring  Dev","Must have 2",2, Collections.singletonList("Java & Spring"))
        ));

        jobRepo.saveAll(jobs);
    }

    public List<JobPost> searchPost(String keyword){
       return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
