package org.chandima.jobapp.controller;

import org.chandima.jobapp.model.JobPost;
import org.chandima.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("posts")
    public List<JobPost> getAllPosts(){
        return jobService.getAllJobs();
    }

    @GetMapping("post/{postId}")
    public JobPost getPost(@PathVariable int postId){
        return jobService.getPost(postId);
    }

    @PostMapping("post")
    public void  addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }

    @PutMapping("post")
    public void updateJobPost(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
    }

    @DeleteMapping("post/{postId}")
    public String deleteJobPost(@PathVariable int postId){
        jobService.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData(){
        jobService.loadData();
        return "Data Loaded";
    }

    @GetMapping("post/keyword/{keyword}")
    public List<JobPost> searchJob(@PathVariable String keyword){
        return jobService.searchPost(keyword);
    }

}
