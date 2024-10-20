package org.chandima.jobapp.repository;

import org.chandima.jobapp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
//public class JobRepo {

//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//            new JobPost(1,"Java  Dev","Must have 1",2, Collections.singletonList("Java")),
//            new JobPost(2,"spring  Dev","Must have 2",2, Collections.singletonList("Java & Spring"))
//    ));
//
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getPost(int postId) {
//        for(JobPost job : jobs) {
//            if(job.getPostId() == postId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost post : jobs){
//            if(post.getPostId() == jobPost.getPostId()){
//                post.setPostDesc(jobPost.getPostDesc());
//                post.setPostProfile(jobPost.getPostProfile());
//                post.setPostTechStack(jobPost.getPostTechStack());
//                post.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        for(JobPost post : jobs){
//            if(post.getPostId() == postId){
//                jobs.remove(post);
//            }
//        }
//    }
//}

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String Keyword);
}
